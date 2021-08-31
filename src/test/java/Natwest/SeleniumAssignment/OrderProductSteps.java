package Natwest.SeleniumAssignment;

import PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class OrderProductSteps {

    private LoginPage loginPage = new LoginPage();
    private Header header = new Header();
    private UserAccountPage userAccountPage;
    private ShoppingCartPopup shoppingCartPopup;
    private CheckoutOrderConfirmationPage checkoutOrderConfirmationPage;
    public static String orderReference;
    public static String orderTotal;


    @Given("^User has signed in$")
    public void user_has_signed_in() throws Exception {
        loginPage.Navigate();
        userAccountPage = loginPage.SignIn(TestBase.UserName, TestBase.Password);
    }

    @Given("^User has added a t-shirt to shopping cart$")
    public void user_has_added_a_t_shirt_to_shopping_cart() throws Exception {
        TShirtsPage tShirtsPage = userAccountPage.navigateToTShirts();
        //tShirtsPage.ViewProductsAsList();
        shoppingCartPopup = tShirtsPage.AddItemToCart();
    }

    @When("^User confirms payment for the order$")
    public void user_confirms_payment_for_the_order() throws Exception {
        CheckoutSummaryTab checkoutSummaryTab = shoppingCartPopup.ProceedToCheckout();
        CheckoutAddressTab checkoutAddressTab = checkoutSummaryTab.proceedToCheckout();
        CheckoutShippingTab checkoutShippingTab = checkoutAddressTab.proceedToCheckout();
        
        CheckoutPaymentTab checkoutPaymentTab = checkoutShippingTab.SelectTermsOfService().ProceedToCheckout();
        orderTotal = checkoutPaymentTab.getOrderTotal();
        
        OrderSummaryPage orderSummaryPage = checkoutPaymentTab.selectBankWirePayment();
        checkoutOrderConfirmationPage = orderSummaryPage.ConfirmMyOrder();
    }

    @Then("^the purchase should be successful$")
    public void the_purchase_should_be_successful() throws Exception {
        Assert.assertEquals("ORDER CONFIRMATION", checkoutOrderConfirmationPage.getPageHeadingText().toUpperCase());
        orderReference = checkoutOrderConfirmationPage.getOrderReference();
        Assert.assertNotNull(orderReference);
    }
    
    @Then("^the item should be displayed in order history$")
    public void the_item_is_displayed_in_order_history() throws Exception {
        userAccountPage = header.clickViewMyAccountButton();
        OrderHistoryPage orderHistoryPage = userAccountPage.ViewOrderHistory();
        Assert.assertEquals(OrderProductSteps.orderReference, orderHistoryPage.getOrderReferenceID());
    }
}
