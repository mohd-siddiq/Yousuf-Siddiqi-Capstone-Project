Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on my account
    When User click on Login
    And User enter 'tigerstekschool212@gmail.com' and 'tigers@0987'
    And User click on Login button
    Then User should be logged in to My account dashborad

  @Page
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company   | website        | taxID  | paymentMethod | payeeName |
      | tekschool | tek-school.com | 256984 | cheque        | tekschool |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
  @Page
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName   | abaNumber | swiftCode | accountName | accountNumber |
      | wellsfargo |     45896 | welusa3n  |  0123454321 |    0123454321 |
    And User click on Continue button
   Then User should see a success message
  @Page
  Scenario: Edit you account information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastname | email           | telephone  |
      | laney     | davis    | kachalo23@gmail.com | 5103302145 |
    And User click on Continue button
    Then User should see a success message 'Success: Your account has been successfully updated.'
    
