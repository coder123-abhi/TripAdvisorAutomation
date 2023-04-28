#Author:2112810
#Tool:Selenium and Cucumber


Feature: Feature to test the functionality of the Trip Advisor website


Scenario: To check the search functionality of the website

Given the user is on the landing page of the website
When the user clicks on the hotel option 
And the user searches for Dubai in search box
Then the user is redirected to the option page of the website


Scenario: To check the functionality of the option page of the website

Given the user is on the option page of the website
When the user chooses 26th april as check in date and 4th may as checkout date
And the user chooses 2 adults and 2 children room
Then the user is shown all the hotels available in Dubai


 