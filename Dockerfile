FROM maven:3.8.6-openjdk-18 as builder

COPY .  /home/maven/src
WORKDIR /home/maven/src
RUN mvn clean package

FROM eclipse-temurin:18-jdk-jammy
EXPOSE 8080
COPY --from=builder /home/maven/src/target/parknRide-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
ENTRYPOINT java -server -jar parknRide-0.0.1-SNAPSHOT.jar
