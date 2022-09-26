import org.openqa.selenium.By;

public class SignUpPage extends HomePage {

    public By signInForm = By.xpath(".//*[@class='a-box']");
    public By userNameField = By.xpath(".//input[@id='ap_customer_name']");
    public By emailField = By.xpath("//*[@id='ap_email']");
    public By passwordField = By.xpath("//*[@id='ap_password']");
    public By reenterPasswordField = By.xpath("//*[@id='ap_password_check']");
    public By nextButton = By.xpath("//*[@id='signInSubmit']");
    public By forgotPasswordLink = By.xpath("//*[contains(text(),'Forgot your password?')]");
    public By createAccountButton = By.xpath("//*[@id='createAccountSubmit']");
    public By continueVerifyButton = By.xpath("//*[@id='auth-continue-announce']");
    public By forgotPasswordFormHeader = By.xpath("//form[@name='forgotPassword']/h1");
    public By createAccountFormHeader = By.xpath("//h1[contains(text(),'Create account')]");

    String loginName = "Lena";
    String loginEmail = "chmunevich_lena@ukr.net";
    String password = "Password123!";

    public String getLoginName() {
        return loginName;
    }
    public String getLoginEmail() {
        return loginEmail;
    }

    public String getPassword() {
        return password;
    }

    public void fillField(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    public void clickOnForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void clickOnCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }

    public String getForgotPasswordFormHeader() {
        return driver.findElement(forgotPasswordFormHeader).getAttribute("innerText");
    }
}
