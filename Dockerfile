FROM eclipse-temurin:17-jdk-alpine

# Refer to Maven build -> finalName
ARG JAR_FILE=target/logging-springboot-splunk-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]