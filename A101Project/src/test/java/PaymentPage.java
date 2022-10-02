import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
  By isOnPaymentPageLocator= By.className("section-hero");
    public boolean isOnPaymentPage() {
        return isDisplayed(isOnPaymentPageLocator);
    }
}
