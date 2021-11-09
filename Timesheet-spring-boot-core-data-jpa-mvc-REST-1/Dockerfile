FROM openjdk:11.0.7-jdk-slim

VOLUME /tmp

RUN echo '[DOCKER] Building in progress...'

ADD target/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-0.0.1-SNAPSHOT.war /usr/share/devops/app.war

ENTRYPOINT [ "java", "-jar","-Dspring.datasource.url=${datasourceUrl}","-Dspring.datasource.password=${password}","-Dspring.datasource.username=${username}","/usr/share/devops/app.war" ]

EXPOSE 8081

RUN echo '[DOCKER] Build completed!'