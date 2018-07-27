package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeRiaPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@id='header']//div[@class='container']//span[@class='tl']")
    private WebElement enterTo;

    private WebElement waitTime(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public HomeRiaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AuthorizationPage clickOnLoginInLinck(){
        waitTime(enterTo).click();
        return new AuthorizationPage(driver);
    }

}
