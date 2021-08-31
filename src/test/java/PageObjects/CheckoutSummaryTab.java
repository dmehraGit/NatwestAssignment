package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutSummaryTab extends CommonPage {

    @FindBy(how = How.CLASS_NAME, using = "standard-checkout")
    private WebElement btnProceedToCheckout;

    public CheckoutAddressTab proceedToCheckout(){
        btnProceedToCheckout.click();
        return new CheckoutAddressTab();
    }
}
