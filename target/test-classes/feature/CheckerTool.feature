Feature: Verify Checker tool for consumers
  As a User
  I want to go to NHS website
  So that user can see NHS benefits

  Background:
    Given User is on NHS Checker tool Website

  Scenario:User verify checker tool for costing
    When User select start now button
    And  User select Wales and click on next button
    When User select yes for GP practice in Wales
    And  User select yes for Dental practice in Wales
    When User enter DOB as day "07" month "11" year "1985"
    And  User select no for living partner and tax benefits
    When User select no radio button for pregnant and injury or illness
    When User select no radio button Diabetic and glaucoma
    And  User select no radio button for care home and savings
    And  User select yes radio button for any help to pay for home or care home
    Then User must get the result for NHS can give help or not and verify it

