package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryPage extends CommonPage {

    @FindBy(how = How.ID, using = "cart_navigation")
    private WebElement cartNavigationSection;

    public CheckoutOrderConfirmationPage ConfirmMyOrder(){
        cartNavigationSection.findElement(By.cssSelector("button[type='submit']")).click();
        return new CheckoutOrderConfirmationPage();
    }
}
