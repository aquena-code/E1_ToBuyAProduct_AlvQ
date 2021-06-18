package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class AddProductToCard{
    public static void as(WebDriver driver) throws InterruptedException{
        Click.on(driver, VariablesUI.buttonAddToCart);
        Thread.sleep(7000);
        Click.on(driver, VariablesUI.buttonCheckout);
        Click.on(driver, VariablesUI.buttonCheckout2);
    }

}
