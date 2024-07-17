
@Login
Feature: Login
  As a user I want to Login to islahiart

  @positive
  Scenario: Login with valid credential
    Given user already open the website islahiart
    When user click on My Account link
    And user click on Login 
    Then user input "shawon.shimu@yahoo.com" as Username 
    And user input "Kujara@1984" as Password
    Then User click on SIGN IN button
    And user see the successful Hello shawon.shimu message
    

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
