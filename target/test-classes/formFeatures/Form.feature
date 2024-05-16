
@tag
Feature:Form
  I want to use this template for my feature file

  @tag1
  Scenario: To test all the text fields in form.
    Given User opens form website
    When User should enter first name,last name,email,contact number ,message.
    And User click on submit button
    Then Thank you alert should be displayed
  

