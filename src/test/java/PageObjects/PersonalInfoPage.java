package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalInfoPage extends CommonPage {

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstNameInput;

    public PersonalInfoPage setFirstName(String firstName){
        clearAndSendKeys(firstNameInput, firstName);
        return new PersonalInfoPage();
    }

    @FindBy(how = How.ID, using = "old_passwd")
    private WebElement passwordInput;

    public PersonalInfoPage setPassword(String oldPassword){
        clearAndSendKeys(passwordInput, oldPassword);
        return new PersonalInfoPage();
    }

    @FindBy(how = How.CSS, using = "button[name='submitIdentity']")
    private WebElement btnSave;

    public PersonalInfoPage clickSave(){
        btnSave.click();
        return new PersonalInfoPage();
    }
    
    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    private WebElement alertSuccessMessage;

    public boolean isSuccessMessageDisplayed(){
    	By successMessageLocator = By.className("alert-success");
    	waitUnitlElementIsVisibleByLocator(successMessageLocator);
    	
        return alertSuccessMessage.isDisplayed();
    }
}
