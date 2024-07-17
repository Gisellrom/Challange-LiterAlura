

# Challenge-Literalura
Reto Oracle/Alura Back-end

## Objetivo:

Desarrollar un Catálogo de Libros que permita la interacción textual (vía consola) con los usuarios, ofreciendo al menos 5 opciones de interacción. Los libros se buscarán a través de la API [Gutendex](https://gutendex.com), una JSON web API del proyecto Gutenberg.

## Tecnologías utilizadas

- **Java JDK:** versión 17 en adelante
- **Maven:** versión 4 en adelante
- **Postgres:** versión 16 en adelante
- **IDE:** IntelliJ IDEA (opcional)
- **Spring:** versión 3.2.3 - [Spring Initializr](https://start.spring.io/)



### Configuración al crear el proyecto en Spring Initializr:

- Java (versión 17 en adelante)
- Maven (Initializr utiliza la versión 4)
- Spring Boot (versión 3.2.3)
- Proyecto en JAR

### Dependencias para agregar al crear el proyecto en Spring Initializr:

- Spring Data JPA
- Postgres Driver

## Cómo probar esta API
- Paso 1:
  Modificar el archivo: [application.properties](./literalura/src/main/resources/application.properties) reemplazando las variables `DB_NAME`, `DB_USER`, `DB_PASSWORD` por el nombre de una base de datos creada, el nombre de usuario y la contraseña respectivamente, o declarar las variables de entorno de su sistema operativo. 
- Paso 2:
  Ejecutar el archivo `LiteraluraApplication.java`.

## Funcionalidad

### Menú Principal:

![menu principal](https://github.com/user-attachments/assets/bc9f57d6-34ca-45ec-9567-266eeece9661)


1. **Buscar libro por título:** 
   Busca un libro en la API. Si no está registrado en la base de datos, lo guarda; si ya está registrado, informa que el libro ya se encuentra registrado. En ambos casos imprime la información del libro.

   
 ![image](https://github.com/user-attachments/assets/2e5bb905-08a2-4f30-8ff0-ce4fd5bbad86)

 ![image](https://github.com/user-attachments/assets/3c61de66-7925-4ec7-bf88-b635882b2b62)



2. **Listar libros registrados:**
   Lista los libros guardados en la base de datos en orden lexicográfico. Si no hay libros registrados, imprime: "No se encontraron libros registrados".

   ![image](https://github.com/user-attachments/assets/843f4d17-bf83-4ae3-888d-432d8b6c4f81)


3. **Listar autores registrados:**
   Lista los autores registrados en orden lexicográfico en la base de datos. Si no hay autores registrados, imprime: "No se encontraron autores registrados".

   ![image](https://github.com/user-attachments/assets/f7a53489-1f7e-4e3e-8312-01ea162af221)


4. **Listar autores vivos por año:**
   Lista los autores vivos según el año que el usuario ingrese.

   ![image](https://github.com/user-attachments/assets/ef416141-7301-4296-8ce4-f304c9f1bc5e)


5. **Listar libros por idioma:**
   Lista los libros por el idioma que el usuario ingrese. Se ofrece al usuario un menú con las opciones a ingresar.

   ![image](https://github.com/user-attachments/assets/b314670d-08bb-4fdf-aa48-c5f572f04640)

## EXTRAS

- **Generar estadísticas (Opción 6):** Muestra el promedio de descargas, el total de descargas del libro más descargado, el total de descargas del libro menos descargado y el total de libros en la base de datos.
- **Top 10 libros más descargados (Opción 7):** Muestra los 10 libros más descargados en la base de datos.
- **Buscar autor por nombre (Opción 8):** Busca un autor por nombre. Si hay varias coincidencias, muestra una lista para que el usuario elija el correcto.

9. **Salir:**
   Sale del programa.
