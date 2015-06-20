package com.nik.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nikhil.nishchal on 6/19/2015.
 */
public class MyFirstTest {
    @Test
    public void startWebDriver(){

        WebDriver webdriver = new FirefoxDriver();

        webdriver.navigate().to("http://seleniumsimplified.com/");
        System.out.print("000000");
        Assert.assertTrue("title should start with silanium simplified", webdriver.getTitle().startsWith("Selenium Simplified"));
        webdriver.close();
        try {
            Thread.sleep(5000);
            webdriver.quit();
        } catch (Exception e) {
        }
    }
}
