# ChatApp
A Java-based interactive Chat App featuring secure user registration, username and password validation, South African cellphone verification, authentication, interactive error handling, and comprehensive JUnit 5 testing.
# 💬 Chat App

A Java-based interactive Chat App that demonstrates user registration, input validation, authentication, and automated testing. The project provides a simple console-based experience where users can register their details, receive instant feedback when information is incorrect, and log in using their registered credentials.

---

## 📌 About the Project

The Chat App was developed using Java to demonstrate fundamental programming concepts such as methods, conditional statements, loops, string validation, regular expressions, user input, and unit testing.

The project focuses on creating a simple but reliable registration and login system. Instead of stopping when a user enters incorrect information, the Chat App allows them to try again until the required information is correctly entered.

---

## ✨ Features

### 👤 User Registration

Users are asked to provide:

* First name
* Last name
* Username
* Password
* South African cellphone number

Each piece of information is validated before registration can continue.

### 🆔 Username Validation

The username must:

* Contain an underscore (`_`)
* Be no more than 5 characters long

Example of a valid username:

```text
kyl_1
```

### 🔐 Password Validation

The password must contain:

* At least 8 characters
* At least one capital letter
* At least one number
* At least one special character

Example:

```text
Ch&&sec@ke99!
```

### 📱 Cellphone Number Validation

The Chat App validates South African cellphone numbers using the international `+27` format.

Example:

```text
+27838968976
```

### 🔄 Interactive Validation

If incorrect information is entered, the Chat App does not immediately terminate.

Instead, it displays an error message and asks the user to enter the information again.

For example:

```text
Enter password: password

Password is not correctly formatted.
Please enter your password again.

Enter password: Password1!

Password successfully captured.
```

### 🔑 Login Authentication

After successful registration, the user must enter the correct username and password to log in.

Incorrect login details result in another attempt.

A successful login displays a personalised welcome message using the user's first and last name.

---

## 🧪 Unit Testing

The project uses **JUnit 5** to test the registration and login functionality.

The test class verifies both valid and invalid scenarios, including:

* Valid username
* Invalid username
* Valid password
* Invalid password
* Valid cellphone number
* Invalid cellphone number
* Successful registration
* Invalid registration
* Successful login
* Failed login

The tests help ensure that the validation and authentication methods behave as expected.

---

## 🛠️ Technologies Used

| Technology | Purpose                   |
| ---------- | ------------------------- |
| Java       | Main programming language |
| JUnit 5    | Unit testing              |
| NetBeans   | Development environment   |
| Git        | Version control           |
| GitHub     | Project hosting           |

---

## 📂 Project Structure

```text
ChatApp
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.mycompany.chatapp
│   │           ├── ChatApp.java
│   │           └── RegistrationApp.java
│   │
│   └── test
│       └── java
│           └── com.mycompany.chatapp
│               └── RegistrationAppTest.java
│
└── README.md
```

---

## 💻 Example

A successful registration and login may look like:

```text
================================
          CHAT APP
================================

Enter your first name: John
Enter your last name: Smith

--- REGISTRATION ---

Enter username: kyl_1
Username successfully captured.

Enter password: Ch&&sec@ke99!
Password successfully captured.

Enter South African cell phone number:
(e.g. +27838968976): +27838968976

Cell phone number successfully added.

Registration Result:
User registered successfully!

--- LOGIN ---

Enter username: kyl_1
Enter password: Ch&&sec@ke99!

Welcome John, Smith it is great to see you again.
```

---

## 🎯 Learning Objectives

This project demonstrates practical knowledge of:

* Java classes and methods
* Static methods and variables
* Conditional statements
* `while` loops
* `Scanner` for user input
* String manipulation
* Character validation
* Regular expressions
* Boolean logic
* User authentication
* Error handling
* JUnit 5 unit testing
* Git and GitHub version control

---

## 🚀 How to Run

### 1. Clone the repository

Clone the project from GitHub and open it in your Java development environment.

### 2. Open the project

Open the project in **NetBeans** or another Java IDE that supports the project configuration.

### 3. Run the Chat App

Run:

```text
ChatApp.java
```

The Chat App will open in the console and guide you through the registration and login process.

### 4. Run the tests

Open:

```text
RegistrationAppTest.java
```

Then run the JUnit tests using your IDE's test functionality.

---

## 🧪 Testing Example

The project uses assertions such as:

```java
assertTrue(
    RegistrationApp.checkUserName("kyl_1")
);
```

and:

```java
assertFalse(
    RegistrationApp.loginUser(
        "kyl_1",
        "WrongPassword1!"
    )
);
```

These tests verify that the Chat App correctly handles both successful and unsuccessful scenarios.

---

## 🔒 Validation Rules

| Field     | Requirement                                         |
| --------- | --------------------------------------------------- |
| Username  | Must contain `_` and be ≤ 5 characters              |
| Password  | Minimum 8 characters                                |
| Password  | Must contain a capital letter                       |
| Password  | Must contain a number                               |
| Password  | Must contain a special character                    |
| Cellphone | Must use `+27` international format                 |
| Login     | Username and password must match registered details |

---

## 🌟 Future Improvements

Possible future improvements include:

* Adding an actual chat messaging system
* Supporting multiple registered users
* Storing users in a database
* Encrypting passwords
* Adding a graphical user interface
* Adding profile management
* Adding message history
* Adding timestamps to messages
* Adding more extensive automated tests

---

## 👨‍💻 Author

Developed as a Java programming project demonstrating registration, authentication, validation, and unit testing.

---

## 📄 License

This project is intended for educational and demonstration purposes.
            REFERENCES
## References

1. Apache Software Foundation (2025) *Apache Maven Documentation*. Available at: https://maven.apache.org/guides/ (Accessed: 19 September 2026).

2. GitHub (2026) *GitHub Documentation*. Available at: https://docs.github.com/ (Accessed: 19 September 2026).

3. Git (2026) *Git Documentation*. Available at: https://git-scm.com/doc (Accessed: 19 September 2026).

4. JUnit Team (2026) *JUnit 5 User Guide*. Available at: https://junit.org/junit5/docs/current/user-guide/ (Accessed: 19 September 2026).

5. Oracle (2026) *Java Documentation*. Available at: https://docs.oracle.com/en/java/ (Accessed: 19 September 2026).

6. Oracle (2026) *The Java™ Tutorials: Regular Expressions*. Available at: https://docs.oracle.com/javase/tutorial/essential/regex/ (Accessed: 19 September 2026).

7. Oracle (2026) *The Java™ Tutorials: Control Flow Statements*. Available at: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html (Accessed: 19 September 2026).

8. Oracle (2026) *The Java™ Tutorials: Reading, Writing, and Creating Files*. Available at: https://docs.oracle.com/javase/tutorial/essential/io/ (Accessed: 19 September 2026).

9. Apache NetBeans (2026) *Apache NetBeans Documentation*. Available at: https://netbeans.apache.org/help/index.html (Accessed: 19 September 2026).

10. Sommerville, I. (2016) *Software Engineering*. 10th edn. Boston: Pearson.
