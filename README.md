# Automation Testing E2

This Selenium automation framework contains the implementation for Assignment #1 and is designed for Assignment #2.

## Assignments

- **Assignment #1:** Implements practice for Implicit and Explicit waits.
- **Assignment #2:** 
- Follows Page Object Model Design
- Uses Cucumber for BDD, Junit for Assertions
- Uses Enum for creating driver instance.
- Uses Selenium-4.x so, no explicit driver management is required.

## Project Structure

- `src/main/java/com/browserActions` — Browser actions and session handling
- `src/main/java/com/driverManager` — WebDriver and browser management
- `src/main/java/com/pages` — Page objects
- `src/test/java/com/assignments` — JUnit assignment tests
- `src/test/java/com/runner` — Cucumber runner
- `src/test/java/com/stepDefinitions` — Cucumber step definitions
- `src/test/resources` — Cucumber feature files

## Running the Tests

Run the Cucumber tests with:

```bash
mvn test -Dtest=CucumberRunnerTest
```

The Cucumber HTML report is generated at:

```text
target/cucumber-reports.html
```
