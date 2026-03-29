FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/CourseProject-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"	]