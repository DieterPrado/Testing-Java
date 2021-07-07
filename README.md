# Testing Java
### Table of contents
- General info
- Technologies
- Setup
- Things learned


------------

### General info
This repository contains files and summary of things learned in the Platzi's Testing Java course. The testing java course taught how to create a test class and name and perform tests in that class. It also taught how to simulate classes so we can force certain behaviors or results and make more comprehensive tests. The files created within different packages contain code that should be tested to ensure the code works fine to solve different probles. The paymets package has code for payments processing. The util package contains DateUtil class, used to determine if a year is leap or not, and the StringUtil class, used to repeat a given string a certain number of times. The player package contains files used to throw a dice. And fnially the movies package contains files to select, filter and add movies to a simulated database. Each scenario has its own testing class within the Tests directory.

------------

### Technologies
- OpenJDK8 (requieres installation)
- IntelliJ IDEA (requieres installation)

Requiered dependencies. Used within Intellij IDEA.
- JUnit
- Mockito
- H2databases
- Spring

------------

### Setup

###### IntelliJ IDEA 
- Go to https://www.jetbrains.com/idea/download/ and download the Community version

###### OpenJDK
- Go to https://adoptopenjdk.net/ and download the following version:
    - OpenJDK 8

------------
###### JUnit
- Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
- `<dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
   </dependency>`

###### Mockito
- Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
- `<dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>2.23.4</version>
            <scope>test</scope>
   </dependency>`

###### H2databases
- Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
- `<dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>1.4.192</version>
   </dependency>`

###### Spring
- Copy the next code and insert it into the pom.xml file in the dependencies part of the code.
- `<dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>5.1.3.RELEASE</version>
   </dependency>`

------------
### Things learned
- Importance of tests.
- How to create a test.
- How tests should be named.
- How to write and run a test.
- How tests should be planned and executed.
- Tests workflow.
- How to obtain a simulated and specific result of a class using Mockito.
- Connection to simulated databases using H2databases.
- Organization of apps in layers. (interface, business, data, databases).
- Test types (Unitary, Integration, Functional, StartToEnd).
- Differences between manual and automatic tests.
- TDD cycle.

------------
### Commands
|  Command | Function  |
| ------------ | ------------ |
| @Test | Creates a test. |
| @Before | Executes code before a test begins. |
| @After | Executes code every time a test ends.|
| assertEquals() | Creates a test. |
| Mockito.mock(Class class) | Simulates a class instance. |
| Mockito.when() | Simulates a result of the simulated class instance. |
| CoreMatchers.is() | Command from CoreMatchers library utilized to compare 2 values and return a boolen value. |


