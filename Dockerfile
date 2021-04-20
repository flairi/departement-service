FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/app
COPY target/departement-service-0.0.1-SNAPSHOT.jar /opt/app/departement-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/opt/app/departement-service-0.0.1.jar"]