FROM openjdk:17
EXPOSE 8092
ADD target/login-boot-docker.jar login-boot-docker.jar
ENTRYPOINT ["java","-jar","login-boot-docker.jar"]