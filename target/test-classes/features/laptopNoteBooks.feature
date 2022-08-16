Feature: Laptop & NoteBooks

  Background: 
    Given User is on Retail website
    When User click on Laptop & NoteBook tab
    And User click on Show all Laptops & NoteBooks

   @SmokeTest
  Scenario: Add and Remove a Mac book from Cart
    And User click on MacBook item
    And User click add to Cart button
    Then User should see a message Success: You have added MacBook to your shopping cart!
    And User should see 1 item(s)-602.00 showed to the cart
    And User click on cart option
    And user click on red X button to remove the item from cart
    Then item should be removed and cart should show 0 item(s)

   @SmokeTest
  Scenario: Product Comparison
    And User click on product comparison icon on MacBook
    And User click on product comparison icon on MacBook Air
    Then User should see a message 'Success: You have added MacBook Air to your product comparison!'
    And User click on Product comparison link
    Then User should see Product Comparison Chart

  @SmokeTest
  Scenario: Validate the price of MacBook Pro is 2000
    And User click on ‘MacBook Pro’ item
    Then User should see  '$2,000.00' price tag is present on UI.
