FROM adoptopenjdk/openjdk11:alpine
ADD target/todoapp-api-0.0.1-SNAPSHOT.jar todoapp-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar" , "todoapp-api.jar"]
