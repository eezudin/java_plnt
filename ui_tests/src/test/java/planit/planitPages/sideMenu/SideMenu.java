package planit.planitPages.sideMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import planit.planitPages.BasePage;

public class SideMenu extends BasePage {

    public SideMenu(WebDriver wd) {
        super(wd);
    }

    SideMenuLocators locators = new SideMenuLocators();

    public void deploymentPackagesPage() {
        click(locators.sideMenu);
        click(locators.deploymentPackagesOption);
    }

    public void releaseProfilePage() {
        click(locators.sideMenu);
        click(locators.releaseProfileOption);
    }
}
