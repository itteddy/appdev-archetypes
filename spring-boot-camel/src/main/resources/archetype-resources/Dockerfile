FROM openjdk:11-jre-buster
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
EXPOSE 8081