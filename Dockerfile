FROM openjdk:8
ADD target/spring-boot-sample-dockerimg.jar spring-boot-sample-dockerimg.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","spring-boot-sample-docker-jenkins.jar"]