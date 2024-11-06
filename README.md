# Weather Application

This is a Spring Boot application for managing weather records. The application provides REST endpoints to perform CRUD operations on weather data. It stores information about various cities, including temperature and weather conditions, in a database.

## Project Structure

The project consists of five main classes and interfaces:

- `WeatherController`: Handles HTTP requests and defines the main endpoints.
- `WeatherService`: Manages business logic for the weather records.
- `WeatherRepository`: Interacts with the database for CRUD operations.
- `WeatherRecord`: Represents the entity for weather data.
- `WeatherConfig`: Loads configuration properties for default weather settings.

## Files Overview

1. **WeatherController.java**
   - Defines RESTful API endpoints for managing weather data.
   - Endpoints:
     - `GET /api/weather/all`: Retrieve all weather records.
     - `GET /api/weather/{city}`: Retrieve weather details for a specific city.
     - `POST /api/weather/create`: Add a new weather record.
     - `PUT /api/weather/{id}`: Update an existing weather record by ID.
     - `DELETE /api/weather/{id}`: Delete a weather record by ID.
   
2. **WeatherService.java**
   - Contains the business logic for managing weather data.
   - Calls methods from `WeatherRepository` to retrieve, add, update, and delete weather records.

3. **WeatherRepository.java**
   - Extends `JpaRepository` to interact with the database.
   - Provides a custom query method, `findByCity`, to find records by city.

4. **WeatherRecord.java**
   - Represents the `weather_records` database table.
   - Fields:
     - `id`: Unique identifier for each record.
     - `city`: City name, must be unique and non-null.
     - `temperature`: Current temperature in the city.
     - `condition`: Current weather condition.

5. **WeatherConfig.java**
   - Configures weather settings, including default weather condition and city-specific temperature ranges.
   - Uses `@ConfigurationProperties` to load properties prefixed with "weather".

6. **HelloWorldApplication.java**
   - Main application class that runs the Spring Boot application.

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- Spring Boot 2.7+

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/weather-application.git
   cd weather-application
   
2. Build the application:
    ```bash
      mvn clean install
4. Run the application:
   ```bash
     mvn spring-boot:run


