FROM openjdk:17
MAINTAINER "Rajesh Kumar Biswal"
COPY target/blog-app.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080 
ENTRYPOINT ["java", "-jar", "blog-app.jar"]