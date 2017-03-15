FROM openjdk:8-alpine

WORKDIR /opt/app/

EXPOSE 8080

COPY ./build/libs/user-0.0.1-SNAPSHOT.jar /opt/app/

CMD ["java", "-jar", "user-0.0.1-SNAPSHOT.jar"]