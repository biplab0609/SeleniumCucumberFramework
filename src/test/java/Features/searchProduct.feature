Feature: Search and place the order for products

  @SmokeTest
  Scenario Outline: Search experience for product search in both home and offers page


    Given User is on green cart landing page
    When user search with shortname <Name> and extracted actual name and product
    Then user search for same shortname in offer page to check if product exist
    Examples:
      | Name |
      | Tom  |
      | Beet |
