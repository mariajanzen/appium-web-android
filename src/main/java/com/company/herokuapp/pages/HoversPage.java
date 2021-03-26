package com.company.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HoversPage  extends BasePage{

    public static final By user3 = By.xpath("//div[3]/div/h5");

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public static By generateXpath(String index) {
        return By.xpath("(//img[@alt='User Avatar'])[" + index + "]");
    }
}
