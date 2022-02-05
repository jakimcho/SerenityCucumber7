Feature: Cucumber 7

  Rule: The ony one
  Background:
    Given Test is started

  Scenario: Simple test
    When this step run
    Given hooks should have run

  Rule: Others
    Background:
      Given Other tests are started

    Scenario: Other test
      When other step run
      Given other hooks should have run
