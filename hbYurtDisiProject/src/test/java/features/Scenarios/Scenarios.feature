
Feature:  HB Iphone 11 Basket Control

  Scenario: HB Iphone 11 Basket Control
    Given Open Login Page
    And Login sendKeys username "username"
    And Login sendKeys password "Test1234"
    And Click on the login button
    And Again Login sendKeys password "Test1234"
    And Again Click on the login button
    And Book Search text "iPhone 11"
    And Add a Phone Basket first Phone
    And Controls Basket Page


