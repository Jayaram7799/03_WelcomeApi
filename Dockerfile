FROM openjdk:17

WORKDIR /user/welcomeapp

COPY target/WelcomeApi.jar /user/welcomeapp

EXPOSE 8080

ENTRYPOINT [ "java","-jar","WelcomeApi.jar" ]
