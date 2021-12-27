package planit.planitPages.releasesPage;

import org.openqa.selenium.WebDriver;
import planit.planitPages.BasePage;

public class ReleasesPage extends BasePage {

    public ReleasesPage(WebDriver wd) {
        super(wd);
    }

    ReleasesPageLocators locators = new ReleasesPageLocators();

//    public void goToDeploymentPackagePage() {
//        click(locators.sideMenu);
//        click(locators.deploymentPackagesOption);
//    }
}
