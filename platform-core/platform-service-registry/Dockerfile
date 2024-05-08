FROM openjdk:17
EXPOSE 8080
ADD target/discovery-server.jar discovery-server.jar
ENTRYPOINT ["java", "-jar" ,"/discovery-server.jar"]