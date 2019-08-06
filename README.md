# SecurePay - Code challenge

## Cucumber Feature: User should be able to submit details on contact us page for SecurePay Website.

@p2 @regression @smoke
## Scenario: User should be able to fill out the details on contact us page
	Given User is on google home page
	And User types securepage in search box
	And user clicks on search button
	When user clicks on securepage website
	Then user redirects to securepage home page
	And user clicks on contact us page
	And user see contact us page is loaded
	And user fill data in contact us form
	And user close the browser
  
## Technologies Used:
	Maven - build automation tool
	BDD: Cucumber
	Web Automation: Selenium 3
	Programming language: Java
  
## How to run this application

# Clone the git repo using following command

```git clone https://github.com/gurinderskarwal/securepaytest.git```

# Compile the application

```
cd securepaytest
mvn clean compile
```
	
# Run the application
	
```mvn test -DDwebdriver.chrome.driver=C:/tools/chromedriver.exe```
	
Assuming your chromedriver.exe is located in C:/tools. If not change this path to appropriate location on your system.

This should open the brower and will do the required steps.

Once tests are run report (report.html) will be availbale in target/cucumber-reports
