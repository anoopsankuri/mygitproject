Feature: TO add new telecom customer

  Scenario Outline: To add new telecom customer
    Given The user in guru demo page
    And The user need to navigate to add tariff plan page
    When The user need to enter valid plan details "<Monthly Rental>","<Free Lcl Mins>","<Free Intrnl Mins>","<Free SMS Pack>","<Local Per Mins Charges>","<International Per Minutes Charges>","<SMS Per Charges>"
    And click submit button
    Then The user should see the success message

    Examples: 
      | Monthly Rental | Free Lcl Mins | Free Intrnl Mins | Free SMS Pack | Local Per Mins Charges | International Per Minutes Charges | SMS Per Charges |
      |            350 |            60 |               30 |           100 |                      1 |                                 2 |               1 |
      |            450 |            70 |               50 |           200 |                      1 |                                 2 |               1 |
      |            700 |            90 |               80 |           500 |                      1 |                                 2 |               1 |
