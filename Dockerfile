FROM openjdk:11

COPY target/Spring_Boot_App.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","Spring_Boot_App.jar"]
