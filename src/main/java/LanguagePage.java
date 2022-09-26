import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LanguagePage extends HomePage {
    public By languageList = By.xpath(".//div[@class='a-row a-spacing-mini']");
    public String itemInList = ".//[@value='%s']";

    public WebElement findItemInTheList(String value){
      WebElement languageItem = driver.findElements(languageList).get(0).findElement(By.xpath(String.format(itemInList, value)));
      return languageItem;
    }
}
