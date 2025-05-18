# 🧮 Clean JavaFX Calculator

[![Java](https://img.shields.io/badge/Java-8%2B-blue.svg?logo=java)](https://www.oracle.com/java/)
[![Status](https://img.shields.io/badge/Status-Completed-brightgreen)]()
[![Made by](https://img.shields.io/badge/Made%20By-YourName-orange)]()

A sleek and user-friendly desktop calculator built using **JavaFX** (Java 8).  
Performs basic arithmetic operations (Add, Subtract, Multiply, Divide) with robust input validation and clear error messages.

---

## 🚩 Features

- Clean and minimalistic UI using JavaFX `VBox` and `HBox`
- Input validation with friendly error prompts
- Handles division by zero gracefully
- Responsive button event handling via lambdas
- Displays result dynamically on the UI
- Custom window icon support

---

## 📂 Project Structure

This project consists of a **single Java class**:

- `calculator_javFX.java`: Contains the full JavaFX application code, including UI setup, event handling, and calculation logic.

---

## 💻 Technologies Used

| Technology  | Version          | Purpose                             |
|-------------|------------------|-----------------------------------|
| Java SE     | 8 or above       | Programming language and runtime  |
| JavaFX      | Bundled with Java 8 | GUI framework for desktop UI       |

---

## 🚀 How to Run

1. **Clone or download** the repository.
2. Open the project in an IDE supporting Java 8 and JavaFX (e.g., IntelliJ IDEA).
3. Compile and run the `calculator_javFX` class.
4. Enter two integers in the input fields.
5. Click any operation button to perform calculation.
6. View results or error messages immediately on the interface.

---

## ⚙️ Code Overview

- **UI Components:**  
  Uses `Label`, `TextField`, `Button`, `HBox`, and `VBox` for structured layout.  
  Applies inline CSS to style background color and error messages.

- **Event Handling:**  
  Each operation button triggers the shared `calculate()` method with the operator as parameter.

- **Calculation Logic:**  
  Parses input text fields to integers, handles invalid inputs with exceptions, and manages division-by-zero error elegantly.

---

## 🛠️ Future Improvements

- Support decimal (floating-point) calculations
- Add more operations (modulus, exponentiation)
- Enhance UI with CSS stylesheet for better theming
- Implement keyboard shortcuts for quick input and operations
- Add memory functions (M+, M-, MR, MC)
- Make the app resizable and responsive

---

## 📬 Contact

For suggestions, issues, or collaboration, please reach out via GitHub or email.

---

*Made with ❤️ using JavaFX by ShravanPusdekar*
