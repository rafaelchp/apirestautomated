Feature: Create user

  @PostUser
  Scenario Outline: Create user successfully.
    When I consume the endpoint "<endpoint>" and I send the user information username "<username>", firstName "<firstName>" lastName "<lastName>" email "<email>" password "<password>" phone "<phone>"
    Then I can validate the creation code is "<code>"

    Examples:
      |username|firstName|lastName|email           |password|phone      |endpoint|code|
      |RafaelP | Rafael  | Chica  | rafael@mail.com| 123456 | 3110001122|/user   |200 |