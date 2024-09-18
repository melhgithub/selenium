@RegressionTest
Feature: Register Test

Background: Create An Account
  Given Navigate to Website
  And click Sign in button
  
  Scenario Outline: User gender and password
  And type email "<Email>"
  And click on Create an Account button
  And choose gender
  And type password "<password>"

Examples:
  | Email             | password |
  | melih@gmail.com   | 12345!   |
  | furkan@gmail.com  | 54321!   |
  
  Scenario Outline: User firstname and lastname
  And type email "<Email>"
  And click on Create an Account button
  And type firstname "<firstname>" and lastname "<lastname>"

Examples:
  | Email             | firstname | lastname |
  | melih@gmail.com   | Melih      | Dursun   |
  | furkan@gmail.com | Furkan      | Döğen    |