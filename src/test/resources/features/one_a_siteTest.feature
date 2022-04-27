@OneALv
@OneALogin
Feature: Test onea.lv login page and basket, filtering and validates it

  Background: Open login page, enter login name and password and submit it
    Given Open Home Page
    And Open Login Page
    When Set Login Name to IMEmail
    And Set Password to IMPSW
    Then Press Submit Button