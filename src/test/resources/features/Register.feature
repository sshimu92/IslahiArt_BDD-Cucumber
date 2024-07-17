
@Register
Feature: Register
  As a user I want to register to islahiart

  @positive
  Scenario: Register with valid credential
    Given user already open the website islahiart
    When user click on My Account link
    Then user click on Sign Up button
    Then user enter "shawon.shimu@yahoo.com" as email
    And  user enter "Shawon" as First Name "Shimu" as Last Name
    And  user enter "wqgxFiXt68SMPTx" as Password
    And user enter "wqgxFiXt68SMPTx" as Confirm Password
    Then user click on check box
    Then user click on SIGN UP button

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
