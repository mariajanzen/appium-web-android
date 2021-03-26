package com.company.herokuapp.steps;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.$;
import static com.company.herokuapp.pages.HoversPage.generateXpath;
import static com.company.herokuapp.pages.HoversPage.user3;

public class HoverSteps implements En {
    public HoverSteps() {

        When("I hover avatar 3", () -> {
            $(generateXpath("3")).scrollTo().click();
        });

        Then("I observe the user3 username", () -> {
            assert ($(user3).getText().contains("user3"));
        });
    }
}
