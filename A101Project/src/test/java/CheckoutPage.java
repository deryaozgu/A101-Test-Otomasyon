import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    By isOnCheckPageLocator= By.linkText("ÜYE GİRİŞİ");
    By c_w_a_memberLocator=By.xpath("//a[@title='ÜYE OLMADAN DEVAM ET']");
    By userEmailLocator=By.name("user_email");
    By devamEt=By.linkText("DEVAM ET");
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCheckOutPage() {
        return isDisplayed(isOnCheckPageLocator);
    }

    public void continue_without_a_member() {
        click(c_w_a_memberLocator);
    }

    public void go_on_with_email() {
        type(userEmailLocator,"ozguderya@gmail.com");
        click(devamEt);

    }
}
