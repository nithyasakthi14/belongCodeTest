Feature: Mega menu validation

  Scenario: Validate Mega menu is accessible
    Given Automation practice application is opened
    Then user checks megamenu is displayed and clickable
    When user select dresses
    Then user navigates to summerDresses menu
    And user should be in summerDresses page
    Then verify the page title
      | pageTitle      |
      | Summer Dresses |
