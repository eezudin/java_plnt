package planit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import planit.planitPages.loginPage.LoginPage;
import planit.planitPages.releasesPage.ReleasesPage;
import planit.planitPages.sideMenu.SideMenu;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Application {

    public WebDriver wd;

    protected LoginPage loginPage;
    protected ReleasesPage releasesPage;
    protected SideMenu sideMenu;

    private final String browser;
    private Properties properties;

    public Application(String browser) {
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
     //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ezudin\\Downloads\\chromedriver.exe");

        String config = System.getProperty("config", "planitTests");
        properties.load(new FileReader(String.format("src/test/resources/%s.properties", config)));

        switch (browser) {
            case BrowserType.CHROME:
                wd = new ChromeDriver();
                break;
            case BrowserType.FIREFOX:
                wd = new FirefoxDriver();
                break;
            case BrowserType.EDGE:
                wd = new EdgeDriver();
                break;
        }

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get(properties.getProperty("baseUrl"));
        wd.findElement(By.linkText("Sign In")).click();

        releasesPage = new ReleasesPage(wd);
        loginPage = new LoginPage(wd);
        sideMenu = new SideMenu(wd);
    }

    public void stop() {
        wd.quit();
    }

    public ReleasesPage releasesPage() {
        return releasesPage;
    }

    public LoginPage loginPage() {
        return loginPage;
    }

    public SideMenu sideMenu() {
        return sideMenu;
    }
}
