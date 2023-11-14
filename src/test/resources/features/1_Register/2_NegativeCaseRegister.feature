@Automation
Feature: Register

  @RegisterPositiveCase
  Scenario Outline: User Register with invalid parameter
    Given User wants to register and click button Daftar
    And User already on Register page
    When User input "<nama>" as Nama Lengkap and "<nomor>" as Nomor Telpon and "<email>" as Email and "<password>" as Password
    Examples:
      | nama                                                                                  | nomor                                                                         | email             | password     |
      | jajal                                                                                 | 08887666657                                                                   | jajal@example.com |              |
      |                                                                                       | 08887666657                                                                   | jajal@example.com | yahaha123    |
      | jajal                                                                                 |                                                                               | jajal@example.com | yahaha123    |
      | jajal                                                                                 | 08887666657                                                                   |                   | yahaha123    |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | 08966666666666666666666666666666666666666666666666666666666666666666666666666 | jajal@example.com | emang boleh? |
      | jajal                                                                                 | 08887666657                                                                   | jajal             | yahaha123    |
      | jajal                                                                                 | 0897 8888 6666                                                                | jajal@example.com | yahaha123    |

  Scenario Outline: User Register with string nomor telpon
    Given User wants to register and click button Daftar
    And User already on Register page
    When User input "Aku Lengkap" as Nama Lengkap and "<nomor>" as Nomor Telpon with string parameter and "jajal@example.com" as Email and "chaaakss" as Password
    And User check the password was correct
    Examples:
      | nomor    |
      | akuhebat |
      | $@$#@$@$ |