Feature: Desktops Tab

  Background: 
    Given User is on Retail website
    When User click on Desktops tab
    And User click on Show all desktops

  @DesktopPage
  Scenario: User verify all items are present in Desktops tab
    Then User should see all items are present in Desktops page

  @DesktopPage
  Scenario: User add HP LP 3065 from Desktops tab to the cart
    And User click  ADD TO CART option on HP LP3065 item
    And User select quantity 4
    And User click add to Cart button
    Then User should see a message Success: You have added HP LP3065 to your shopping cart!

  @DesktopPage
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click  ADD TO CART option on Canon EOS 5Ditem
    And User select color from dropdown Red
    And User select quantity '2'
    And User click add to Cart button
    Then User should see a message Success: You have added Canon EOS 5D to your shopping cart!

  @DesktopPage
  Scenario: User add a review to Canon EOS 5D item inDesktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourName  | yourReview                                                                                                 | rating |
      | John Adam | I like this camera the picture quality is really cool and so is the charging time. it s really impressive. |      5 |
    And User click on Continue Button
    Then User should see a message with Thank you for your review. It has been submitted to the webmaster for approval.
