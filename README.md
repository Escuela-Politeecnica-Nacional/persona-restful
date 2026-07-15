# persona-restful

## Ejecución

El servidor Tomcat está embebido en el propio proyecto, por lo que no requiere instalación ni configuración externa de Tomcat. Basta con ejecutar la clase Main.java directamente desde el IDE, como cualquier aplicación Java normal.

Desde Eclipse (o cualquier IDE)
1. Abrir el proyecto en el IDE.
2. Ubicar el archivo Main.java (paquete raíz, src/main/java).
3. Clic derecho sobre Main.java → Run As → Java Application.
4. Esperar en la consola el siguiente mensaje, que confirma que el servidor está activo:


Servidor arriba en http://localhost:8080/api/

## Ejemplos de prueba (Postman / curl)

1. Listar todas

´´´
GET http://localhost:8080/api/personas/listar
´´´

2. Buscar por cédula

´´´
GET http://localhost:8080/api/personas/buscar/1714171819
´´´

3. Crear

´´´
POST http://localhost:8080/api/personas/crear
Content-Type: application/json

{
    "id": 3,
    "nombre": "Carlos",
    "cedula": "1714171821",
    "edad": 30
}
´´´

4. Actualizar

´´´
PUT http://localhost:8080/api/personas/actualizar
Content-Type: application/json

{
    "id": 1,
    "nombre": "Jose Actualizado",
    "cedula": "1714171819",
    "edad": 25
}
´´´

5. Eliminar

´´´
DELETE http://localhost:8080/api/personas/eliminar/2
´´´
