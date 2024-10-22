FROM openjdk:17
EXPOSE 8080

COPY build.gradle settings.gradle ./
COPY src ./src

RUN ./gradlew build --no-daemon

ADD build/libs/springboot-images-new.jar springboot-images-new.jar

ENTRYPOINT ["java", "-jar", "springboot-images-new.jar"]
