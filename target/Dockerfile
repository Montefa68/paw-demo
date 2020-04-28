FROM openjdk:12.0.2
EXPOSE 8080

ADD  *.jar ms-demo.jar

ENTRYPOINT ["java","-jar","ms-demo.jar"]


ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://api-database:27017/dg","-Djava.security.egd=file:/dev/./urandom","-jar","ms-demo.jar"]
