# Use a lightweight JDK image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the application (skip tests to speed up)
RUN ./mvnw clean package -DskipTests

# Expose port 8080 for the app
EXPOSE 8080

# Run the built jar file
CMD ["java", "-jar", "target/springboot-issa-0.0.1-SNAPSHOT.jar"]
