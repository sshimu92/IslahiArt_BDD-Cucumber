
@Cart
Feature: Shopping Cart Feature
   As a user I want to add item to Shopping Cart

  @Positive
  Scenario: Adding item to the Shopping Cart
    Given user already open the website islahiart
    When user input "shawon.shimu@yahoo.com" as Username "Kujara@1984" as Password
    Then user succesfully logged in
    Then user click on Best Selling link
    And user click on the item "Islamic Calligraphy Canvas Gallery Wraps" to the Shopping Cart
    Then user navigate to Shopping Cart page
    #And user click on Accessories link
    #Then user click on the item "Islamic Gallery Canvas Wraps, Square Frame[size-36″ x 36″]" to the Shopping Cart
    #

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
