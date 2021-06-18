package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class EnterEmailToCreateAccount {

    public static void as(WebDriver driver) throws InterruptedException {
        Enter.text(driver, VariablesUI.editTextEmail, VariablesUI.email);
        Thread.sleep(500);
        Click.on(driver, VariablesUI.buttonCreateAnAccount);
        Thread.sleep(10000);
    }
}
