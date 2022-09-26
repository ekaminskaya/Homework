import org.openqa.selenium.By;

public class TodayDealsPage extends HomePage {
    public By pageHeader = By.xpath("//h1[text()=\"Today's Deals\"]");
    public By productsWithListPrice = By.xpath(".//*[@data-testid='deal-card']//span[text()='List Price: ']");

}

