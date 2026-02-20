FROM docker.io/library/eclipse-temurin:21-jre-noble

ARG JAR_FILE
COPY target/${JAR_FILE} app.jar

CMD ["java", "-jar", "app.jar"]
