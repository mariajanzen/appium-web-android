package com.company.herokuapp.steps;


import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.company.herokuapp.pages.BasePage.basicURL;

public class CommonSteps implements En {
    public CommonSteps() {

        Given("I am on the Hovers page", () -> {
            open(basicURL + "/hovers");
        });
    }

}
