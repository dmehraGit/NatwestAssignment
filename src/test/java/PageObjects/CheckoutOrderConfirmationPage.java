package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckoutOrderConfirmationPage extends CommonPage {

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement pageHeading;

    public String getPageHeadingText(){
        return pageHeading.getText();
    }

    @FindBy(how = How.CLASS_NAME, using = "box")
    private WebElement infoBox;

    public String getOrderReference(){
        String infoBoxText = infoBox.getText();
        Matcher m = Pattern.compile("[A-Z]{9}").matcher(infoBoxText);
        return m.find() ? m.group(0) : null;
    }
}
