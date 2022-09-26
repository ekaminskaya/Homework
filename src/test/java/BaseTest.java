import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest extends BasePage {
    static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public static String baseUrl = "https://www.amazon.com/";

//pages
    BooksPage booksPage = new BooksPage();
    SellPage sellPage = new SellPage();
    SignUpPage signUpPage = new SignUpPage();
    ShopByCategoryPage shopByCategoryPage = new ShopByCategoryPage();
    SmartLightingPage smartLightingPage = new SmartLightingPage();
    TodayDealsPage todayDealsPage = new TodayDealsPage();
    AmazonMusicPage amazonMusicPage = new AmazonMusicPage();
    DressesPage dressesPage = new DressesPage();
    LocationPage locationPage = new LocationPage();
    LanguagePage languagePage = new LanguagePage();


    @BeforeTest
    public static void openDriver(){
        setUpDriver();
        driver.get(baseUrl);
    }

    @AfterTest
    public static void closeDriver(){
        driver.quit();
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }

    public void findElements(By locator){
        if (isElementPresent(locator)) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is absent");
        }
    }
}
