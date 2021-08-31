
# Natwest - Ecom site automation
A UI test automation solution using Java, Maven, Cucumber and Selenium

## Project Brief

Develop a Web test solution that automates a few simple tests, composed as BDD scenarios.
The target for the test is the dummy web site: http://automationpractice.com

- **Username**: deepa.markit2@gmail.com
- **Password**: qwerty123


- **Scenario 1**: Order T-Shirt and Verify in Order History
- **Scenario 2**: Update Personal Information (First Name) in My Account

**Potential Solution Components**<br>
- CucumberJVM
- WebDriver
- Maven

## Steps to Steup and Run

### Install the following

- Java
- Eclipse
- Webdriver

### Setup the project

- import the maven project in eclipse.
- Right click - Maven -> Update the project


### Run the tests
- Right click on Project -> run as -> Maven test
- Each scenario is covered in feature files - Order.feature and userAccount.feature 
- To run specific scenario file - Right click on feature files - run as -> configuration -> browser to feature file location and run
