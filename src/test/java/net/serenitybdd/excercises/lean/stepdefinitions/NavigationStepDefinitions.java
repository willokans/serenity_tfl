package net.serenitybdd.excercises.lean.stepdefinitions;

import cucumber.api.java.en.Given;
import net.serenitybdd.excercises.lean.navigation.NavigateTo;
import net.thucydides.core.annotations.Steps;

public class NavigationStepDefinitions {

    @Steps
    NavigateTo navigate;

    @Given("Trevor is in the {string} section")
    public void trevorIsInTheSection(String sectionName) {
        navigate.toSection(sectionName);
    }
}
