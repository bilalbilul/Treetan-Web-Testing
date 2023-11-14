@Automation
Feature: Dashbooard Menu

  @DashboardPositiveCase
  Scenario: User wants to check umroh pembiayaan
    Given User wants to check Umroh Option
    When User choose "Umroh Pembiayaan"
    And User already on Umroh Pembiayaan page

  Scenario: User wants to check umroh tabungan
    Given User wants to check Umroh Option
    When User choose option "Umroh Dana Tabungan"
    And User already on Umroh Tabungan page

  Scenario: User wants to check umroh reguler
    Given User wants to check Umroh Option
    When User choose paket "Umroh Reguler"
    And User already on Umroh Reguler page

  Scenario: User wants to check Wisata Syariah International
    Given User wants to check Wisata Syariah Option
    When User choose Wisata "International"
    And User already on Wisata International page

  Scenario: User wants to check Wisata Syariah Domestik
    Given User wants to check Wisata Syariah Option
    When User choose Wisata Syariah "Domestik"
    And User already on Wisata Domestik page

  Scenario: User wants to check Tentang Kami
    Given User already on Homepage
    When User wants to check and click Tentang Kami
    And User already on Tentang Kami page

  Scenario: User wants to check Gabung Travel Partner
    Given User already on Homepage
    When User wants to check and click Gabung Travel Partner
    And User already on Gabung Travel Partner page