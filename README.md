# El abuelo Nicolás - Persistencia

## Requisitos
1. Java 8
2. Tomcat 8
3. MariaDB

## Actualización de la Base de Datos Invetnario:

Las tablas de:
~~~
listaventa 
listacompra
~~~
se deberán modificar con lo siguiente:
~~~
    ALTER TABLE listaventa DROP PRIMARY KEY;
    ALTER TABLE listacompra DROP PRIMARY KEY;
~~~
Lo anterior es para poder agregar más de un producto a las listas de ventas y compras con el mismo id (que hace referencia a la compra o venta de la respectiva lista).

## Procedimiento para subir archivos
1. Crear una rama nueva (New Branch) de preferencia con su nombre
2. Si suben el archivo vía Github:
    1. Seleccionar su rama
    2. Seleccionar Cargar archivos (Upload Files)
    3. Generar un nuevo Pull Request (agreguen comentarios sobre lo que se cambió)
3. Si suben el archivo vía Eclipse:
    1. Seleccionar su rama
    2. Seleccionar archivos modificados
    3. Realizar un Commit and Push (agregar sus comentarios)
    4. Crear un Pull Request de su Push (cuando estén seguros de que funciona)

#### Importante: NO MEZCLAR LAS RAMAS A MENOS QUE ESTÉ FUNCIONANDO AL 100 :) 
