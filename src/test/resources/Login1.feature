Feature: HRM1 Application
This application includes validating login page
1) Valid case
2) Invalid case

Background:
Given Login application should present

#@validcase
#Scenario: To login with valid credentials
#When Enter valid Username "Admin" 
#And Enter valid password "admin123"   
#And Click on Login button1
#Then Then i should see welcome name as "Welcome Paul"

#Scenario: To login with valid credentials
#When Enter valid Username "Admin" 
#And Enter valid password "admin123"   
#And Click on Login button1
#Then Then i should see welcome name as "Welcome Paul"

Scenario Outline: To test login with different data
When Enter valid Username "<user>" 
And Enter valid password "<pwd>"   
And Click on Login button1
Then Then i should see welcome name as "<login text>"

Examples:
|user |pwd     |login text  |
|Admin|admin123|Welcome Paul|
|Admin|admin123|Welcome Paul|

@invalidcase
Scenario: To test login with Invalid credentials
When Enter invalid Username "Prathap"
And Enter invalid password "Ptrathap"
And Click on Login btn1
Then I should see invalid credential error as "Invalid credentials"
