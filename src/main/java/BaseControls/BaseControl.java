package BaseControls;

import Core.TAEDriver;
import Core.TEABaseObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseControl extends TEABaseObject {
    protected TAEDriver driver;
    protected By locator;
    protected String name;

    public BaseControl( String name, TAEDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
        this.name = name;
    }

    public BaseControl(String name, TAEDriver driver, String xpath) {
        this.driver = driver;
        this.locator = By.xpath(xpath);
        this.name = name;
    }

    public void click(int timeout){
        new WebDriverWait(driver.getDriver(), timeout, DEFAULT_SLEEP)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        driver.getElement(locator).click();
    }

    public void click(){
        click(DEFAULT_TIMEOUT);
    }
}
