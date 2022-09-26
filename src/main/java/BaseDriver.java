import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    static WebDriver driver;
    public static WebDriver setUpDriver(){
        //System.setProperty("webdriver.chrome.driver", "/Users/elenakaminskaya/Desktop/Automation/HomeWork/Homework/src/main/resources/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

}
