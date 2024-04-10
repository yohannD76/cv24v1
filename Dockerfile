FROM openjdk:17-alpine
WORKDIR /
RUN mvn spring-boot:run

