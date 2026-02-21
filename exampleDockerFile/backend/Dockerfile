#FROM docker.io/library/eclipse-temurin:21-jre-noble
#
#ARG JAR_FILE
## COPY target/${JAR_FILE} app.jar
#COPY target/backend.jar app.jar
#CMD ["java", "-jar", "app.jar"]


FROM maven:3.9 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre-noble
WORKDIR /app
COPY --from=builder /app/target/backend.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

