package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutAddressTab extends CommonPage {

    @FindBy(how = How.CSS, using = "button[name='processAddress']")
    private WebElement btnProceedToCheckout;

    public CheckoutShippingTab proceedToCheckout(){
        btnProceedToCheckout.click();
        return new CheckoutShippingTab();
    }
}
