@OneALv
@OneALogin
Feature: Test onea.lv login page and basket, filtering and validates it

  Background: Login to Site
    Given Open Home Page
    And Open Login Page
    And Validate that Login Page is open
    When Set Login Name to IMEmail and Password to IMPSW and press Submit Button

  Scenario: Find needed Product, add it to Shopping Cart and validate
    Given Through Main Menu Find Asus X515
    When Get Name Price and Url
    And Add Product to Shopping Cart and Go To Shopping Cart
    When Validate that Shopping Cart is Open
    And Validate Name AsusX515 and Price 558.10
    And Turpinat
    Then Fill All Fields in Final Page and Validate Final Price 558,10 €
    And Validate Final Price
    And Close All Pages