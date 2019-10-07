FROM openjdk:8
RUN mkdir app
ADD target/configurationserver-0.0.1-SNAPSHOT.jar app/docker-config-server.jar
WORKDIR app
RUN "pwd"
RUN "ls"
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "docker-config-server.jar"]



