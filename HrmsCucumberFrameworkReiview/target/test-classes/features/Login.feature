Feature: HRMS Login

Description:The purpose of this  feature file is to automate HRMS Login
            To make sure that everything works as  expected
            
Scenario: HRMS valid login 

Given user is already on Login page
When user enters valid username and password
And user clicks on login button
Then user sees that dashboard is displayed
