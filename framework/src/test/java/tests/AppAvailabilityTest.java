package tests;

import com.gargoylesoftware.htmlunit.WebClient;

import framework.Driver;
import framework.IndexPage;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AppAvailabilityTest {
    @Test
    public void testAppIsRunning() throws Exception {
        WebClient webClient = new WebClient();
        int statusCode = webClient.getPage(
                "http://localhost:8080/app"
        ).getWebResponse().getStatusCode();
        webClient.closeAllWindows();

        assertThat(statusCode, is(200));
    }

    @Test
    public void testIndexPageIsAvailable() throws Exception {
        IndexPage.go();

        assertThat(IndexPage.at() , is(true));

    }
}
