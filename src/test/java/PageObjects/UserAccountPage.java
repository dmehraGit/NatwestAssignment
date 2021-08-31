package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserAccountPage extends CommonPage {

    @FindBy(how = How.CSS, using = "a[title='Orders']")
    private WebElement btnOrderHistory;

    public OrderHistoryPage ViewOrderHistory(){
        btnOrderHistory.click();
        return new OrderHistoryPage();
    }

    @FindBy(how = How.CSS, using = "a[title='Information']")
    private WebElement btnPersonalInformation;

    public PersonalInfoPage ViewPersonalInfoPage(){
    	By personaInfoLocator = By.cssSelector("a[title='Information']");
    	waitUnitlElementIsVisibleByLocator(personaInfoLocator);
    	
        btnPersonalInformation.click();
        return new PersonalInfoPage();
    }
}
