package task;

import actions.Click;
import actions.Enter;
import com.google.errorprone.annotations.Var;
import com.sun.org.apache.xpath.internal.operations.Variable;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class ClickOnAddCart {
    public static void as(WebDriver driver) throws InterruptedException {
        //Click.on(driver, VariablesUI.buttonAddCart);
        /*Seleccionar un producto*/
        Click.on(driver, VariablesUI.nameProduct);
        /*Adiciona al Carrito de Compras*/
        Click.on(driver, VariablesUI.buttonAddToCart);
        Thread.sleep(7000);
        Click.on(driver, VariablesUI.buttonCheckout);
        /**/
        Click.on(driver, VariablesUI.buttonCheckout2);
        /*Ingresa email para crear Cuenta*/
        Enter.text(driver, VariablesUI.editTextEmail, VariablesUI.email);
        Thread.sleep(500);
        Click.on(driver, VariablesUI.buttonCreateAnAccount);
        /*Ingresa datos para crear Cuenta*/
        Thread.sleep(10000);
        Enter.text(driver, VariablesUI.editTextName, VariablesUI.name);
        Enter.text(driver, VariablesUI.editTextLastName, VariablesUI.lastName);
        //Enter.text(driver, VariablesUI.editTextEmail, VariablesUI.email);
        Enter.text(driver, VariablesUI.editTextPassWord, VariablesUI.passWord);
        Enter.text(driver, VariablesUI.editTextAddress, VariablesUI.address);
        Enter.text(driver, VariablesUI.editTextCity, VariablesUI.city);
        Enter.text(driver, VariablesUI.editTextPostal, VariablesUI.postalCode);
        Enter.text(driver, VariablesUI.editTextPhone, VariablesUI.phone);
        Enter.text(driver, VariablesUI.editTextAddressRef, VariablesUI.addressRef);
        Click.onSelectOption(driver, VariablesUI.comboBoxState, VariablesUI.state );
        Click.onSelectOption(driver, VariablesUI.comboBoxCountry, VariablesUI.country );
        //Click.on(driver, VariablesUI.buttonRegister);



    }
}
