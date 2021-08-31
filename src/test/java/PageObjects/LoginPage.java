package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends CommonPage {
	
    public void Navigate() throws InterruptedException{
        Driver.get("http://automationpractice.com/index.php?controller=my-account");
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement txtUserName;
    

    public void enterUserName(String userName){
    	By userNameEmailLocator = By.id("email");
    	waitUnitlElementIsVisibleByLocator(userNameEmailLocator);
    	
        txtUserName.sendKeys(userName);
        
    }

    @FindBy(how = How.ID, using = "passwd")
    private WebElement txtPassword;

    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement btnSubmitLogin;

    public void clickLoginButton(){
        btnSubmitLogin.click();
    }

    public UserAccountPage SignIn(String userName, String password){
        enterUserName(userName);
        enterPassword(password);
        clickLoginButton();
        return new UserAccountPage();
    }

}
