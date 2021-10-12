package BaseTest;

import Core.TAEDriver;
import Core.TEABaseObject;
import Core.TestListener;
import Entities.WebDriverType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;


@Listeners(TestListener.class)


public abstract class BaseAbstractTest extends TEABaseObject {

    private static TAEDriver driver;


    public BaseAbstractTest(String browser) {
        if (browser.equalsIgnoreCase(WebDriverType.CHROME.getDriverName())){
            driver = new TAEDriver(WebDriverType.CHROME);
        } else if (browser.equalsIgnoreCase(WebDriverType.FIREFOX.getDriverName())){
            driver = new TAEDriver(WebDriverType.FIREFOX);
        } else if (browser.equalsIgnoreCase(WebDriverType.EDGE.getDriverName())){
            driver = new TAEDriver(WebDriverType.EDGE);
        }
    }

    public static TAEDriver getDriver() {
        return driver;
    }

    private String getClassName(){
        String[] nameLines = this.getClass().toString().split("\\.");
        return nameLines[nameLines.length - 1];
    }

    @BeforeClass
    public void beforeClass(ITestContext iTestContext){
        iTestContext.setAttribute("driver", driver);
        getLOGGER().info(String.format("          ***** Start executing class '%s' *****           ", getClassName()));
    }

    @AfterClass
    public void afterClass(){
        if (driver != null){
            driver.quit();
        }
    }
}
