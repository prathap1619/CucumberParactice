Feature: HRM Application
This application includes validating login page
1) Valid case
2) Invalid case
Background:
Given Login application present

@validcase
Scenario: To login with valid credentials
When Enter valid Username
And Enter valid password
And Click on Login button
Then Login Successful

@invalidcase
Scenario: To test login with Invalid credentials
When Enter invalid Username
And Enter invalid password
And Click on Login btn
Then Login should be unsuccessful
