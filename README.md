# Password Strength Checker

## What this program does
This is a small Java program that evaluates password strength using simple, rule-based checks.
It prints a score (0–100), a rating (Weak/Medium/Strong), and suggestions for improvement.

Checks included:
- Length
- Character variety (upper/lower/digits/symbols)
- Common weak patterns (e.g., "password", "123456", "qwerty")
- Repeated characters (e.g., "aaa")
- Simple sequences (e.g., "abcd", "1234")

## How to run

### Requirements
- Java (JDK 17+ recommended)
- A terminal or command prompt

### Compile and run
```bash
javac PasswordStrengthChecker.java
java PasswordStrengthChecker
