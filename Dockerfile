FROM eclipse-temurin:17-jdk-alpine


COPY target/*.jar app.jar

CMD ["java", "-jar", "/app.jar"]



or


FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY /*.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]
