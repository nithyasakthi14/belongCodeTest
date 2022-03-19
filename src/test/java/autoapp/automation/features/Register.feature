Feature: Registering to automation practice

  Scenario: Validate user is able to register
    Given Automation practice application is opened
    When I click sign in
    And I create account with emailid "testRandom@testauto.com"
    Then I should be able to register with my below details
      | Gender | FirstName | LastName  | Password  | Address            | City      | State  | Zip  | Mobile     |
      | Mr     | TestFName | TestLName | Password1 | 100 Spencer Street | Anchorage | Alaska | 30000 | 0406345454 |

  Scenario: Validate incorrect email error message
    Given Automation practice application is opened
    When I click sign in
    And I create account with emailid "testRandom@testauto"
    Then I should get invalid email error message
    Then I should be able to see error message displayed
    | errorMessage |
    | Invalid email address. |
