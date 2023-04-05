Feature: Verify the login


	Scenario: Login to opencart
		Given Launch the URL
		And Navigate to the login page
		And enter the username and password
		When click on login button
		Then login should be successful