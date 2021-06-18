package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class EnterDatesToCreateAccount {
    public static void as(WebDriver driver){
        Enter.text(driver, VariablesUI.editTextName, VariablesUI.name);
        Enter.text(driver, VariablesUI.editTextLastName, VariablesUI.lastName);
        Enter.text(driver, VariablesUI.editTextPassWord, VariablesUI.passWord);
        Enter.text(driver, VariablesUI.editTextAddress, VariablesUI.address);
        Enter.text(driver, VariablesUI.editTextCity, VariablesUI.city);
        Enter.text(driver, VariablesUI.editTextPostal, VariablesUI.postalCode);
        Enter.text(driver, VariablesUI.editTextPhone, VariablesUI.phone);
        Enter.text(driver, VariablesUI.editTextAddressRef, VariablesUI.addressRef);
        Click.onSelectOption(driver, VariablesUI.comboBoxState, VariablesUI.state );
        Click.onSelectOption(driver, VariablesUI.comboBoxCountry, VariablesUI.country );
        Click.on(driver, VariablesUI.buttonRegister);
    }
}
