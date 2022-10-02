import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By isOnDetailPageLocator= By.className("icon-sepetekle");
    By addToCartLocator= By.className("add-to-basket");
    //By closeLocator=By.linkText("Sepeti Görüntüle");
    By goToCartLocator=By.className("go-to-shop");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(isOnDetailPageLocator);
    }

    public void addToCart() {
        click(addToCartLocator);
    }

    public void goToCart() {
        click(goToCartLocator);
    }
}
