FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw

# 🔥 FULLY skip tests (IMPORTANT)
RUN ./mvnw clean package -Dmaven.test.skip=true

EXPOSE 8080

CMD ["java", "-jar", "target/childsafety-0.0.1-SNAPSHOT.jar"]
