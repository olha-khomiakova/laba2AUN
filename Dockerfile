FROM openjdk:8-jdk-alpine
COPY ./build/libs/*.jar application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","application.jar"]