# Advanced Java Lab

Generated on: 2026-03-16

This README includes topic mapping, clickable file links, and run instructions.

## TABLE OF CONTENTS

| S No. | Topic                                                                                                                          | Mapped File/Folder       |
| ----: | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------ |
|     1 | Java Program to Demonstrate Class Members, Access Modifiers, this Keyword, Object Creation, and Reference Variables            | [java1.java](java1.java) |
|     2 | Java Program to Demonstrate Single and Multidimensional Arrays Using length and For-Each Loop                                  | [java2.java](java2.java) |
|     3 | Program to Demonstrate String Class Constructors, String Methods, and Comparison of String, StringBuffer, and StringBuilder    | [java3.java](java3.java) |
|     4 | Program to Demonstrate Inheritance and Polymorphism (Method Overloading and Method Overriding)                                 | [java4.java](java4.java) |
|     5 | Program to Demonstrate Exception Handling with Try-Catch, Multiple Catch Clauses, and Finally Block                            | [java5.java](java5.java) |
|     6 | Program to Demonstrate User-Defined Exceptions Using throw, throws, and Throwable                                              | [java6.java](java6.java) |
|     7 | Program to Create Threads Using Thread Class and Runnable Interface with Thread Life Cycle Demonstration                       | [java7.java](java7.java) |
|     8 | Java Program Using Multithreading to Solve Real-World Problems                                                                 | [java8.java](java8.java) |
|     9 | Java Servlet Program for Database Operations Using PreparedStatement (Insert, Update, Delete, Retrieve, Display in HTML Table) | [pg9/](pg9/)             |
|    10 | Java Servlet Program for Database Operations Using CallableStatement (Insert, Update, Delete, Retrieve, Display in HTML Table) | [pg10/](pg10/)           |
|    11 | Servlet Session Tracking with Login Validation Using HttpSession                                                               | [pg11/](pg11/)           |

## How to Run

### Run Single Java Programs (java1.java to java8.java and demos)

```powershell
javac java1.java
java java1
```

Replace `java1` with any class name, for example `java2`, `java8`, `DivisionByZeroDemo`, or `SharedCounterDemo`.

### Run Maven Web Projects (pg9, pg10, pg11)

```powershell
cd pg9
mvn clean package
```

Do the same for `pg10` and `pg11`. The generated `.war` files will be in each `target/` folder.
