# Password Strength Checker

## Overview

This project is a simple Java-based password strength tester.  
It evaluates a password using rule-based checks and provides:

- A numerical score (0–100)
- A rating (Weak / Medium / Strong)
- Suggestions for improving password strength

---

## What the Program Checks

The program evaluates:

- Password length
- Use of uppercase letters
- Use of lowercase letters
- Use of digits
- Use of special characters
- Repeated character runs (e.g., `aaa`, `111`)
- Simple sequential patterns (e.g., `1234`, `abcd`)

---

## How to Run

### Requirements:

- Java JDK 17 or higher
- Git (if cloning the repository)
- A terminal or command prompt

---

### Procedure:

#### 1) Clone or Download the Repository

**Option A: Clone with Git**
- Run a terminal or command prompt
- $ git clone https://github.com/MoonJ97/Block2-Project.git
- $ cd Block2-Project

**Option A: Clone with Git**
- Go to https://github.com/MoonJ97/Block2-Project
- Click 'Code' and 'Download ZIP'
- Extract the ZIP file
- Open a terminal inside the extracted folder

#### 2) Compile and Run
- Compile the program using:
    - $ javac PasswordStrengthChecker.java
- Run the program using:
    - $ java PasswordStrengthChecker
- Follow the script on the prompt to check a password

---

## Limitations

This tool is for educational purposes only.

- The scoring mechanism is heuristic-oriented and does not conform to a recognized security standard.
- It does not compare passwords to real-world leaked password lists.
- It does not calculate actual password entropy or resistance to advanced attacks.
- A high score does not necessarily mean a password is secure.
- Password entry is displayed in the console. Do not use real passwords for important accounts.

This program is intended to illustrate fundamental principles of password security, not to offer professional-level security testing.

---

## Ethical Considerations and Responsible Use

This project illustrates a fundamental principle of password security. Although it is intended to encourage sound password hygiene, it could be abused if not used responsibly.

Possible misuse includes:
- Giving users a false sense of security if they rely only on this score.
- Logging, storing, or transmitting user passwords without their consent.
- Using this program to test real user passwords in a non-consensual or otherwise unethical setting.

Responsible use guidelines:

- Use this program only for educational or testing purposes.
- Do not log, store, or transmit passwords entered into the program.
- Do not use this program as a professional-level security auditing system.
- Recommend users of this program to use password managers and multi-factor authentication for real security.

Security-related software carries ethical responsibility. Developers should ensure transparency, avoid misleading users, and prioritize user privacy and safety.