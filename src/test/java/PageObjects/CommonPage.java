package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Natwest.SeleniumAssignment.TestBase;



public abstract class CommonPage extends TestBase {

    CommonPage(){
        PageFactory.initElements(Driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "sf-menu")
    private WebElement topBarCategoryMenu;

    public TShirtsPage navigateToTShirts(){
        topBarCategoryMenu.findElement(By.cssSelector("li:last-child a[title='T-shirts']")).click();
        return new TShirtsPage();
    }

    protected void clearAndSendKeys(WebElement textBox, String textToEnter){
        textBox.clear();
        textBox.sendKeys(textToEnter);
    }

    protected void waitUnitlElementIsVisibleByLocator(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
