package tests;

import framework.Driver;
import framework.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginPageTest {
    @AfterMethod
    public void tearDown() throws Exception {
        Driver.getInstance().quit();
    }

    @Test
    public void testLoginPageExists() throws Exception {
        LoginPage.go();

        assertThat(LoginPage.at(), is(true));
    }
}
