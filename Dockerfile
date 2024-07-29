#
# Build
#
FROM maven:3.8.4-openjdk-11

# Install git
RUN apt-get update && apt-get install -y git

# Copy the project files
COPY src /home/app/src
COPY pom.xml /home/app

# Build the project
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:17-alpine
COPY --from=build /home/app/target/Testsample-0.0.1-SNAPSHOT.jar /usr/local/lib/Testsample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/Testsample-0.0.1-SNAPSHOT.jar"]2
