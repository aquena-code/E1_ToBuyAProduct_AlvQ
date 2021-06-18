package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class ChoosePayBank {
    public static void as(WebDriver driver){
        Click.on(driver, VariablesUI.textPayBank);
    }
}
