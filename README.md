# DTO + MapStruct + Spring Boot

Ejemplo corto y listo para clase.

## Requisitos
- Java 17+
- Maven 3.9+
- VS Code + Extension Pack for Java

## Ejecutar
En la terminal, dentro de la carpeta:

mvn spring-boot:run

También puedes abrir DemoApplication.java y ejecutar Run Java.

## API
GET http://localhost:8080/api/productos

POST http://localhost:8080/api/productos

Body:
{"nombre":"Monitor","precio":850000}

## Base de datos
Se usa H2 local para que funcione sin instalar MySQL.

Consola: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:file:./data/dto_demo
Usuario: sa
Contraseña: vacía

## Concepto
Entity = representa los datos persistidos.
DTO = transporta los datos que queremos comunicar.
MapStruct = convierte Entity <-> DTO automáticamente.
