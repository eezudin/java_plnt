package tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import planit.Application;

import java.io.IOException;

public class TestBase {

    protected final Application planit = new Application(
            System.getProperty("browser", BrowserType.CHROME));

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {
        planit.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        planit.stop();
    }

}
