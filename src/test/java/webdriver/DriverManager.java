package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static Driver driverType;
    private static WebDriver driver = null;

    private DriverManager(){
    }
    public enum Driver{
        Firefox, IE
    }

    public static void setDriver(Driver driverType){
        DriverManager.driverType = driverType;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (driverType) {

                case Firefox:
                    driver = new FirefoxDriver();
                    break;
                case IE:
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
