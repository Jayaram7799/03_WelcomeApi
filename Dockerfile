FROM openjdk:17

COPY target/WelcomeApi.jar /use/app

WORKDIR /use/app

EXPOSE 8080

ENTRYPOINT [ "java","-jar","WelcomeApi.jar" ]