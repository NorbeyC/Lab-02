# parte 1

## Utilidad
* Facilitar el proceso de construcción
* Proporcionar un sistema de construcción uniforme
* Proporcionar información de calidad sobre el proyecto
* Fomentar mejores prácticas de desarrollo

## Fases
Las principales fases de maven son:

* validate: se encarga de comprobar si toda la información, y todas las dependencias necesarias para la construcción estan disponibles.
* compile: realiza la compilación del código fuente.
* test-compile: realiza la compilación de los casos de prueba.
* test: ejecuta las clases de pruebas.
* package: empaquete el código compilado en un paquete distribuible en base al tipo de proyecto (jar, war, ...).
* integration-test: ejecuta los test de integración con el paquete ya ensamblado.
* install: copia el paquete en el repositorio local.
* deploy: copia el paquete en el repositorio remoto.

## Ciclo de vida

* default: se encarga de construir y desplegar el proyecto.
* clean: se encarga de borrar todos los ficheros generados por alguna de las fase de maven.
* site: se encarga de generar la documentación del proyecto, y la estructura en un documento html.

## Plugins

Al añadir un plugin a un proyecto:

* El plugin puede incluir un proceso de ejecución de forma automática dentro de una fase. Por ejemplo el plugin maven-javadoc-plugin se encargará de lanzar la documentación javadoc como parte de la generación de la documentación técnica.
* El plugin registra una serie de objetivos que se deberán ejecutan explicitamente. Por ejemplo, si registramos el pluign de sonar, podemos ejecutarlo llamadao a mvn sonar:sonar. Dicho goal está registrado en la fase de post-test, y se encargará de subir a sonar el resultado de los tests.
* En el descriptor podemos adjuntar un objetivo a una fase. De esta forma podríamos coger el plugin anterior de sonar, e indicar que queremos que el objetivo sonar:sonar se ejecute de manera automática durante la la fase de post-test. De esta forma, siempre que con maven ejecutemos una fase que incluya la fase de test, automáticamente se subirá el informe a sonar.

## Repositorio Central

* El repositorio central de Maven es un repositorio proporcionado por la comunidad de Maven. Contiene una gran cantidad de bibliotecas de uso común.