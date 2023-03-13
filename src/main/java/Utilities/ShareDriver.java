package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class ShareDriver {
    private static WebDriver webDriver;
    public enum Browser{
        CHROME,
        FIREFOX,
        IE
    }



    protected static WebDriver getWebDriver(Browser browser ){
        switch (browser){
            case FIREFOX:
                WebDriverManager.chromedriver().setup();
            webDriver=new FirefoxDriver();
            break;

            case CHROME:
                WebDriverManager.firefoxdriver().setup();
                webDriver=new ChromeDriver();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                webDriver=new InternetExplorerDriver();
                break;
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return webDriver;
    }
    protected static void closeDriver(){
        if (webDriver==null){
            webDriver.close();
        }
    }
}
