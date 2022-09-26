import org.openqa.selenium.By;

public class SmartLightingPage extends BasePage{
    public By pageBanner = By.xpath("//*[contains(@class,'pageBanner')]//b");
    public By seeAllResultsLink = By.xpath(".//a[@class='a-link-normal']");
    public By resultsListHeader = By.xpath(".//*[@class='s-no-outline']");

    public String getResultsListHeader(){
        return driver.findElement(resultsListHeader).getAttribute("innerText");
    }
}
