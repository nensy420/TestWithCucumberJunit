package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizationPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@id='header']//div[@class='container']//span[@class='tl']")
    private WebElement enterTo;

    @FindBy(xpath = "//form[@id='login-form']/following-sibling::div[@class='login-link']/a")
    private WebElement registerLink;

    @FindBy(xpath = "//div[@class='login-rows']//following-sibling::input")
    private WebElement telephoneField;

    @FindBy(xpath = "//div[@class='sub-button']//following-sibling::input")
    private WebElement continueButton;

    @FindBy(id = "emailloginform-email")
    private WebElement emailField;

    @FindBy(id = "emailloginform-password")
    private WebElement passwardField;

    @FindBy(xpath = "//form[@id='login-form']/child::div[@class='login-link']//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//form[@id='login-form']/child::div[@class='login-rows']//p[@class='error']")
    private WebElement fieldAttantion;

    private WebElement waitTime(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public AuthorizationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void switchToFrameAndClickOnRegisterLink(){
        driver.switchTo().frame("login_frame");
        waitTime(registerLink).click();
    }

    public void inputTelephone(String number){
        waitTime(telephoneField).sendKeys(number);
        waitTime(continueButton).click();
    }

    public String getErrorMessageRegistration(){
        String attantionMessage = fieldAttantion.getAttribute("innerHTML");
        return attantionMessage;
    }
}
