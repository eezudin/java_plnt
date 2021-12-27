package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ExampleTest1 extends TestBase {

    @Test(description = "The best description ever.")
    public void exampleTest1() {

        // log("precondition");
        // planit.goToLoginPage();

        // log("1. Login");
        planit.loginPage().loginAsReleaseManager();
        assertEquals(1, 1, "");
        assertThat("", 1, equalTo(1));

        // log("2. Go to Deployment Package Page");
        planit.sideMenu().deploymentPackagesPage();
        Assert.assertTrue(true);

        // log("3. go To Releases Page");
        planit.sideMenu().releaseProfilePage();
        assertEquals("true", "true");
    }
}
