package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class ConfirmAddress {
    public static void as(WebDriver driver) throws InterruptedException {
        Click.on(driver, VariablesUI.buttonCheckoutDir);
        Thread.sleep(1000);
    }
}
