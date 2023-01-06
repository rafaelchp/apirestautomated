Feature: Create order

  @PostOrder
  Scenario Outline: Create order successfully.
    When I consume the endpoint "<endpoint>" and I send the order information petId <petId>, quantity <quantity> shipDate "<shipDate>" status "<status>" complete "<complete>"
    Then I can validate the response code is <code>

    Examples:
      |petId |quantity|shipDate     |status |complete|endpoint      |code|
      |1     | 1      | 2023-01-07  | placed| true   | /store/order |200 |