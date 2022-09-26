import org.openqa.selenium.By;

public class AmazonMusicPage extends HomePage {
   public By subMenuItemsAmazonMusic = By.xpath(".//ul[@data-menu-id='2']//a[@class='hmenu-item']");
   public By navMenuItems = By.xpath("//*[@data-category='dmusic']//a[@class='nav-a']");
   public By aMULogo = By.xpath(".//img[contains(@src,'AMU_logo')]");
   public By amazonMusicImage = By.xpath(".//img[@class='nav-categ-image']");

}
