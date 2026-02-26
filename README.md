# Java Task Manager (Console App)

A simple console-based task manager written in Java. Users can create tasks, view them, and mark tasks as completed. Tasks are saved to a local file so they persist between program runs.

## Features
- Add tasks
- View tasks
- Mark tasks as done
- Persistent storage (save/load from `tasks.txt`)

## Tech / Concepts
- Java, OOP
- Collections (`ArrayList`)
- File I/O (BufferedReader/BufferedWriter)
- Basic input validation
- Git version control

## How to run
1. Clone the repository
2. Open the project in Eclipse
3. Run `Main.java` as a Java Application

## Project structure
- `Main.java` – console menu / user input
- `Task.java` – task model (title, done)
- `TaskManager.java` – task logic (add/show/mark done, save/load)

## Notes
`tasks.txt` is ignored via `.gitignore` because it contains local runtime data.# Java Task Manager (Console Application)

This project is a simple console-based task manager written in Java.  
Users can create tasks, view them, and mark tasks as completed.  
Tasks are saved locally so they are still available after restarting the program.

## Features
- Add new tasks
- View all tasks
- Mark tasks as completed
- Persistent storage using a local file (`tasks.txt`)

## Technologies / Concepts
- Java
- Object-Oriented Programming (OOP)
- Collections (ArrayList)
- File I/O (BufferedReader / BufferedWriter)
- Basic user input handling (Scanner)
- Git & GitHub version control

## How to Run
1. Clone the repository
2. Open the project in Eclipse
3. Run `Main.java` as a Java Application
4. Follow the console menu

## Project Structure
- `Main.java` → Console menu and user interaction
- `Task.java` → Task model (title + done state)
- `TaskManager.java` → Application logic (add, display, mark done, save/load)

## Notes
The file `tasks.txt` is intentionally excluded via `.gitignore` because it contains local runtime data and should not be part of the repository.# java-task-manager