@Automation
Feature: Register

  @RegisterPositiveCase
  Scenario: User Register with valid parameter
    Given User wants to register and click button Daftar
    And User already on Register page
    When User input "Aku Lengkap" as Nama Lengkap and "089912120091" as Nomor Telpon and "jajal@example.com" as Email and "chaaakss" as Password
    And User check the password was correct

  Scenario: User Register with google account
    Given User wants to register and click button Daftar
    And User already on Register page
    When User click button Google Auth

  Scenario: User want to check Syarat & Ketentuan
    Given User wants to register and click button Daftar
    And User already on Register page
    When User input "Aku Lengkap" as Nama Lengkap and "089912120091" as Nomor Telpon and "jajal@example.com" as Email and "chaaakss" as Password
    And User check the password was correct
    And User click button Syarat & Ketentuan
    And User already on Syarat & Ketentuan page

  Scenario: User want to check Kebijakan Privasi
    Given User wants to register and click button Daftar
    And User already on Register page
    When User input "Aku Lengkap" as Nama Lengkap and "089912120091" as Nomor Telpon and "jajal@example.com" as Email and "chaaakss" as Password
    And User check the password was correct
    And User click button Kebijakan Privasi
    And User already on Kebijakan Privasi page

  Scenario: User already have account and wants to login
    Given User wants to register and click button Daftar
    And User already on Register page
    When User already have account and click button Masuk
    And User already on Masuk page