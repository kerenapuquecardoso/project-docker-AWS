FROM openjdk:21
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar