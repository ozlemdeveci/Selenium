package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.testbase.BaseClass;

public class LoginPage extends BaseClass{

	public WebElement username=driver.findElement(By.id("txtUsername"));
	public WebElement password=driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	

@Given("I open browser and navigated to the HRMS")
public void i_open_browser_and_navigated_to_the_HRMS() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("I enter valid username and valid password")
public void i_enter_valid_username_and_valid_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("I click on login button")
public void i_click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("I successfully logged in")
public void i_successfully_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("I close browser")
public void i_close_browser() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("I enter valid username and invalid password")
public void i_enter_valid_username_and_invalid_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("I see error message")
public void i_see_error_message() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
	
}