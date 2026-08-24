# Doc Editor

A Java-based Low-Level Design (LLD) practice project focused on understanding and applying **SOLID principles** through a simple document editor.

## Project Overview

This project demonstrates how a simple document editor design can be improved by identifying design problems and applying SOLID principles.

The project contains two implementations:

* **Bad Design** — the initial implementation with tightly coupled responsibilities.
* **Better Design** — the improved implementation after applying SOLID principles.

## Project Structure

```text
doc-editor/
├── src/
│   ├── baddesign/
│   │   └── Main.java
│   │
│   └── betterdesign/
│       └── Main.java
│
├── better-document.txt
├── mydocument.txt
└── README.md
```

## Bad Design

The initial implementation puts multiple responsibilities into the same class.

This creates problems such as:

* Difficult to maintain
* Difficult to extend
* Tightly coupled code
* Changes in one responsibility can affect other parts of the code

## Better Design

The better implementation separates responsibilities and makes the code easier to maintain and extend.

The design is improved by applying appropriate **SOLID principles**.

## SOLID Principles

### Single Responsibility Principle (SRP)

A class should have one responsibility and one reason to change.

### Open/Closed Principle (OCP)

The design should be open for extension but closed for modification.

### Liskov Substitution Principle (LSP)

Subclasses should be replaceable for their parent types without breaking the expected behavior.

### Interface Segregation Principle (ISP)

Classes should not be forced to depend on methods they do not need.

### Dependency Inversion Principle (DIP)

High-level modules should depend on abstractions rather than concrete implementations.

## What I Learned

Through this project, I practiced:

* Understanding bad design
* Identifying SOLID violations
* Refactoring existing code
* Separating responsibilities
* Using interfaces and abstractions
* Writing more maintainable Java code

## Technologies

* Java
* Object-Oriented Programming
* SOLID Principles
* Low-Level Design (LLD)

## How to Run

Open the project in IntelliJ IDEA and run the `Main.java` file inside:

```text
src/baddesign/
```

to see the initial implementation.

Then run:

```text
src/betterdesign/
```

to see the improved implementation using SOLID principles.

## Purpose

This project is the first step in my Low-Level Design practice, focusing on building a strong understanding of **SOLID principles before moving on to design patterns**.
