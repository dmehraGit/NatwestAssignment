package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TShirtsPage extends CommonPage {

    @FindBy(how = How.CSS, using = "a[title='Add to cart']")
    private WebElement linkAddToCart;

    public ShoppingCartPopup AddItemToCart(){
        linkAddToCart.click();
        ShoppingCartPopup popup = new ShoppingCartPopup();
        waitUnitlElementIsVisibleByLocator(popup.shoppingCartSectionIdentifier);
        return popup;
    }
}
