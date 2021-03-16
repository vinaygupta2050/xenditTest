# Xendit assignment solution

## Getting Started
To get started clone project from github. Below are some component which has their significance running the test

### Prerequisites
Below applications should be installed before running this project
- Java >1.8
- Maven
- Chrome browser

## Running the tests

If we are running the application from IDE below steps needs to be followed

- Right click on testng.xml and choose the option to run
- If only 1 test class needs to be runned please uncomment the line number 14 in CalculatorTest.java file.

## Test cases covered

- Verified whether user is able to press numbers and arithmetic operators
- Verified whether user is able to get results for arithmetic operation on 2 positive number.
- Verified whether user is able to get results for arithmetic operation on 2 negative number.
- Verified whether user is able to get results for arithmetic operation on 1 positive and 1 negative number.
- Verified whether user is able to clear the entered values
- Verified whether user is able to get results if any number is divied by 0.
- Verified whether user can only enter max 9 digits
- Verify whether the user is able to perform arithmetic operation on decimal numbers

## Note
- As the whole app is based on canvas. I am unable to extract text which would have helped me to place assertions check. But to manage this issue the suite can generate the screenshots for the respective test so that user can manually verify the results. We can solve this issue with OCR as well but due to time constraints this is he work around I came up.
- As I have used Mac OS to write these test. If in case we are running this test on Windows machine we need to change "/" with "\" in InvocationListener.java file line number 43




