# GitHub Copilot Code Review Example

A small sample Java project demonstrating how to use **GitHub Copilot** for automated code reviews on pull requests.

## Project Structure

```
.
├── .github/
│   └── copilot-instructions.md   # Copilot code review instructions
├── src/
│   ├── main/java/com/example/
│   │   └── Calculator.java       # Sample Calculator class
│   └── test/java/com/example/
│       └── CalculatorTest.java   # JUnit 5 tests
└── pom.xml                       # Maven build file
```

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+

### Build

```bash
mvn compile
```

### Run Tests

```bash
mvn test
```

## How to Use This Example

1. Fork or clone this repository.
2. Create a new feature branch.
3. Add a new method to `Calculator.java` (e.g., `divide`).
4. Write a corresponding test in `CalculatorTest.java`.
5. Open a pull request — GitHub Copilot will review your changes according to the instructions in `.github/copilot-instructions.md`.