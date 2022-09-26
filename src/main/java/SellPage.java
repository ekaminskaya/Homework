import org.openqa.selenium.By;

public class SellPage extends HomePage {
    public By signUpButtonSell = By.xpath("//div[@class='align-end']/a[contains(text(),'Sign up')]");

    public void clickOnSignUp(){
        driver.findElement(signUpButtonSell).click();
    }
}
