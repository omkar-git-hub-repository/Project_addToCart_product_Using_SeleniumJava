# OpenCart Add-to-Cart Automation using Selenium Java

This project automates the process of adding a product to the cart on the OpenCart web application using Selenium and Java. The project demonstrates best practices in test automation by employing the Page Object Model (POM), generating Extent Reports, and capturing screenshots for validation.

## Project Goal

The primary goal of this project is to showcase the following:

1. **Automation Testing Skills**: Demonstrating proficiency in Selenium with Java for automating user flows.
2. **Efficient Code Structure**: Using the Page Object Model (POM) to organize and manage files effectively.
3. **Report Generation**: Integrating Extent Reports for professional and detailed output of test execution.
4. **Validation via Screenshots**: Capturing critical steps in the automation process for visual verification.

## Features

- Automates the "search product" and "add to cart" functionalities in OpenCart.
- Implements the Page Object Model (POM) to separate test cases and page elements.
- Captures screenshots of:
  - The searched product.
  - The cart after adding the product.
- Generates comprehensive test execution reports using Extent Reports.

## Why This Project?

1. **Real-World Application**: Simulates an actual user workflow in an e-commerce application.
2. **Hands-On Learning**: Enhances understanding of Selenium Java with structured code practices.
3. **Professional Output**: Demonstrates the importance of test reports and screenshots in automation testing.
4. **Best Practices**: Encourages using frameworks like POM for maintainable and scalable code.

## Basics Covered

1. **Selenium WebDriver**: Automating browser interactions.
2. **Java Programming**: Writing test scripts and managing object-oriented concepts.
3. **Extent Reports**: Generating visually appealing and detailed test reports.
4. **Screenshots**: Capturing critical stages for debugging and validation.

## Prerequisites

Before running this project, ensure you have:

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Maven**: For dependency management.
- **Eclipse IDE**: For running the TestNG suite.
- **TestNG Plugin**: Installed in Eclipse.
- **Selenium WebDriver**: Compatible with your browser version.
- **Extent Reports Library**: Integrated in the `pom.xml`.
- A compatible **browser driver** (e.g., ChromeDriver or GeckoDriver).

## Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/opencart-add-to-cart-automation.git

2. ## Import the project into Eclipse:

Open Eclipse IDE.
Click on File > Import.
Select Existing Maven Projects.
Browse to the project directory and click Finish.

3. ## How to Run the Project
Open Eclipse IDE.
Locate the add-to-cart-master.xml file in the test folder.
Right-click on add-to-cart-master.xml.
Select Run As > TestNG Suite.

4. ## Output
Extent Report: Found in the reports directory.
Screenshots: Stored in the screenshots folder for:
The searched product.
The cart after adding the product.