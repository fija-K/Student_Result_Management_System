# Student Result Management System

A beginner-friendly Java console application for managing student result records. This project was built after learning Java for about 7 days, with the goal of practicing methods, `ArrayList`, user input, loops, conditionals, and basic program structure.

## About The Project

The Student Result Management System lets a user store and manage student records from the terminal. It supports adding students, viewing saved records, searching by name or roll number, updating marks, and calculating grades.

This is a simple console-based project, but it helped me understand how real programs are divided into smaller methods and how data can be passed between them.

## Features

- Add student details
- Store student name, roll number, and marks
- View all student records
- Search student by name
- Search student by roll number
- Update marks using roll number
- Calculate grade based on marks
- Validate menu choices
- Validate marks between 0 and 100

## Concepts Used

- Java methods
- `ArrayList`
- `Scanner` input
- Loops
- Conditional statements
- Passing data to methods
- Basic input validation

## How To Run

Make sure Java is installed on your system.

1. Clone the repository:

```bash
git clone https://github.com/fija-K/Student_Result_Management_System.git
```

2. Open the project folder:

```bash
cd Student_Result_Management_System
```

3. Compile the Java file:

```bash
javac Student_Result_Management_System.java
```

4. Run the program:

```bash
java Student_Result_Management_System
```

## Example Menu

```text
1. Add Student
2. View Students
3. Search Student
4. Update Marks
5. Calculate Grade
6. Exit
```

## Project Structure

```text
Student_Result_Management_System
├── Student_Result_Management_System.java
├── README.md
└── .gitignore
```

## Current Limitations

- Data is stored only while the program is running
- Data is not saved to a file or database yet
- Roll numbers are expected to be entered in order
- The project currently runs only in the console

## Future Improvements

- Save student records in a file
- Prevent duplicate roll numbers
- Improve grade calculation ranges
- Add better table formatting
- Replace repeated menu calls with a loop-based menu
- Create a GUI version later

## Author

Made by [fija-K](https://github.com/fija-K) as an early Java learning project.
