# Multi-DB E-Commerce Backend

Backend microservices e-commerce platform using Spring Boot, PostgreSQL, MongoDB, Redis, RabbitMQ, Docker, and Kubernetes with multi-arch support.

---

## Features

- User registration, login, and JWT-based authentication
- Product management with flexible NoSQL storage (MongoDB)
- Order management including creation, cancellation, and refunds stored in PostgreSQL
- Shopping cart sessions cached in Redis for performance
- Synchronous inter-service communication using OpenFeign
- Asynchronous event-driven messaging using RabbitMQ
- Layered architecture using controller-service-repository design pattern
- Containerized with Docker and orchestrated on Kubernetes for scalable deployments

---

## Technologies Used

- **Backend Framework:** Spring Boot (Java)
- **Databases:** PostgreSQL (relational), MongoDB (NoSQL)
- **Cache:** Redis
- **Messaging:** RabbitMQ (async communication)
- **API Communication:** OpenFeign (sync REST calls)
- **Security:** JWT for stateless authentication
- **Containerization:** Docker
- **Orchestration:** Kubernetes (configured for multi-architecture support, ensuring seamless deployment across diverse CPU architectures including x86_64 and ARM)

---

## Getting Started

### Prerequisites

- Java 17+ and Maven installed
- Docker & Docker Compose installed
- Kubernetes cluster (e.g., Minikube) up and running
- Running instances of PostgreSQL, MongoDB, Redis, and RabbitMQ (or just use the Docker containers in the setup)

---

## Installation

#### Clone the Repository

```bash
git clone https://github.com/yourusername/multi-db-ecommerce-backend.git
cd multi-db-ecommerce-backend
```
#### Build All Backend Microservices
Run the following commands one by one to build each Spring Boot service:
```bash
cd userservice
mvn clean package

cd ../productservice
mvn clean package

cd ../paymentservice
mvn clean package

cd ../orderservice
mvn clean package

cd ../api-gateway
mvn clean package
```

#### Run with Docker Compose
Build Docker images and start all services and dependencies in detached mode:

```bash
docker-compose up --build -d
```

#### Deploy on Kubernetes with Minikube
1. Start Minikube:
```bash 
minikube start 
```
2. Apply all Kubernetes manifests recursively:
```bash
kubectl apply -f k8s/ --recursive
```
3. Check that all pods are running and ready:
```bash
kubectl get pods
```
4. Access the API Gateway service in your browser:
```bash
minikube service api-gateway
```

## API Documentation

A full Postman collection is included in the repository at:
```bash
/json/E-Commerce_Postman_Collection.json
```
Use this collection to explore and test all available API endpoints, including user management, product management, orders, payments, and more.

---

## Contact

**Menna Naem** – Full Stack Developer

Email: mennan0809@gmail.com  
LinkedIn: [linkedin.com/in/menna-naem-8098a7342](https://www.linkedin.com/in/menna-naem-8098a7342/)  
GitHub: [github.com/mennan0809](https://github.com/mennan0809)
