# E-Commerce Microservices

A modern e-commerce platform built with Spring Boot microservices architecture.

## Architecture

The application is composed of the following microservices:

- Config Server - Centralized configuration management
- Discovery Server - Service registry and discovery
- Gateway Service - API Gateway
- Customer Service - Customer management
- Order Service - Order processing
- Product Service - Product catalog management
- Payment Service - Payment processing
- Notification Service - Email notifications

## Tech Stack

- Java
- Spring Boot
- Spring Cloud
- Maven
- PostgreSQL
- Apache Kafka
- Docker

## Infrastructure Services

The project includes the following infrastructure components:

- PostgreSQL - Main relational database
- Kafka - Message broker
- PgAdmin - PostgreSQL administration

## Getting Started

### Prerequisites

- Java 17+
- Maven
- Docker

### Running the Application

1. Start the infrastructure services:
    ```docker
    docker-compose up -d
    ```

2. Access the management interfaces:
   - PgAdmin: http://localhost:5050
   - MailDev: http://localhost:1080

3. Service Ports
   - Config Server: 8888
   - Discovery Server: 8761
   - API Gateway: 8080
   - PostgreSQL: 5432
   - Kafka: 9092
```git
  git clone https://github. com/PsyKnight/e-commerce.git
```
