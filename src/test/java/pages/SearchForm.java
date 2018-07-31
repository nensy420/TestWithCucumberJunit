package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchForm {
    private WebDriver driver;

    @FindBy(id = "categories")
    private WebElement transportField;

    @FindBy(xpath = "//input[@id='brandTooltipBrandAutocompleteInput-brand']/following-sibling::label")
    private WebElement brandCarFieldBu;

    @FindBy(xpath = "//div[@id='brandTooltipBrandAutocomplete-brand']//ul//following-sibling::li/a")
    private List<WebElement> brandCarList;

    @FindBy(xpath = "//div[@id='brandTooltipBrandAutocomplete-model']/label")
    private WebElement modelCarFieldBu;

    @FindBy(xpath = "//div[@id='brandTooltipBrandAutocomplete-model']//ul//following-sibling::li/a")
    private List<WebElement> modelCarList;

    @FindBy(xpath = "//div[contains(@class,'secondary-column')]//div[@class='m-indent']//label[@for='regionAutocompleteAutocompleteInput-1']")
    private WebElement regionFieldBu;

    @FindBy(xpath = "//div[@class='autocomplete-search mhide']//ul/li/a")
    private List<WebElement> regionList;

    @FindBy(id = "yearFrom")
    private WebElement yearFromField;

    @FindBy(id = "yearTo")
    private WebElement yearToField;

    @FindBy(id = "priceFrom")
    private WebElement priceFromField;

    @FindBy(id = "priceTo")
    private WebElement priceToField;

    @FindBy(xpath = "//form[@id='mainSearchForm']/div[@class='footer-form']/button")
    private WebElement submit;


    @FindBy(xpath = "//input[@id='buRadioType']/following-sibling::label[@for='buRadioType']")
    private WebElement buRadioButton;

    @FindBy(xpath = "//input[@id='naRadioType']/following-sibling::label[@for='naRadioType']")
    private WebElement newRadioButton;

    private WebElement waitTime(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public SearchForm(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void searchTransport(String transportName) {
        Select selectTransportField = new Select(transportField);
        selectTransportField.selectByVisibleText(transportName);
    }

    public void searchBrandCarBu(String nameBrandCar) {
        waitTime(brandCarFieldBu).click();
        List<WebElement> listBrandCar = brandCarList;
        for (WebElement elm : listBrandCar)
        {
            String dataValue = elm.getAttribute("innerHTML");
            if (dataValue.contains(nameBrandCar)) {
                waitTime(elm).click();
                return;
            }
        }
    }

    public void searchModelCarBu(String nameModelCar){
        waitTime(modelCarFieldBu).click();
        List<WebElement> listModelCar = modelCarList;
        for (WebElement elm : listModelCar )
        {
            String dataValue = elm.getAttribute("innerHTML");
            if (dataValue.contains(nameModelCar)) {
                waitTime(elm).click();
                return;
            }
        }
    }

    public void searchRegionBu(String nameRegion){
        waitTime(regionFieldBu).click();
        List<WebElement> listRegions = regionList;
        for (WebElement elm : listRegions )
        {
            String dataValue = elm.getAttribute("innerHTML");
            if (dataValue.contains(nameRegion)) {
                waitTime(elm).click();
                return;
            }
        }
    }

    public void selectYear(String from, String to) {
        Select yearSelectFrom = new Select(yearFromField);
        yearSelectFrom.selectByVisibleText(from);
        Select yearSelectTo = new Select(yearToField);
        yearSelectTo.selectByVisibleText(to);
    }

    public void enterPrice(String priceFrom, String priceTo) {
        priceFromField.sendKeys(priceFrom);
        priceToField.sendKeys(priceTo);
    }

    public void clickOnSubmitButton(){
        submit.click();
    }

}
