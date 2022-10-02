import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    By reklam= By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By reklam1=By.id("popupTitle");
    MenuList menuList;


    public HomePage(WebDriver driver) {
        super(driver);
        menuList= new MenuList(driver);
    }

    public MenuList menuList() {
        return this.menuList;

    }

    public void close() {
        click(reklam);
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //click(reklam1);
    }
}
