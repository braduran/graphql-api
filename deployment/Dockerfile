FROM adoptopenjdk/openjdk11-openj9
EXPOSE 9090
RUN mkdir /opt/app
ADD '../build/graphql-api.jar' /opt/app
CMD ["java", "-jar", "/opt/app/graphql-api.jar"]