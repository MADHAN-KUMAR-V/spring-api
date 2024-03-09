FROM openjdk:21-slim

COPY . /app

RUN mvn clean install

EXPOSE 8080

CMD ["java", "-jar", "target/my-app.jar"]