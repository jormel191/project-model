Feature:Php travels
  As a user I want to compare the price.

  Scenario Outline:Select a product
    Given user is on the "<falabella>" page
    Then enters a "<product>"
  #  Then get the price of five first product


    Examples:

    |falabella                    | product|
    |Lo encontré en Falabella.com|  ps4    |





