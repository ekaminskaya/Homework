import org.openqa.selenium.By;

public class BooksPage extends BasePage{
    public By seeMoreForBestsellersBlock = By.xpath("//*[@aria-label='See more Best sellers in Books']");
    public By bookCards = By.xpath(".//h2/following-sibling::*[contains(@class,'carousel')]//div[contains(@id,'acs-product-block')]");
    public By badgeAmazonCharts= By.xpath("//*[contains(@class,'amazon-charts-badge')]");


}
