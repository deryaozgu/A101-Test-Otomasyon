import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage extends BasePage {
    private String adresBasligi;
    private String ad;
    private String soyad;
    private String cepTelefonu;
    private String adres;
    private String postaKodu;
    private String il;
    private String mahalle;
    private String ilce;
    By isOnAddressLocator= By.linkText("TESLİMAT ADRESİ");
    By new_adress_Locator=By.className("new-address");
    By title=By.name("title");
    By firstName=By.name("first_name");
    By lastName=By.name("last_name");
    By adressLine=By.name("line");
    By postcode=By.name("postcode");

    By phoneNumber=By.name("phone_number");
    By ilSecenek=By.linkText(this.il);
    By ilceSecenek=By.linkText(this.ilce);
    By mahalleSecenek=By.linkText(this.mahalle);
    By kaydetButon=By.linkText("KAYDET");

    By kaydetVeDevamEt=By.linkText("Kaydet ve Devam Et");

    public AddressPage(WebDriver driver,String adresBasligi, String ad, String soyad, String cepTelefonu, String il, String ilce, String mahalle, String address, String postaKodu) {
        super(driver);
        this.adresBasligi=adresBasligi;
        this.ad=ad;
        this.soyad=soyad;
        this.cepTelefonu=cepTelefonu;
        this.il=il;
        this.ilce=ilce;
        this.mahalle=mahalle;
        this.adres=address;
        this.postaKodu=postaKodu;
    }

    public void createAddress() {
        type(title,this.adresBasligi);
        type(firstName,this.ad);
        type(lastName,this.soyad);
        type(phoneNumber,this.cepTelefonu);
        click(ilSecenek);
        click(ilceSecenek);
        click(mahalleSecenek);
        type(adressLine,this.adres);
        type(postcode,this.postaKodu);
        click(kaydetButon);

    }

    public void save_and_continue() {
        click(kaydetVeDevamEt);
    }

    public boolean isOnAddressPage() {
        return isDisplayed(isOnAddressLocator);
    }

    public void create_new_Address() {
        click(new_adress_Locator);
    }
}
