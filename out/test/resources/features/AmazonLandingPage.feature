Feature: Test a scenario under Amazon Landing Page


  @amazonLandingPage
  Scenario: Login To Amazon
    Given User On landing page
    When User check the all UI Element
    And User log in as "akashgupta.gupta16@gmail.com" and password "akash@787"
    Then user land on Amazon Home page



