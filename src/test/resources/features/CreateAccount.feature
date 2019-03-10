@createaccoun

Feature: Create Account
  Scenario: Create account with valid details
    Given user is on Zara homepage
    When user on CTA Log in
    And user click CTA Create Account
    And page header is displayed
    And user click on personal radio button
    And user enter Email address
    And user enter Password
    And enter repeat Password
    And user enter Name
    And user enter Surname
    And user select Country
    And user enter Address
    And user enter Postcode
    And user enter Town
    And user enter phone number
    And user click Newsletter checkbox
    And click T&Cs checkbox
    Then user click create account button

