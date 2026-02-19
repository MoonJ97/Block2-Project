# Password Strength Tester (Java)

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