@RetailPage
Feature: Retail Page: for this feature you have to have an existing account

  Background: 

  @LoginToAccountDashboard
  Scenario: Login to My Account Dashboard
    Given User is on Retail website
    When User click  on MyAccount
    Then User click on Login
    Then User enter username ‘userName’ and password 'password’
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @RegisterAffiliate
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User click on Continue button1
    And User fill affiliate form with below information
      | company | website         | taxID | paymentMethod |
      | HDMZCCc | www.hdmzccc.com |   103 | Cheque        |
    Then User check on About us check box
    And User click on Continue button2
    Then User should see a success message

  @EditAffiliteInfo
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When user is on Affiliate webpage
    And user enter Affiliate userName and Password
    And User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName        | abaNumber  | swiftCode | accountName      | accountNumber |
      | Bank of America | 4444444444 |       333 | checking Account | 1111111111111 |
    And User click on continue button
    Then User should see a success message of update

  @EditAccountInfo
  Scenario: Edit your account Information
    When user is on Affiliate webpage
    And user enter Affiliate userName and Password
    And User click on ‘Edit your account information’ link
    And User modify below information
      | firstName | lastName | email              | telephone        |
      | Yasmeen   | Mangal   | yasmeen21@gmail.com | 2222222222222222 |
    And User click on continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
