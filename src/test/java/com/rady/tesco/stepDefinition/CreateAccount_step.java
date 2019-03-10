package com.rady.tesco.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount_step {


WebDriver driver;
    @Given("^user is on Zara homepage$")
    public void user_is_on_Zara_homepage(){

        System.setProperty("webdriver.chrome.driver", "\\EclipseSetUp\\chromedriver.exe");
      driver = new ChromeDriver() ;
      driver.get("https://www.zara.com/uk/");
      driver.manage().window().maximize();

      System.out.println(driver.getTitle());
}
    @When("^user on CTA Log in$")
    public void user_on_CTA_Log_in() throws Throwable {
    driver.findElement(By.linkText("LOG IN")).click();
    }

    @When("^user click CTA Create Account$")
    public void user_click_CTA_Create_Account() throws Throwable {
        driver.findElement(By.cssSelector("#register-button")).click();
    }

    @When("^page header is displayed$")
    public void page_header_is_displayed() throws Throwable {

    }

    @When("^user click on personal radio button$")
    public void user_click_on_personal_radio_button() throws Throwable {

    }

    @When("^user enter Email address$")
    public void user_enter_Email_address() throws Throwable {

    }

    @When("^user enter Password$")
    public void user_enter_Password() throws Throwable {

    }

    @When("^enter repeat Password$")
    public void enter_repeat_Password() throws Throwable {

    }

    @When("^user enter Name$")
    public void user_enter_Name() throws Throwable {

    }

    @When("^user enter Surname$")
    public void user_enter_Surname() throws Throwable {

    }

    @When("^user select Country$")
    public void user_select_Country() throws Throwable {

    }

    @When("^user enter Address$")
    public void user_enter_Address() throws Throwable {

    }

    @When("^user enter Postcode$")
    public void user_enter_Postcode() throws Throwable {

    }

    @When("^user enter Town$")
    public void user_enter_Town() throws Throwable {

    }

    @When("^user enter phone number$")
    public void user_enter_phone_number() throws Throwable {

    }

    @When("^user click Newsletter checkbox$")
    public void user_click_Newsletter_checkbox() throws Throwable {

    }

    @When("^click T&Cs checkbox$")
    public void click_T_Cs_checkbox() throws Throwable {

    }

    @Then("^user click create account button$")
    public void user_click_create_account_button() throws Throwable {

    }

}
