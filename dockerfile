# 1. Imagen base oficial de Java 11 compatible con Mac M1/M2/M3/M4 (ARM64)
FROM eclipse-temurin:11-jre-focal

# 2. Configurar el directorio de trabajo dentro del contenedor
WORKDIR /app

# 3. Copiar el archivo JAR generado por Maven
COPY target/ejemplo_servicio_api_rest-0.0.1-SNAPSHOT.jar app.jar

# 4. Exponer el puerto por defecto de Spring Boot
EXPOSE 8088

# 5. Comando para arrancar la API REST
ENTRYPOINT ["java", "-jar", "app.jar"]
