package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class LoginPage {

    public static void go() {

        Driver.getInstance().navigate().to("localhost:8080/app/login");
    }

    public static boolean at() {
        return Driver.getInstance().findElement(By.id("login-form")).isDisplayed();
    }
}
