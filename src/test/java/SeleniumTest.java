import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    public static String browser;
    static WebDriver driver;

    public static void main(String[] args){
        PropertiesFile propertiesFile = new PropertiesFile();
        propertiesFile.readPropertiesFile();
        setBrowserConfig();
        runTest();
        closeDriver();
    }

    public static void  setBrowserConfig(){
        if(browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }

    public static void runTest(){
        driver.get("https://google.com");
    }

    public static void closeDriver(){
        driver.close();
        driver.quit();
    }

}
