FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /workspace

# Copia poms primero (mejor caché)
COPY pom.xml .
COPY sdk/pom.xml sdk/pom.xml
COPY api/pom.xml api/pom.xml

# Descarga deps (esto ya no falla porque sdk será un módulo)
RUN --mount=type=cache,target=/root/.m2 mvn -DskipTests dependency:go-offline

# Copia código y compila
COPY sdk sdk
COPY api api
RUN --mount=type=cache,target=/root/.m2 mvn -DskipTests package

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /workspace/api/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]