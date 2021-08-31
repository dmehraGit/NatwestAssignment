package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderHistoryPage extends CommonPage {

    @FindBy(how = How.TAG_NAME, using = "tbody")
    private WebElement tblBody;

    private WebElement getLastOrder(){
    	By lastOrderLocator = By.className("first_item");
    	waitUnitlElementIsVisibleByLocator(lastOrderLocator);
    	
        return tblBody.findElement(lastOrderLocator);
    }

    public String getOrderReferenceID(){
        return getLastOrder().findElement(By.className("history_link")).getText();
    }


}
