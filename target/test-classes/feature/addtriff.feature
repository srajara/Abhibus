#Author: your.email@your.domain.com

Feature: To Check AbI BUS Booking
  I want to use this template for my feature file

  
  Scenario Outline: Title of your scenario outline
    Given User entering in to Abi Bus URL
    When Fills source and destination "<source>","<Destination>"
    And Click the Search
    Then validate the details 

    Examples: 
      | source | Destination | 
      | Chennai |Bangalore| 
      
