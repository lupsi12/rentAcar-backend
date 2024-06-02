# RENT A CAR

## Overview
This project is a web-based application developed using the Spring Boot framework, PostgreSQL database management system, and Hibernate ORM framework for handling database operations. It follows a well-structured architecture with distinct layers for business logic, data access, and presentation. Data transfer between layers is managed using DTO (Data Transfer Object) classes.

## Technologies Used
- Spring Boot
- PostgreSQL
- Hibernate ORM
- Spring MVC
- Swagger UI
- Java Bean Validation API
- Hibernate Validator

## Features
- **Spring Boot**: Provides a powerful platform for building and running Spring applications.
- **PostgreSQL**: A robust open-source relational database management system used for storing application data.
- **Hibernate ORM**: Facilitates object-relational mapping and simplifies database operations.
- **Spring MVC**: A model-view-controller framework for building web applications in Java.
- **Swagger UI**: Allows for interactive API documentation and testing.
- **Java Bean Validation API**: Provides a framework for validating data using annotations.
- **Hibernate Validator**: An implementation of the Java Bean Validation API for Hibernate-specific validation rules.

## Architecture
The project follows a layered architecture with the following components:
1. **Presentation Layer**: Handles user interaction and displays information to the user. Implemented using Spring MVC.
2. **Business Layer**: Contains the application's business logic and rules.
3. **Data Access Layer**: Responsible for interacting with the database. Utilizes Hibernate ORM for database operations.
4. **Data Transfer Objects (DTO)**: Classes used for transferring data between layers.

## Getting Started
To run the project locally, follow these steps:
1. Clone the repository: `git clone <https://github.com/lupsi12/rentAcar-backend.git>`
2. Navigate to the project directory: `cd <project-directory>`
3. Configure the PostgreSQL database connection in the `application.properties` file.
4. Build the project using Maven: `mvn clean install`
5. Run the application: `java -jar target/<rentAcar>.jar`
6. Access the application in a web browser: `http://localhost:8080`

## API Documentation
API documentation is available using Swagger UI. Once the application is running locally, access the Swagger UI interface at `http://localhost:8080/swagger-ui.html`.
