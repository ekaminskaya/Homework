import org.openqa.selenium.By;

public class HomePage extends BaseDriver {
    public By categoriesSelector = By.xpath("//div[@id='nav-search-dropdown-card']/");
//    public By CATEGORIES_OPTION = By.xpath(".//option[@value='%s'");
    public By categoryBook = By.xpath("//option[@value='search-alias=stripbooks-intl-ship']");
    public By searchButton = By.xpath("//*[@type='submit']");
    public By dismissButton = By.xpath("//*[@data-action-type='DISMISS']");
    public By navigationMenuItem = By.xpath("//*[@class='nav-a  ']");
    public By hamburgerMenu = By.xpath("//*[@id='nav-hamburger-menu']");
    public By shopByCategoryCard = By.xpath("//h2[text()='Shop by Category']/ancestor::div[@class='a-cardui-header']/following-sibling::div/a[text()='Shop now']");
    public By dressesCategoryCard = By.xpath("//h2[text()='Dresses']/../following::a[text()='Shop now']");
    public By hamburgerMenuItem = By.xpath(".//a[@class='hmenu-item']/div");
    public By smartHomeLighting = By.xpath(".//a[text()='Smart Home Lighting']");
    public By languageChange = By.xpath("//*[@class='nav-line-2']//div[text()='EN']");

    public void clickOnSearch(){
        driver.findElement(searchButton).click();
    }

    public void clickOnElement(By element){
        driver.findElement(element).click();
    }

    public String getBannerText(By element) {
        return driver.findElement(element).getText();
    }


}
