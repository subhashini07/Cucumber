Feature: Validate the demo site

  Scenario Outline: Validate registration details
    Given user is in demo site
    When User enters the "<firstName>","<lastName>","<address>","<emailAddress>","<phone>","<passWord>","<confirmPassword>" and then click and submit
    Then verify Url contains WebTable

    Examples: 
      | firstName  | lastName | address | emailAddress           | phone      | passWord | confirmPassword |
      | Subhashini | Suresh   | Chennai | gksubhashini@gmail.com | 9629287479 | Subha$05 | Subha$05        |
