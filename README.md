### Descripción
Proyecto creado para simular el servidor de una api graphql.
Es un proyecto donde los datos estan quemados, es decir, 
no hay comunicacion con componentes externos.

### Usar imagen de DockerHub
1. <code>docker pull braduran/graphql-api:latest</code>
6. Crear contenedor <code> docker run --name mock-api -p 9090:9090 -d braduran/graphql-api:latest</code>
7. Pobrar api en el navegador <code>http://localhost:9090/graphiql </code>

### Modificar repositorio, construir imagen y crear contenedor
1. Clonar el repositorio
2. Modificar codigo
3. Limpiar y construir artefacto 
   - Linux o mac <code>./gradlew clean build</code>
   - Windows <code>./gradlew.bat clean build</code>

4. Desde la consola ir a la carpeta <code>deployment</code>
5. Ejecutar el comando <code>docker build -t "mock-api-image" .</code>
6. Crear contenedor <code> docker run --name mock-api -p 9090:9090 -d mock-api-image </code>
7. Pobrar api en el navegador <code>http://localhost:9090/graphiql</code>