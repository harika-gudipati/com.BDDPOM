Feature: Login

Scenario: Valid login
Given User is on Login Page
When User enter login credentials
		| username | password |
		| gudipati.harikareddy@gmail.com | Hari@123 |
Then User creates contact
And Close the browser
