# ejemplo_servicio_api_rest
#1<br>
./mvnw clean package -DskipTests<br>
#2 <br>
 docker build --no-cache -t ejemplo-api-rest . <br>
#3<br>
docker run -p 8080:8088 ejemplo-api-rest  <br>
