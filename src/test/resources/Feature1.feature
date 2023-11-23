Feature:  Validates positive scenario with fund transfer of 50 
Scenario: Validating Fund Transfer of Rupees 50 with positivive scenario
Given User Has to be in their Banking Account Page
When User Account balance check and it has to be equal to or above Rupees 50
And User try to transfer of Rupees 50
And User try to transfer of Rs.50 and above
Then Logout from the Account

Scenario: Validating Fund Transfer of Rupees 100 with positive scenario
Given User Has to be in their Banking Account Page
When User Account balance check and it has to be equal to or above Rupees 100
And User try to transfer of Rupees 100
And User try to transfer of Rs.100 and above
Then Logout from the Account

Scenario: Validating Fund Transfer of Rupees 150 with Negative scenario
Given User Has to be in their Banking Account Page
When User try to transfer below 50 or above 100 rupees
And Fund transfer failed
Then Logout from the Account

