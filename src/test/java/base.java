import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {
    public WebDriver webDriver;

    @BeforeMethod
    //@Test
    public void basePage(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/index.php");
        //webDriver.manage().window().maximize();
        webDriver.manage().window();
        webDriver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void tearDown(){
        //if(webDriver != null)
        //    webDriver.quit();
    }

}
