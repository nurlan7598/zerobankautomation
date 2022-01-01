package com.zerobank.stepdefinitions;

import com.zerobank.pages.zeroBankPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.zerobank.utilities.*;

public class zeroBankDef {
    zeroBankPage home = new zeroBankPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bank.url"));
        home.logInButton.click();

    }
    @Given("user logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String string, String string2) {
        home.login("username", "userpassword");

    }
    @Then("the {string} should be displayed")
    public void the_should_be_displayed(String string) {

    }
}
