# PeerVista
Peer-to-Peer Lending Platform (Spring Boot-based web application)

## PeerVista - Peer-to-Peer Lending Platform

**Note: This project is currently in progress. Backend development has been completed, and work on the frontend is underway.**

PeerVista is a Spring Boot-based web application that serves as a peer-to-peer lending platform. It enables users to engage in lending and borrowing transactions, manage expenses, and track credit scores. The application is designed with a focus on security, ease of use, and comprehensive financial management.

## Features

- **User Authentication:** Secure user authentication system to protect user data.
- **Loan Management:** Create and manage loan requests, offers, and agreements.
- **Expense Tracking:** Easily track and manage expenses with detailed categorization.
- **Credit Score Monitoring:** Keep track of credit scores to aid lenders and borrowers.
- **Payment Options:** Multiple payment methods available for seamless transactions.
- **Transaction History:** Detailed transaction history for user reference.
- **Security:** Implement secure coding practices to safeguard sensitive information.

## Technical Stack

- **Backend:** Spring Boot (Java), Spring Security, Spring Data JPA.
- **Database:** MySQL.
- **Frontend:** Angular(Work in Progress).
- **Authentication:** JWT (JSON Web Tokens).
- **Testing:** JUnit for unit testing.

## Getting Started

1. Clone the repository: `git clone https://github.com/shrikantshinde178/PeerVista.git`
2. Navigate to the project directory: `cd PeerVista`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

Ensure that you have Java, Maven, and a compatible database installed before running the application.

## Database Configuration

Modify the database configuration in the `application.properties` file according to your chosen database system.

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/peervista
spring.datasource.username=root
spring.datasource.password=password
