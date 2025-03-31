FROM openjdk:17
WORKDIR /app
COPY ./target/demo.jar /app
EXPOSE 8081
CMD ["java", "-jar", "demo.jar"]