package BaseTest;

import Entities.WebDriverType;
import TAEExceptions.TAUnknowBrowserException;

public class BaseAbstractChromeTest extends BaseAbstractTest{

    public BaseAbstractChromeTest() throws TAUnknowBrowserException {
        super(WebDriverType.CHROME.getDriverName());
    }
}
