FROM openjdk:10
ADD target/dockerspringboot.jar dockerspringboot.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","dockerspringboot.jar"]