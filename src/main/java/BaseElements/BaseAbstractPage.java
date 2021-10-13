package BaseElements;

import Core.TAEDriver;
import Core.TEABaseObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseAbstractPage extends TEABaseObject {

    protected TAEDriver driver;


    public BaseAbstractPage(TAEDriver driver, String title) {
        this.driver = driver;
        waitIsDisplayed(title, DEFAULT_TIMEOUT, DEFAULT_SLEEP);
    }

    public boolean waitIsDisplayed(String title, int timeout, int sleep){
        return new WebDriverWait(driver.getDriver(),timeout, sleep)
                .until(ExpectedConditions.titleIs(title));
    }
}
