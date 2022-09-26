import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void verifyBooksBadge() {
        driver.findElement(categoriesSelector).findElement(categoryBook).click();
        driver.findElement(searchButton).click();
        System.out.println("Take first item from Best sellers in Books");
        driver.findElement(booksPage.seeMoreForBestsellersBlock).findElements(booksPage.bookCards).get(1).click();
        Assert.assertTrue(driver.findElement(booksPage.badgeAmazonCharts).isDisplayed());
    }

    @Test
    public void verifyForgotPasswordFormHeader() {
        driver.findElement(dismissButton).click();
        driver.findElements(navigationMenuItem).get(4).click();
        sellPage.clickOnSignUp();
        signUpPage.clickOnForgotPasswordLink();
        Assert.assertEquals(signUpPage.getForgotPasswordFormHeader(), "Password assistance");
    }

    @Test
    public void verifyBestSellerBannerText() {
        driver.findElement(shopByCategoryCard).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(shopByCategoryPage.pageBanner));
        driver.findElements(shopByCategoryPage.bestSellerProducts).get(3).click();
        Assert.assertEquals(getBannerText(shopByCategoryPage.bestSellerBanner), "Amazon Best Sellers");
    }

    @Test
    public void verifyResultsListHeader() {
        clickOnElement(hamburgerMenu);
        driver.findElements(hamburgerMenuItem).get(5).click();
        clickOnElement(smartHomeLighting);
        wait.until(ExpectedConditions.visibilityOfElementLocated(smartLightingPage.pageBanner));
        clickOnElement(smartLightingPage.seeAllResultsLink);
        Assert.assertEquals(smartLightingPage.getResultsListHeader(), "RESULTS");
    }

    @Test
    public void verifyAriaHiddenForListPriceProducts() {
        clickOnElement(dismissButton);
        clickOnElement(navigationMenuItem);
        wait.until(ExpectedConditions.presenceOfElementLocated(todayDealsPage.pageHeader));
        Assert.assertNotEquals(driver.findElements(todayDealsPage.productsWithListPrice).get(1).getAttribute("ariaHidden"), "false");
    }

    @Test
    public void verifyAmazonMusicNavMenuItems() {
        driver.findElements(hamburgerMenuItem).get(0).click();
        for (int i = 1; i <= driver.findElements(amazonMusicPage.subMenuItemsAmazonMusic).size(); i++) {
            driver.findElements(amazonMusicPage.subMenuItemsAmazonMusic).get(i).click();
            Assert.assertTrue(isElementPresent(amazonMusicPage.amazonMusicImage));
        }
    }

    @Test
    public void verifyButtonChangeDuringLogin() {
        signUpPage.clickOnCreateAccountButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(signUpPage.createAccountFormHeader));
        signUpPage.fillField(signUpPage.userNameField, signUpPage.getLoginName());
        signUpPage.fillField(signUpPage.emailField, signUpPage.getLoginEmail());
        Assert.assertEquals(driver.findElement(signUpPage.continueVerifyButton)
                .findElement(By.xpath("//span[@class='email-text']")).getText(), "Verify email");
    }

    @Test
    public void addTolistByNonLoggedUser() {
        clickOnElement(dressesCategoryCard);
        clickOnElement(dressesPage.dressesItem);
        clickOnElement(dressesPage.addToListButton);
        Assert.assertTrue(driver.findElement(signUpPage.signInForm).isDisplayed());

    }

    @Test
    public void verifyDefaultLocation() {
        Select countrySelect = new Select(driver.findElement(locationPage.countrySelector));
        Assert.assertEquals(countrySelect.getFirstSelectedOption(), "Ukraine");
    }

    @Test
    public void verifyDefaultLanguage() {
        clickOnElement(languageChange);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(languagePage.languageList));
        Assert.assertEquals(languagePage.findItemInTheList("en_US").getAttribute("checked"), "true");
    }

}
