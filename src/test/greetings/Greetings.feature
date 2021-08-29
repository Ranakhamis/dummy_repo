Feature: Login

  Scenario Outline: Dummy Scenario
    Given I greet you
    And Your name should be "<name>"
    And I visit "<google_url>"
    Examples:
      | name | google_url              |
      | Ali  | https://www.google.com/ |

