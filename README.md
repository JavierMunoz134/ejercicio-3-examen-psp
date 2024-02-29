# ejercicio-3-examen-psp
 
Ejercicio 3 Examen PSP

Este proyecto es una aplicación Spring Boot que genera números aleatorios.  

Controladores

El proyecto tiene un controlador, RandomNumberController, que maneja las siguientes rutas:  
GET /random/numbers: Devuelve un array de 100 números aleatorios.
GET /random/number/{d}: Devuelve un número aleatorio de d dígitos.
PUT /random/number: Recibe un número aleatorio y devuelve otro número aleatorio de la misma longitud.

Modelos

El proyecto tiene un modelo, RandomNumber, que representa un número aleatorio.  

Cómo ejecutar el proyecto
Para ejecutar el proyecto, necesitarás tener instalado Java y Maven.
Una vez que el servidor esté en funcionamiento, puedes probar las rutas con cualquier cliente HTTP, como Postman o curl.