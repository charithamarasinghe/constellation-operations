FROM maven:3.5-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests

FROM openjdk:8
COPY --from=build /usr/src/app/target/constellation-operations-0.0.1-SNAPSHOT.jar /usr/local/lib/constellation-app.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","/usr/local/lib/constellation-app.jar"]