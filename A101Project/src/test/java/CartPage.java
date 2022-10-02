import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    By isOnCartPageLocator= By.className("js-basket-sum");
    By confirmCartLocator=By.xpath("//a[@title='Sepeti Onayla']");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCartPage() {
    return isDisplayed(isOnCartPageLocator);
    }

    public void confirmCart() {
        click(confirmCartLocator);
    }
}
