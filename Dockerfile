FROM adoptopenjdk/openjdk11:alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} todoapp-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar" , "todoapp-api.jar"]
