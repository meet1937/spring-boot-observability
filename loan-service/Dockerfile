FROM eclipse-temurin:17-jre

LABEL authors="meet.dhami"

ADD target/loan-service-0.0.1-SNAPSHOT.jar /app.jar

ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

ENTRYPOINT java -javaagent:/opentelemetry-javaagent.jar \
           -jar /app.jar