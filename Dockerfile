FROM openjdk:11
ADD target/ci-cd-github-0.0.1-SNAPSHOT.jar ci-cd-github-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ci-cd-github-0.0.1-SNAPSHOT.jar"]