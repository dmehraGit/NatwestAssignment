# Natwest - Ecom site automation framrwork Imorvements

- Reporting (configuring reporting libraries for end result reporting) will provide the QA and stakeholders for consoliated test runs reporting.
- Cross browser Testing : Currently, chrome is the one used, the framework can be extended to support multi browser testing for better coverage.
- Exception handling : All page methods and step defintion should be enabled for exception handling in a better way to cover runtime exceptions and report accordingly.
- Logging : currently no logging on runtime,can be added for debugging effectively.
- Test Data : present framework handles data as hard coded in scenarios, can be converted to Scenario outline or accessing external files (if large data) to enable tet data combination assertions. like multiple user accounts (username/password combination)
- Failure handling mechanism : Test run failure cna have better handling using iRetryListener and screenshots on failure.
