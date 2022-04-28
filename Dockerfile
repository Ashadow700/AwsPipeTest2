# selects parent image from which we will build our docker image (we are building on top of a diffrent image =)
FROM maven:3.8.5-jdk-11

# copy the source tree and the pom.xml to our new container
COPY ./ ./

# package our application code
RUN mvn clean package
# set the startup command to execute the jar
CMD ["java", "-jar", "target/AwsPipeTest2-0.0.1-SNAPSHOT.jar"]
