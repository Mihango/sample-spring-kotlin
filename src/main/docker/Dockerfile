FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/sample-microservice
ADD @project.build.finalName@.jar /usr/local/sample-microservice
ADD run.sh run.sh
RUN chmod +x run.sh
0CM0D .run.sh
