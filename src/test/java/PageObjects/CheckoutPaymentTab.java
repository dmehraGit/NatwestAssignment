package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPaymentTab extends CommonPage {

    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    private WebElement linkPayByBankWire;

    public OrderSummaryPage selectBankWirePayment(){
        linkPayByBankWire.click();
        return new OrderSummaryPage();
    }

    @FindBy(how = How.ID, using = "total_price")
    private WebElement orderTotal;

    public String getOrderTotal(){
        return orderTotal.getText();
    }
}
