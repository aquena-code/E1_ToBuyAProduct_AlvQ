package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class ConfirmOrder {
    public static void as(WebDriver driver){
        Click.on(driver, VariablesUI.buttonConfirmOrder);
    }
}
