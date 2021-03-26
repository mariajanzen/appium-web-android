package com.company.herokuapp.pages;

import com.company.herokuapp.util.PropertiesLoader;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public static String basicURL = PropertiesLoader.loadProperty("url");

    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
}
