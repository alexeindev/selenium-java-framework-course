# Selenium Java Test Framework - Best Practices Course Project

<!-- Add your project screenshot/banner here -->
<img width="1536" height="1312" alt="Screenshot 2026-01-20 at 3 28 41 PM" src="https://github.com/user-attachments/assets/ea4b1198-0f7f-4f63-ae21-c91e868b7a78" />

## 🌐 Application Under Test (AUT)

**E-Commerce Practice Website**

This framework is built to automate a live e-commerce web application, covering end-to-end testing scenarios including:
- User Registration & Login
- Product Search & Filtering
- Shopping Cart Management
- Checkout Process
- Order Management

**Website URL:** `[[Practice Site](https://askomdch.com/)]`

> **Note:** This is a dedicated practice website designed for automation testing. All test scenarios are executed in a safe, controlled environment.

---

## 📋 Project Description

Test automation framework developed following industry best practices, using Selenium WebDriver 4.x with Java, TestNG, and Maven. This project implements the Page Object Model (POM) and various design patterns to create a scalable, maintainable, and reusable framework.

## 🎯 Framework Goals

- Implement a robust framework following **50+ industry best practices**
- Apply SOLID principles: **Single Responsibility Principle (SRP)** and **Don't Repeat Yourself (DRY)**
- Develop clean, optimized, and maintainable code
- Integrate APIs to optimize testing (skip login, set test data, set application state)
- Automate test execution through CI/CD with Jenkins

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|-----------|---------|---------|
| Java | 21 | Programming Language |
| Selenium WebDriver | 4.15.0+ | Web Automation |
| TestNG / JUnit | Latest | Testing Framework |
| Maven | Latest | Dependency & Build Management |
| Jenkins | Latest | Continuous Integration |
| Git/GitHub | Latest | Version Control |

## ⚙️ Prerequisites

- **JDK 21** or higher installed
- **Maven** configured in PATH
- **IDE** recommended: IntelliJ IDEA / Eclipse
- **Git** for version control
- Browsers: Chrome, Firefox (latest versions)

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/selenium-java-test-framework.git
cd selenium-java-test-framework
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. WebDriver Configuration
The framework uses WebDriverManager to manage drivers automatically. No manual configuration needed.

## 🎨 Design Patterns Implemented

- **Page Object Model (POM)**
- **Factory Design Pattern**
- **Singleton Pattern**

## 🔧 OOP Concepts Implemented

- **Inheritance**
- **Encapsulation**
- **Polymorphism**
- **Abstraction**

## 🧪 Running Tests

### Run all tests
```bash
mvn clean test
```

### Run specific suite
```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

### Run on specific browser
```bash
mvn clean test -Dbrowser=chrome
mvn clean test -Dbrowser=firefox
```

### Run in headless mode
```bash
mvn clean test -Dheadless=true
```

## 🔗 API Integration

The framework integrates API calls for:
- **Skip Login**: Authentication via tokens/cookies
- **Set Test Data**: Test data preparation via API
- **Set Application State**: Application state configuration

## 📊 Reporting

- TestNG HTML Reports
- Extent Reports
- Jenkins Integration for CI/CD dashboards

## 🔄 CI/CD Integration

### Jenkins Configuration
- Auto-trigger automation using **GitHub Web Hooks**
- **SCM Polling** for repository changes
- **Build Frequency** scheduling

## 📚 Course Reference

Based on **"Selenium Java Test Framework & Best Practices - Masterclass"** by Omprakash Chavan (Udemy)
