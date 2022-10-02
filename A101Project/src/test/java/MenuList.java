import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MenuList extends BasePage {
    KadinGiyim kadinGiyim;
    By giyimAksesuar=By.xpath("//a[@title='GİYİM & AKSESUAR']");
    By kadinicGiyim=By.xpath("//a[@title='Kadın İç Giyim']");
    By menuLocator= By.linkText("Dizaltı Çorap");
    public MenuList(WebDriver driver) {
        super(driver);
    }

    public void productClick() {
       /* click(giyimAksesuar);
        kadinGiyim=new KadinGiyim(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(kadinicGiyim);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(menuLocator);*/
        driver.get("https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/");
    }
}
