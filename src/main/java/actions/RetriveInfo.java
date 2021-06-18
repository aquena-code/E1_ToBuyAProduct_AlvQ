package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetriveInfo {
    public static String textoDeConfirmacion(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }
}
