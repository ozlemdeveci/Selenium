@sprint1 @JobDetail
Feature: jobDetail

  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page
    And I add firstName, middleName and last name
    And I click Save button
    Then I will see Personal Details

  @smoke
  Scenario: Adding employee emergency contact details
    And I navigate to emergency contact page
    Then I enter emergency contact detail
      | Name        | Relationship | HomePhoneNumber | MobilePhone   | workphone     |
      | Orhan Pamuk | husband      | 978-954-45-45   | 666-666-66-66 | 777-777-77-77 |
      | Osman Abali | Brother      | 978-954-45-48   | 333-333-33-33 | 444-444-44-44 |
    Then I confirm saved emergency detail  
