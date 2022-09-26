import org.openqa.selenium.By;

public class ShopByCategoryPage extends BasePage{
    public By pageBanner = By.xpath("//*[contains(@class,'pageBanner')]//b");
    public By bestSellerProducts = By.xpath("//span[text()='Best Seller']");
    public By bestSellerBanner = By.xpath("//span[@id='zg_banner_text']");

    public String getbestSellerBannerText(){
        return driver.findElement(bestSellerBanner).getText();
    }
}
