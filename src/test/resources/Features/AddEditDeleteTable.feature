Feature: Delete, edit and add functionalities

  Scenario: Add new record
    Given Web Tables page is opened
    And I click on add button
    And I type "Grigor" in the first name field
    And I type "Stepanyan" in the last name field
    And I type "step@gmail.com"  in the email field
    And I type "20"  in the age field
    And I type "1000000"  in the salary field
    And I type "abcd"  in the department field
    And I click on submit button
    And I check the contents of the table
    And I click on the Edit button
    And I clear age
    And I type "27" in the age field
    And I click on submit button
    And I check the changes
    Then I delete the table created by me
