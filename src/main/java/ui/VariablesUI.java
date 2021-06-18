package ui;

import org.openqa.selenium.By;

public class VariablesUI {
    /*Datos de registro*/
    public static String email = "micorreo001@email.com";
    public static String name = "Alvaro";
    public static String lastName = "Quena";
    public static String passWord = "12345";
    public static String address = "Av. 7 principal";
    public static String addressRef = "Av. 9 principal";
    public static String city = "California";
    public static String postalCode ="00000";
    public static String phone = "7894561";
    public static String state = "Alabama";
    public static String country = "United States";

    //public static By buttonAddCart = By.xpath("//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//a[contains(@href,'http://automationpractice.com/index.php?controller=cart&amp;add=1&amp;id_product=1&amp;token=87e87922236d08591b244876dcac63c9')]");
    //public static By buttonAddCart = By.xpath("//a[contains(@href,'http://automationpractice.com/index.php?controller=cart&amp;add=1&amp;id_product=1&amp;token=87e87922236d08591b244876dcac63c9')]");
    //public static By buttonAddCart = By.xpath("//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//span[.='Add to cart']");
    public static By nameProduct = By.xpath("//ul[@id='homefeatured']//a[contains(.,'Faded Short Sleeve T-shirts')]");
    public static By buttonAddToCart = By.xpath("//span[.='Add to cart']");
    public static By buttonCheckout = By.xpath("//span[contains(.,'Proceed to checkout')]");
    public static By buttonCheckout2 = By.xpath("//span[.='Proceed to checkout']");
    public static By buttonCreateAnAccount = By.xpath("//span[contains(.,'Create an account')]");
    public static By editTextEmail = By.xpath("//input[@id='email_create']");

    //Para crear la Cuenta
    public static By editTextName = By.id("customer_firstname");
    public static By editTextLastName = By.id("customer_lastname");
    public static By editTextPassWord = By.id("email");
    public static By editTextAddress = By.id("address1");
    public static By editTextCity = By.id("city");
    public static By editTextPostal = By.id("postcode");
    public static By editTextPhone = By.id("phone_mobile");
    public static By editTextAddressRef = By.id("alias");
    public static By comboBoxState = By.id("id_state");
    public static By comboBoxCountry = By.id("id_country");
    public static By buttonRegister = By.xpath("//span[.='Register']");
}
