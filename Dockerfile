FROM openjdk:17
EXPOSE 8080

COPY build.gradle settings.gradle ./
COPY gradlew ./
COPY gradle ./gradle/
COPY src ./src

RUN chmod +x ./gradlew

RUN ./gradlew build --no-daemon

COPY build/libs/*.jar springboot-images-new.jar

ENTRYPOINT ["java", "-jar", "springboot-images-new.jar"]
