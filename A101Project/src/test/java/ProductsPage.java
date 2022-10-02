import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{
    By isOnPageLocator= By.id("attributes_CINSIYETKadın");
    By chooseColorLocator= By.id("attributes_integration_colourSİYAH");
    By choosenCorrectLocator=By.linkText("Aktif Filtreler : ");
    By allProductsLocator=By.className("lazyloaded");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(isOnPageLocator);
    }

    public void chooseColor() {
        click(chooseColorLocator);
    }

    public boolean chosenColorCorrect() {
        return isDisplayed(choosenCorrectLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }
    private List<WebElement> getAllProducts()
    {
       return findAll(allProductsLocator);
    }
}
