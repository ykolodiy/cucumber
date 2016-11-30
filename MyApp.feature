Feature:  Test Facebook smoke scenarios

Scenario: Test login valid credentials
Given Open Chrome and start application
When I enter valid "username@sdf.sd" and valid password
Then User should be able to login successfully