FROM openjdk:24-slim-bullseye
ADD target/topic-management-service.jar topic-management-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "topic-management-service.jar"]