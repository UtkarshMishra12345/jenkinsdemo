Feature: To login on facebook

Scenario: User login on facebook
When user enters email
And user enters password
Then successfully login
And close browser
