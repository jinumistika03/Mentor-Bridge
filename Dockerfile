From openjdk:21-jdk-alpine

ADD target/student-application-mongodb.jar student-application.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","student-application.jar"]