package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Click {
    public static void on(WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }

    public static void onAcceptAlert(WebDriver webDriver){
        webDriver.switchTo().alert().accept();
    }

    public static void  onSelectOption(WebDriver webDriver, By locator, String option) {

        Select drop = new Select(webDriver.findElement(locator));
        drop.selectByVisibleText(option);
        webDriver.findElement(locator).click();
    }

    public static void onSelectCheckBox(WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }
}
