# Vehicle Rental System — Java Practical Programs

This repository contains separate Java programs for a Vehicle Rental System, prepared for a Java practical record manual.

## Programs

1. Class, Object and Constructor
2. Method Overloading, Access Modifiers and Static Method
3. Scanner Class
4. Multilevel and Hierarchical Inheritance
5. Method Overriding in Single Inheritance
6. Abstract Class and Interface
7. Exception Handling
8. Multithreading and Inter-Thread Communication
9. Built-in and User-Defined Packages
10. Multithreading and Synchronization Using Multiple Locks

Each program is in its own folder so the examples remain independent and can reuse class names without conflicts.

## Program 9: Packages

The package example has this structure:

```text
Program09_Packages/
├── RentalApplication.java
└── vehiclerental/
    └── Vehicle.java
```

`Vehicle.java` belongs to the user-defined `vehiclerental` package. `RentalApplication.java` imports it and also uses the built-in `java.util.Scanner` package.

## Notes

- These are beginner-friendly educational examples, not a production-ready rental application.
- Thread scheduling is nondeterministic, so the output order of multithreading programs may vary.
- The Java source files are grouped into separate folders to make them easier to browse on GitHub.
