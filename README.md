# apirestautomated
reto de automatización de servicios con serenity bdd, manejando modelado json

## Manual Técnico
** [Justificación](#Justificación)
1. [Librerías](#Librerias)
2. [Ejecución](#Ejecucion)

## Contenido
<a name="Justificación"></a>
### Justificación
***
Se toma la iniciativa de realizar el reto en ScreenPlay ya que la forma correcta de trabajar con modelos y objetos JSON es a través del patron mensionado.
El código se trabaja de la forma más moderna, limpia y eficaz posible.
***

<a name="Librerias"></a>
### Librerías
***
* serenity-cucumber6:2.6.0
* serenity-screenplay:2.6.0
* serenity-screenplay-rest:2.6.0
* serenity-junit:2.6.0
* junit:junit:4.13.1
* slf4j-api:1.7.5
* assertj-core:3.23.1
* hamcrest-all:1.3
* serenity-core:2.6.0
* serenity-screenplay-webdriver:1.9.0
* lombok:1.18.10
***
<a name="Ejecucion"></a>
### Ejecución
El proyecto se puede ejecutar desde la clase Runner "src/test/java/io/swagger/petstore/runners", debidamente cambiando el tag a ejecutar,
y para el caso de desear validar la creación de usuario, se puede ejecutar el UserTest, cambiando el userName dentro del mismo test, éste se creó con la intensión de hacer una validación rápida de un endPoint asociado al método GET, el cual no es obligatorio del reto.



