package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class Driver {
    private static WebDriver driver;

    private Driver() {};

    public static WebDriver getInstance() {
        if (driver == null)  {
            File pathToBinary = new File("C:\\Users\\dbutakov\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
            FirefoxBinary ffBinaryFile = new FirefoxBinary(pathToBinary);
            FirefoxProfile firefoxProfile = new FirefoxProfile();
            driver = new FirefoxDriver(ffBinaryFile, firefoxProfile);
        }

        return driver;
    }
}
