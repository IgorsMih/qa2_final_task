@OneALv
@OneALogin
Feature: Test onea.lv login page and basket, filtering and validates it

  Background: Login to Site
    Given Open Home Page
    And Open Login Page
    And Validate that Login Page is open
    When Set Login Name to IMEmail and Password to IMPSW and press Submit Button

  Scenario: Find needed Product, add it to Shopping Cart and validate all needed information, then Logoff
    Given Through Main Menu Find Business Notebook
    When Get Name Price Url, Create File and Add Them to File
    And Add Product to Shopping Cart and Go To Shopping Cart
    When Validate that Shopping Cart is Open
    And Validate Name and Price
    And Click on Turpinat
    Then Fill All Fields in Final Page
    And Validate Filled Fields and Final Price
    And Clear Shopping Cart
    And Logoff from Site
    And Close All Pages