# Singleton Design Pattern

## Overview

The Singleton Design Pattern is a creational design pattern that ensures only one instance of a class is created and provides a single point of access to that instance.

## Real-World Example

A database connection manager can be shared across an application.

Instead of creating multiple `DatabaseConnection` objects, the Singleton pattern ensures that only one object is created and reused whenever a database connection is needed.

## UML Diagram

```text
              DatabaseConnection
              <<Singleton>>
              ───────────────────
              - instance
              - DatabaseConnection()
              + getInstance()
              + connect()
```

## Structure

### Singleton

`DatabaseConnection` is the Singleton class.

It contains:

* A `private static` instance.
* A `private` constructor.
* A `public static getInstance()` method.

### Private Constructor

The private constructor prevents other classes from creating objects directly using `new`.

### getInstance()

`getInstance()` creates the object only when the instance does not already exist. Otherwise, it returns the existing object.

## Example

```java
DatabaseConnection db1 =
        DatabaseConnection.getInstance();

DatabaseConnection db2 =
        DatabaseConnection.getInstance();

db1.connect();

System.out.println(db1 == db2);
```

### Output

```text
Database Connection Created
Connected to Database
true
```

Both `db1` and `db2` refer to the same object.

## Benefits

* Ensures only one instance of a class is created.
* Provides a single point of access to the instance.
* Avoids unnecessary object creation.
* Allows the same object to be reused throughout the application.

## Key Idea

> Singleton Pattern ensures that only one object of a class is created and the same object is reused whenever it is needed.
