FROM openjdk:11
COPY ./target/config-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch config-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","config-0.0.1-SNAPSHOT.jar"]
