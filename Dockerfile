FROM java:17

EXPOSE 8080

ADD target/SpringbootDockerApp.jar SpringbootDockerApp.jar

ENTRYPOINT ["java","-jar","SpringbootDockerApp.jar"]