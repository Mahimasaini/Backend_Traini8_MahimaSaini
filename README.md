# Spring Boot REST API Project

A RESTful API built with Spring Boot for managing [entities, e.g., Users, Products, etc.].

## Features

- Post and Get operations for Training center.
- RESTful endpoints with proper HTTP methods.
- Data persistence using Spring Data JPA and MySQL.
- Input validation and custom exception handling.

## Prerequisites

- Java 17+
- Apache Maven 3.6+
- IDE (IntelliJ, Eclipse, or VS Code)

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Mahimasaini/Backend_Traini8_MahimaSaini
   cd your-project
2.  **Navigate to the project directory:**
  ```bash
    cd [project directory]
    ```
3.  **Build the project (using Maven):**

    ```bash
    mvn clean install
    ```
4.  **Configure the database:**
    * Create a database with the name specified in `application.properties`.
    * Update the database credentials in `application.properties` to match your database setup.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```
5.  **Run the application:**

    * **Using Maven:**
        ```bash
        mvn spring-boot:run

## API Endpoints
* `GET /training-center`: Retrieves a list of all training center.
* `POST /training-center`: Creates a new training center.
