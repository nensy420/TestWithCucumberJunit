package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='content']/div[@class='head-ticket']/div[contains(@class,'ticket-title')]/a")
    private List<WebElement> resultList;

    @FindBy(xpath = "//input[@id='naRadioType']/following-sibling::label[@for='naRadioType']")
    private List<WebElement> locationResultList;



    private WebElement waitTime(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public SearchResultsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public    String resultsOfSearchTitle(){
        List<WebElement> listOfResults = resultList;
        String actualTitle = null ;
        for (WebElement elm : listOfResults) {
            waitTime(elm);
            actualTitle = elm.getAttribute("title");
        }
        return actualTitle;
    }

    public    boolean resultsOfSearchCity(String regionName){
        List<WebElement> listOfResults = locationResultList;
        boolean result = false;
        for (WebElement elm : listOfResults) {
            waitTime(elm);
            result = elm.getText().trim().equalsIgnoreCase(regionName);
            if (!result) break;
        }
        return result;
    }
}
