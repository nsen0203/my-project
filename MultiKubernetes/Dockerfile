FROM openjdk:23
WORKDIR /MultiKubernetes
COPY target/MultiKubernetes-0.0.1-SNAPSHOT.jar MultiKubernetes-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "java", "jar", "/MultiKubernetes/target/MultiKubernetes-0.0.1-SNAPSHOT.jar" ]