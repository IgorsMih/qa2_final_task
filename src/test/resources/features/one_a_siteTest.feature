@OneALv
@OneALogin
Feature: Test onea.lv login page and basket, filtering and validates it

  Background: Open login page, enter login name and password and submit it
    Given Open Home Page
    And Open Login Page
    And Validate that Login Page is open
    When Set Login Name to IMEmail and Password to IMPSW and press Submit Button

  Scenario: Find product, ..., validate and close all pages
    Given Set ProductName in Search Field to Lenovo and click Search Button
    And Close All Pages