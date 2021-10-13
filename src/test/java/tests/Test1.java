package tests;

/*import BaseTest.BaseAbstractChromeTest;*/
import BaseTest.BaseAbstractTest;
import TAEExceptions.TAUnknowBrowserException;
import org.testng.annotations.Test;

public class Test1 extends BaseAbstractTest {


    public Test1(String browser)  throws TAUnknowBrowserException {
        super("edge");
    }

    @Test
    public void test(){
        int a = 5+6;
    }
}
