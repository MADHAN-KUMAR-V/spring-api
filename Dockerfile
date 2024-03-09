FROM openjdk:21-slim

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the working directory
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the application using Maven
RUN mvn clean install

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/my-app.jar"]
