FROM openjdk:18
LABEL Descripcion="Java App Show properties System" Autor="Kevin piña" Version="0.0.1"
MAINTAINER kevin@kevinpina.com
WORKDIR microservice
ADD demo/target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/microservice/demo-0.0.1-SNAPSHOT.jar"]
