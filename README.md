# Proyecto

Este proyecto esta dedicado para la presentación de la Feria de FP Curso 23-24 que se celebra en IES Santiago Apostol en Almendralejo (Badajoz)

## Tecnología 

 > Spring version 3.2.7
 Dependencias de spring
 - lombok (1.18)
 - jpa
 -  H2
 -   web
 > Base datos: 
  - H2
  - MysQL (Migración posterior) 


## Aplicación 

La aplicación se bada en un ejemplo simple de posts (orientado a Tweeter actual X)


## Features

### Listar Posts

Lista todos los mensajes guardados en la Base de datos

### Crear Post

Crea un post persistiendolo en la Base de datos

### Listar Post por usuario

Lista los mensajes que posteo un usuario

### Dar o quitar Like a Post

El campo like de un post cambiara segun la elección del usuario


## EnPoints

A continuación se indican los endpoint correspondientes a las features mencionadas anteriormente:

Por defecto al correr la aplicación tiene el puerto 8080 (cambiar en src/main/resources/application.properties si se necesita)

Raíz de URL: `http://localhost:8080/api..`

- Listar Post:
  
    `http://localhost:8080/api/mensajes/todos`
  
- Crear Post:
  
   `http://localhost:8080/api/mensajes/nuevo`
  
   Este metodo necesita un body:
  ```
  {
    "campo":"Mi primer Post!!",
    "likes":false,
    "usuario":{
        "nombreUsuario":"jesus_garcia",
        "email":"jesusjava@gmail.com"
    }
  }
  ```
  
- Listar post por usuario:
  
  `http://localhost:8080/api/mensajes/byusuario/jesus_garcia`
  
- Dar o quitar Like a Post:
  
  `http://localhost:8080/api/mensajes/likechange`
  
  Este endpoint necesita un body como entrada:
  ```
  {
    "id":7,
    "likes":false,
  }
  ```
