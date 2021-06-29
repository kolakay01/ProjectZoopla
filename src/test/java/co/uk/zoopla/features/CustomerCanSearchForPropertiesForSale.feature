Feature: Search

  Scenario Outline: user can search for Property for Sale
    Given I navigate to zoopla home page
    When I enter location as "<Location>"
    And I select minimum bed as "<MinBed>"
    And I select maximun bed as "<MaxBed>"
    And I select minimum price as "<MinPrice>"
    And I select maximun price as "<MaxPrice>"
    And I choose "<Property>" as property type
    And I click on search button
    Then Search result page is displayed

    Examples: Search test data
      | Location              | MinBed | MaxBed | MinPrice | MaxPrice | Property   |
      | London                | 3      | 3      | £300,000 | £500,000 | Houses     |
    #  | Manchester            | 3      | 3      | £300,000 | £500,000 | Flats      |
    #  | Manchester            | 3      | 3      | £300,000 | £500,000 | Farms/land |
    #  | Manchester            | 3      | 3      | £300,000 | £500,000 | House      |
    #  | M1 5                  | 3      | 3      | £300,000 | £500,000 | House      |
    #  | Manchester Piccadilly | 3      | 3      | £300,000 | £500,000 | House      |
    #  | ""                    | 3      | 3      | £300,000 | £500,000 | House      |
    #  |                       | 3      | 3      | £300,000 | £500,000 | House      |




