Feature:Php travels
  As a user I want to buy a plane ticket.

  Scenario:Select an airplane flight
    Given user is on the phptravel page
    When clicks flight
    Then From and to option appears to select the flight
    Then user select from
    Then user select to
    Then user select depart
    And user clicks search
    Then user is redirected to the page
    And You get the cheapest ticket price

#    Examples:

 # |from |    abs         |       date
  #| lah |    (LHE)    |       2020-09-25


