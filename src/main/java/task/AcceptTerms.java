package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class AcceptTerms {
    public static void as(WebDriver driver){
        Click.onSelectCheckBox(driver, VariablesUI.checkBoxTerms);
        Click.on(driver, VariablesUI.buttonProceedCheckout);
    }
}
