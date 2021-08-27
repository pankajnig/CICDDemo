package com.Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleSearch {

    public static void main(String args[]) throws InterruptedException, MalformedURLException {
        WebDriver driver = null;
//        WebDriverManager.chromedriver().browserVersion("77.0.3865.40").setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        options.addArguments("enable-automation");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-infobars");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--disable-browser-side-navigation");
//        options.addArguments("--disable-gpu");

        DesiredCapabilities cop = new DesiredCapabilities();
        cop.setBrowserName(BrowserType.CHROME);
        driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), cop);
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
