package com.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("User enters valid username and password");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("User clicks on login button");
    }

    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        System.out.println("User is redirected to the homepage"); 
    }
}