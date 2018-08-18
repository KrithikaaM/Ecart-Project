#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: feedback of product
    Given I am on the home page of CapStore
    When I click on 'rate the product' link
    Then I am redirected to reviews and ratings page.
    And I can give the review or rating accordingly

  Scenario: common feedback
    Given I am on the home page of CapStore
    When I click on 'post the question' link under the product to interact directly with merchant
    Then I am redirected to 'post the question' page
    And 'Will notify you when someone answers your question' message will be displayed.

    Scenario: Search bar
    Given I am on any page of Capstore
    When I search any product 
    Then  I am redirected to respective product page.