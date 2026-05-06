# Finance Tracker Microservices

Personal finance tracker built with Spring Boot microservices, MongoDB, Spring Cloud Gateway, Eureka Discovery, JWT security, and Next.js PWA.

## Services

| Service | Port | Purpose |
|---|---:|---|
| finance-discovery-service | 8761 | Eureka service registry |
| finance-api-gateway | 8080 | Single entry point for frontend |
| finance-auth-service | 8081 | Signup, login, JWT |
| finance-account-service | 8082 | Accounts and categories |
| finance-transaction-service | 8083 | Income and expense transactions |

## Local startup order

1. discovery-service
2. api-gateway
3. auth-service
4. account-service
5. transaction-service