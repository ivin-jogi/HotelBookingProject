# Use the official image as a parent image.
FROM openjdk:8

# Inform Docker that the container is listening on the specified port at runtime.
EXPOSE 8080

# Add the file from your host to your current location.
ADD /target/spring-hotel-booking.jar spring-hotel-booking.jar

# Run the specified service within the container.
ENTRYPOINT ["java", "-jar", "spring-hotel-booking.jar"]