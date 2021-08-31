package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutShippingTab extends CommonPage {

    @FindBy(how = How.ID, using = "cgv")
    private WebElement chboxTermsOfService;

    public CheckoutShippingTab SelectTermsOfService(){
        chboxTermsOfService.click();
        return this;
    }

    @FindBy(how = How.CLASS_NAME, using = "standard-checkout")
    private WebElement btnProceedToCheckout;

    public CheckoutPaymentTab ProceedToCheckout(){
        btnProceedToCheckout.click();
        return new CheckoutPaymentTab();
    }

}
