@PerformanceTest
Feature: Run JMeter Test

Scenario: Performance Test
  Given I have prepared a JMeter test
  When I execute the JMeter test
  Then I should get the performance results
