# Janitri Backend Assignment

## Description
This is a Spring Boot-based backend application designed for managing tasks as part of the Janitri Backend Assignment. The application provides CRUD (Create, Read, Update, Delete) operations for managing data.

## Features
- RESTful APIs for managing data.
- Database integration using Spring Data JPA and MySQL.
- Configurable using `application.properties`.
- Built with Maven for easy dependency management and builds.

## Technologies Used
- **Java 17**
- **Spring Boot 3.4.0**
- **Spring Data JPA**
- **MySQL**
- **Maven**

## Prerequisites
Before running this application, ensure you have the following installed:

1. Java 17 or higher
2. Maven 3.4 or higher
3. MySQL Server

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd janitriAssignment
   ```

2. Configure the database:
   - Create a database in MySQL.
   - Update the `application.properties` file in the `src/main/resources` directory with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/<your-database-name>
     spring.datasource.username=<your-username>
     spring.datasource.password=<your-password>

     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the application:
   - The application will be running at `http://localhost:8080`.

## Endpoints
Below are some of the available endpoints (example):

- `GET /api/v1/tasks` - Retrieve all tasks
- `POST /api/v1/tasks` - Create a new task
- `PUT /api/v1/tasks/{id}` - Update a task
- `DELETE /api/v1/tasks/{id}` - Delete a task

## Testing
Run the tests using Maven:
```bash
mvn test
```
Test results can be found in the `target/surefire-reports` directory.

## Troubleshooting
- Ensure your MySQL server is running and the database credentials are correctly configured in `application.properties`.
- For detailed debugging, run Maven with the `-X` flag:
  ```bash
  mvn -X spring-boot:run
  ```

## License
This project is for educational purposes and is not licensed for commercial use.

---

Feel free to contribute or raise issues!
