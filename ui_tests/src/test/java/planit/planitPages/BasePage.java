package planit.planitPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver wd;

    public BasePage(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By loginField, String username) {
        wd.findElement(loginField).clear();
        wd.findElement(loginField).sendKeys(username);
    }
}
