# Automation Testing Project

## Overview

This project automates the shopping checkout process for an e-commerce application using **Selenium WebDriver**, **Cucumber**, and **TestNG**. The project leverages behavior-driven development (BDD) principles and provides comprehensive test reports to ensure robust functionality and performance.

## Features

- **End-to-End Shopping Checkout Automation**: Automates the entire process from logging in to completing a purchase.
- **Behavior-Driven Development (BDD)**: Uses Cucumber for defining and running BDD scenarios.
- **Test Management**: Managed using TestNG for efficient test execution and reporting.
- **Detailed Test Reports**: Generates HTML, JSON, and JUnit reports for detailed insights into test results.

## Project Structure

- **`src/test/java`**: Contains the Java code for test cases, including:
  - **`testrunner`**: Configures TestNG with Cucumber.
  - **`stepDefinitions`**: Implements the step definitions for Cucumber scenarios.
  - **`pages`**: Contains page object models for interacting with the web application.
  - **`utils`**: Contains utility methods used across tests.

- **`src/test/resources`**: Includes Cucumber feature files defining the Gherkin syntax test scenarios.

- **`target`**: Contains the output of the test runs, including:
  - **Test Reports**: HTML, JSON, and JUnit formats.

## Prerequisites

- **Java 11 or higher**: Ensure you have installed Java Development Kit (JDK) 11 or newer.
- **Maven**: Required for managing and building project dependencies.

## Installation

1. **Clone the repository:**
    git clone https://github.com/Mmansour3011/FlairsTech_AutomationAssessment.git

2. **Navigate to the project directory:**
    cd TestAutomationAssessment_PaySky
   
3. **Install Dependencies**  
  mvn install

## Usage

 ## Running Tests
  Run the tests using Maven:
  mvn test

## Test Result Screenshot

![image](https://github.com/user-attachments/assets/74502f57-ea16-4a30-8ebc-072c7ff3751b)

## Step Definitions

The `StepDefinitions` class outlines the steps for user management scenarios:

- **Setup and Teardown:**
  - `@Before` and `@After` hooks to initialize and clean up WebDriver and related resources.

- **Login and Navigation:**
  - `@Given` step for navigating to the login page.
  - `@When` steps for logging in and navigating to the Admin page.

- **Adding and Deleting a User:**
  - `@When` steps for adding, searching, and deleting a user.
  - `@Then` steps to verify the user count before and after operations.

## Test Reports
  Reports are available in the target/cucumber-reports directory:
  
  HTML Report: report.html
  JSON Report: Cucumber.json
  JUnit Report: Cucumber.xml


## Used Tools

- **Selenium WebDriver**: For browser automation.
- **Cucumber**: For behavior-driven development.

