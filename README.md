# ejemplo_servicio_api_rest
#1
./mvnw clean package -DskipTests
#2 
 docker build --no-cache -t ejemplo-api-rest .
#3
docker run -p 8080:8088 ejemplo-api-rest  
