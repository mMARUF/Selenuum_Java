
# Selenium with Java

This is a Web Automaton Framework created with Selenium and written in Java. 

## Introduction
In this project, you will find sample login scenario and a complete user flow.

## Project Packages
- Page Objects: 
    - PageObjectFile.java : This file contains all the page objects. All the web elements and functions are kept there.

- Test File:
    - TestExecution.java : This file contains all the tests.

- Framework: TESTNG has been used as the testing framework in this project.

- Assertions: Assertions have been used to validate the desired testing results

## Maven Java Project

This project is written in Java and tests can be executed using Maven commands:

```./ mvnw clean install```

Maven has been used to manage all the dependencies. ```pom.xml``` file  describes all the dependencies used in this project. 
 - Selenium
- TestNG
have been installed through this file for the project.

## Tesable Object

We have used https://app.respond.io/ as the Testable Application here. The login process and a complete Workflow user journey has been done. 

## Selenium Webdriver
This project is configured to use Chrome's Webdriver.
The chromedriver added to this project will omly work on macOS.

## Reporting

- Emailable Reporter2
    - Shows all the passed and failed test cases
- TestNG Failed Report 
    - Only play back the failed test cases

