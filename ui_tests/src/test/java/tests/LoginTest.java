package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class LoginTest extends TestBase {

    Logger logger = LoggerFactory.getLogger(LoginTest.class);

    @Test(description = "The best description ever.")
    public void exampleLoginTest() {

        logger.info("precondition");
       // planit.goToLoginPage();

        logger.info("1. Login");
        planit.loginPage().loginAsReleaseManager();
        assertEquals(1, 1, "");
        assertThat("", 1, equalTo(1));

        logger.info("2. Go to Deployment Package Page");
        planit.sideMenu().deploymentPackagesPage();
        Assert.assertTrue(true);

        logger.info("3. go To Releases Page");
        planit.sideMenu().releaseProfilePage();
        assertEquals("true", "true");
    }
}
