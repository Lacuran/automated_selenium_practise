package tests;

import BaseTest.BaseAbstractChromeTest;
import TAEExceptions.TAUnknowBrowserException;
import org.testng.annotations.Test;

public class Test1 extends BaseAbstractChromeTest {


    public Test1() throws TAUnknowBrowserException {
    }

    @Test
    public void test(){
        int a = 5+6;
    }
}
