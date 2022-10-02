import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;




public class Test_Add_Product_To_Card extends BaseTest{
    HomePage homepage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    AddressPage addressPage;

    PaymentPage paymentPage;

    @Test
    @Order(1)
    public void turn_off_ad()
    {
        homepage=new HomePage(driver);
        homepage.close();
        driver.navigate().refresh();

    }
    @Test
    @Order(2)
    public void go_to_product()
    {

        productsPage=new ProductsPage(driver);
        homepage.menuList().productClick();
        //Assertions.assertTrue(productsPage.isOnProductPage(),"Ürün sayfasında değilsiniz.");

    }
     @Test
    @Order(3)
   public void select_a_product()
    {
        productDetailPage=new ProductDetailPage(driver);
        productsPage.chooseColor();
        //Assertions.assertTrue(productsPage.chosenColorCorrect(),"Seçilen renk siyah değil.");
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Ürün detay sayfasında değilsiniz.");

    }
    @Test
    @Order(4)
    public void add_product_to_cart()
    {
        productDetailPage.addToCart();
    }
    @Test
    @Order(5)
    public void go_to_cart()
    {
        cartPage=new CartPage(driver);
        productDetailPage.goToCart();
        Assertions.assertTrue(cartPage.isOnCartPage(),"Sepetim sayfasında değilsiniz.");
    }
    @Test
    @Order(6)
    public void confirm_cart()
    {
        checkoutPage=new CheckoutPage(driver);
        cartPage.confirmCart();
        Assertions.assertTrue(checkoutPage.isOnCheckOutPage(),"Üye girişi sayfasında değilsiniz.");
    }
    @Test
    @Order(7)
    public void member_login()
    {
        addressPage=new AddressPage(driver,"Ev","Derya","Özgü","05948625720","İSTANBUL","ÜSKÜDAR","ÇENGELKÖY MAH","anjahak heujn doek uej","5862");
        checkoutPage.continue_without_a_member();
        checkoutPage.go_on_with_email();
        Assertions.assertTrue(addressPage.isOnAddressPage(),"Adres sayfasında değilsiniz.");

    }
    @Test
    @Order(8)
    public void create_address()
    {
        paymentPage=new PaymentPage(driver);
        addressPage.create_new_Address();
        addressPage.createAddress(); //kaydet butonunu içine ekle
        addressPage.save_and_continue();
        Assertions.assertTrue(paymentPage.isOnPaymentPage(),"Ödeme sayfasında değilsiniz.");


    }

}
