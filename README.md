# nabd-springboot

Simple Spring Boot skeleton for Nabd Platform (Real-Time Prices)

## Run locally

1. Configure `src/main/resources/application.properties` with your MySQL credentials.
2. Build with Maven:
   ```bash
   mvn clean package
   ```
3. Run:
   ```bash
   java -jar target/nabd-springboot-0.0.1-SNAPSHOT.jar
   ```

## Endpoints (examples)
- GET /api/products
- POST /api/products
- GET /api/products/search?q=rice
- GET /api/stores
- POST /api/stores
- GET /api/users
- POST /api/users

## Docker
Build image:
```bash
mvn clean package -DskipTests
docker build -t nabd-service .
docker run -p 8080:8080 nabd-service
```
