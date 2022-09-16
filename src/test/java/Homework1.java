import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class Homework1 {

//    @BeforeTest
//    public void beforeTest() {
//        System.setProperty("webdriver.chrome.driver", "/Users/elenakaminskaya/Desktop/Automation/HomeWork/Homework/src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://rozetka.com.ua/");
//        driver.findElement(By.cssSelector("[alt='ua']")).click();
//    }
//
//    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }

    @Test
    public void selectorTest1() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenakaminskaya/Desktop/Automation/HomeWork/Homework/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']//option[@value='search-alias=stripbooks-intl-ship']")).click();
        driver.findElement(By.xpath(".//*[@type='submit']")).click();
        driver.findElements(By.xpath("//*[@aria-label='See more Best sellers in Books']/ancestor::h2/following-sibling::*[contains(@class,'carousel')]//div[contains(@id,'acs-product-block')]")).get(0).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class,'amazon-charts-badge')]")).isDisplayed());
        driver.quit();
    }

    @Test
    public void selectorTest2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/elenakaminskaya/Desktop/Automation/HomeWork/Homework/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-action-type='DISMISS']")).click();
        driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_cs_sell']")).click();
        driver.findElement(By.xpath("//div[@class='align-end']/a[contains(text(),'Sign up')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Forgot your password?')]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//form[@name='forgotPassword']/h1")).getAttribute("innerText"), "Password assistance");
        driver.quit();
    }

    @Test
    public void selectorTest3() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenakaminskaya/Desktop/Automation/HomeWork/Homework/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//h2[text()='Shop by Category']/ancestor::div[@class='a-cardui-header']/following-sibling::div/a[text()='Shop now']")).click();
        driver.findElements(By.xpath("//span[text()='Best Seller']")).get(3).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[@id='zg_banner_text']")).getAttribute("tagName"), "SPAN");
        driver.quit();
    }

    @Test
    public void selectorTest4() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenakaminskaya/Desktop/Automation/HomeWork/Homework/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
        driver.findElement(By.xpath(".//a[@data-menu-id='7']")).click();
        driver.findElement(By.xpath(".//a[text()='Smart Home Lighting']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath(".//a[@class='a-link-normal']")).click();
        Assert.assertEquals(driver.findElement(By.xpath(".//*[@class='s-no-outline']")).getAttribute("innerText"), "RESULTS");
        driver.quit();
    }

    @Test
    public void selectorTest5() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenakaminskaya/Desktop/Automation/HomeWork/Homework/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//*[@data-action-type='DISMISS']")).click();
        driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[text()=\"Today's Deals\"]")).click();
        WebElement element = driver.findElements(By.xpath(".//*[@data-testid='deal-card']//span[contains(@data-a-strike,'true')]")).get(1);
        Assert.assertNotEquals(element.getCssValue("textContent"), "150");
        driver.quit();
    }

}
