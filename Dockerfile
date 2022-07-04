FROM openjdk:8-alpine

COPY target/uberjar/libre-my-neon.jar /libre-my-neon/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/libre-my-neon/app.jar"]
