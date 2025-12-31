FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy maven wrapper
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Give execute permission
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy source
COPY src src

# Build application
RUN ./mvnw clean package -DskipTests

EXPOSE 10000

CMD ["java", "-jar", "target/*.jar"]

