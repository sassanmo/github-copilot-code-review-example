# GitHub Copilot Code Review Instructions

## Purpose
This repository is a sample Java project used to demonstrate GitHub Copilot code review capabilities. When reviewing pull requests in this repository, please follow the guidelines below.

## Code Review Guidelines

### General
- Review all changed files for correctness, readability, and maintainability.
- Flag any code that does not follow Java naming conventions (classes in PascalCase, methods and variables in camelCase, constants in UPPER_SNAKE_CASE).
- Highlight potential null pointer exceptions or unhandled edge cases.

### Formatting & Naming Conventions
- Ensure code is consistently formatted according to the project's style (indentation, spacing, braces, etc.).
- Review for proper use of whitespace and alignment to improve readability.
- Check that files, classes, methods, and variables follow established naming conventions.
- Flag any inconsistent or unclear naming that could reduce maintainability.

### Logic & Correctness
- Verify that new methods implement the intended behavior correctly.
- Check for off-by-one errors, incorrect operator usage, or missing return paths.
- Ensure arithmetic operations handle edge cases such as division by zero.

### Testing
- Confirm that new methods are covered by unit tests.
- Tests should follow the naming pattern `methodName_descriptionOfScenario` (e.g., `add_returnsSumOfTwoPositiveNumbers`).
- Each test should have a single assertion where possible and use descriptive assertion messages.

### Documentation
- Every public method should have a Javadoc comment describing its purpose, parameters (`@param`), and return value (`@return`).
- Inline comments should only be added when the logic is non-obvious.

### Security & Best Practices
- Avoid exposing internal state unnecessarily; prefer immutable designs where applicable.
- Do not introduce magic numbers — use named constants instead.
- Flag any use of deprecated APIs.
