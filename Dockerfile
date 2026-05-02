FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY . .
RUN apk add --no-cache maven
RUN mvn clean package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/*.jar"]