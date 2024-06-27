FROM openjdk:22-jdk-slim AS build

WORKDIR /app

COPY . .

RUN ./mvnw package -DskipTests

FROM openjdk:22-jdk-slim

WORKDIR /app

COPY --from=build /app/target/sticky-notes-kiii-0.0.1-SNAPSHOT.jar sticky-notes-kiii.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sticky-notes-kiii.jar"]

