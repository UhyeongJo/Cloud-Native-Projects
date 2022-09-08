FROM openjdk:8-jre
COPY --chown=appuser:appuser target/*.jar /home/appuser/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
