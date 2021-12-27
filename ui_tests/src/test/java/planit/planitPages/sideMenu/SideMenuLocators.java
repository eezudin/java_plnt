package planit.planitPages.sideMenu;

import org.openqa.selenium.By;

public class SideMenuLocators {

    By sideMenu = By.xpath("//div[@data-cy='main__menu__button']");
    By deploymentPackagesOption = By.xpath("//*[text()='Deployment Packages']");
    By releaseProfileOption = By.xpath("//*[text()='Release Profile']");
}
