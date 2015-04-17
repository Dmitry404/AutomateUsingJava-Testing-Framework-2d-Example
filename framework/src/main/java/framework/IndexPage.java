package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class IndexPage {
                             static WebDriver driver;
    public static void go() {

        File pathToBinary = new File("C:\\Users\\dbutakov\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary ffBinaryFile = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        driver = new FirefoxDriver(ffBinaryFile, firefoxProfile);
        driver.navigate().to("localhost:8080/app");
    }

    public static boolean at() {
        return driver.findElement(By.id("index-page-marker")).isDisplayed();
    }
}
