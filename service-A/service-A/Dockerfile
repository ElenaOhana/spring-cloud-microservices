FROM openjdk:11
COPY ./target/service-A-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch service-A-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","service-A-0.0.1-SNAPSHOT.jar"]
