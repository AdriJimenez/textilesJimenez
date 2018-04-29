
# Textiles Jiménez

## Descripción

 Programa desarrollado para el control de la contabilidad de la empresa Textiles Jiménez, con el fin de controlar las áreas económicas y tener la información correcta sobre los ingresos y egresos. Es importante conocer los valores de cada una de las áreas para realizar mayor o menor inversión conforme se vayan realizando las entregas.
 Otro punto importante es controlar las fechas de entregas para evitar retrasos y se generen pérdidas por las penalizaciones que ejecutan las empresas.


## Problema identificado

 La empresa no cuenta con un control sobre la producción, hablando exclusivamente de entregas y también de las prendas que el diseño conlleva bordado o estampado, además se desconocen los gastos que se generan en todos los departamentos, por ejemplo:

- Materia prima

- Pago trabajadores

El problema principal es realizar el cálculo cuando se termina la temporada se tiene que realizar la cuenta y no se tienen los valores correctos para que la empresa conozca cuánto fue el total de su inversión en materia prima, la cantidad exacta en el pago a los trabajadores y también el total de la ganancia para la empresa.

Este problema se ha tenido desde hace muchos años y cada temporada representa un problema para la empresa porque la inversión muchas ocasiones es mayor que la ganancia.


## Solución

Con este sistema se pretende ayudar a tener un mejor control sobre dichas áreas y obtener mayores ganancias para la empresa, debido a que este sistema permitirá controlar la inversión en material prima, pago a trabajadores y otros gastos generados por la empresa.
También ayudará a conocer con exactitud las fechas de entrega de los pedidos y las fechas de envío para los pedidos que el diseño conlleve un bordado o estampado, con este control se pretende evitar retrasos en la entrega a las tiendas departamentales.
Otro punto importante, es el control de los pagos a trabajadores, de esta manera se conocerá la cantidad exacta que ganan porque se controlará por los nombres de cada uno.
La materia prima también es importante conocer el total que se invierte porque el precio por kilo no se mantiene toda la temporada, cada cierto tiempo se incrementa el precio por varias razones, dado que si no se conoce este dato con certeza se pueden tener pérdidas al final de la temporada.


## Arquitectura

![](arquitectura.jpg)


## Tabla de contenidos
- [Requerimientos](#requerimientos)
     - [Servidores de aplicación y base de datos](#servidores-de-aplicacion-base-de-datos)
     - [Paquetes adicionales](#paquetes-adicionales)
     - [Version de Java](#version-de-java)
- [Instalación](#instalación)
     - [Instalación del ambiente de desarrollo](#instalación-del-ambiente-de-desarrollo)
     - [Ejecución de pruebas manualmente](#ejecución-de-pruebas-manualmente)
- [Configuración](#configuración)
     - [Configuración del producto](#configuración-del-producto)
     - [Configuración de los requerimientos](#configuración-de-los-requerimientos)
- [Uso](#uso)
     - [Manual para usuario final](#manual-para-usuario-final)
     - [Pedidos](#pedidos)
     - [Pagos trabajadores](#pagos-trabajadores)
     - [Registro de préstamos](#registros-de-préstamos)
     - [Materia prima](#materia-prima)
     - [Cuenta total](#cuenta-total)
     - [Sección de referencia para usuario administrador](#sección-de-referencia-para-usuario-administrador)
- [Roadmap](#roadmap)
     - [Requerimientos a implementar en un futuro](#requerimientos-a-implementar-en-un-futuro)

<!-- toc -->

## Requerimientos

### Servidores de aplicacion, base de datos

- Servidor de aplicación. MAMP versión 4
- Base de datos. MySQL con PHP

### Paquetes adicionales

Ninguno

### Version de Java
- Java. 8
- JDK. 1.8
- NetBeans. 8.2


## Instalación

### Instalación del ambiente de desarollo

El ejecutable se creará en el programa Launch4j para que sea extensión .exe, además de crear el archivo .jar

Utilizando este programa, el ejecutable se podrá correr en la computadora seleccionada e incluso volver a instalar si se llega a desinstalar por alguna circunstancia externa al administrador.

_Instrucciones:_
- Ejecutable MAMP en el escritorio, dar doble clic y posteriormente dar clic en “Iniciar Servidores”.
- El usuario dará doble clic sobre el ejecutable TextilesJimenez.jar; que se encontrará ubicado en el escritorio del equipo.
- La aplicación se abrirá y el usuario podrá comenzar a utilizarla.


### Ejecución de pruebas manualmente

Las pruebas se realizan de una manera sencilla, si se abre la página principal de phpMyAdmin y no se tiene respuesta es porque no se ha iniciado el servidor MySQL Server.

Otra prueba es al ingresar información en las tablas y que no se guarde el registro en la base de datos.

Las pruebas no pueden ser muy variadas para este sistema porque su funcionamiento es básico y solo interviene el sistema con la base de datos.


## Configuración

### Configuración del producto
El sistema TextilesJimenez solo requiere la configuración de la base de datos, la instalación del servidor en este caso MAMP para que pueda realizar la conexión y los cambios efectuados se guarden de forma correcta.

La aplicación TextilesJimenez ya está configurada para funcionar sin la necesidad de alguna configuración adicional.

### Configuración de los requerimientos
- Instalación de MAMP.
- Corroborar que el puerto de Apache sea 80.
- Corroborar que el puerto de MySQL sea 3306.


## Uso

### Manual para usuario final

El usuario ingresará a la aplicación ubicada en el escritorio de la computadora principal.
La primera pantalla que visualizará será el menú principal con las opciones:

- Pedidos
- Pagos trabajadores
- Materia prima
- Registro de préstamos
- Cuenta total


### Pedidos

En la opción Pedidos se tendrá el botón Modificar, al dar clic en el botón el usuario ingresará a la pantalla principal Pedidos y Bordado.

La pantalla controlará las modificaciones de las fechas de entrega para Pedidos y Bordado; en la sección de Pedidos se tendrá un TextField donde el usuario ingresará el modelo del suéter a buscar, a continuación, dará clic en el botón “Buscar”, en la tabla se mostrarán los resultados a partir de la búsqueda realizada en la base de datos; el usuario seleccionará la fila en la columna Fecha del modelo deseado.

En la parte inferior de la pantalla se encuentra otro TextField donde el usuario ingresará el nuevo estatus del modelo seleccionado, teniendo como opciones:

-	Modificar la fecha de entrega
- Cambiar el estatus a Entregado

En la sección de Bordados se tendrá un TextField donde el usuario ingresará el modelo del suéter a buscar, a continuación, dará clic en el botón “Buscar”, en la tabla se mostrarán los resultados a partir de la búsqueda realizada en la base de datos; el usuario seleccionará la fila en la columna Fecha del modelo deseado.

De la misma manera que en Pedidos, el usuario ingresará el nuevo estatus del modelo seleccionado, teniendo como opciones:

- Modificar la fecha de entrega
- Cambiar el estatus a Entregado


### Pagos trabajadores

En el menú principal, en la opción Pagos se tendrá el botón Modificar, al dar clic en el botón el usuario ingresará a la pantalla principal Pagos Trabajadores.

En la pantalla Pagos Trabajadores se controlará la información con referencia a los pagos realizados a los trabajadores tomando en cuenta que los pagos son realizados semanalmente. La pantalla solo cuenta con una tabla donde ingresarán los datos del empleado, dicha tabla tiene las columnas:

-	Nombre
-	Fecha
-	Total pago

El usuario tendrá que ingresar valores correctos en cada columna de la tabla, cuando termine de llenar la fila se dará doble clic sobre la fila y a continuación en el botón Guardar que se encuentra ubicado en la parte inferior derecha, se mostrará un mensaje solicitando la confirmación del ingreso de datos, al dar clic en Si se realizará la actualización en la base de datos por el contrario al dar clic en No regresará a la misma pantalla.


### Registro de préstamos

En el menú principal se seleccionará la pestaña Préstamos donde se mostrará el botón Modificar, al dar clic en el botón el usuario ingresará a la pantalla principal Registro de préstamos.

En la pantalla Registro de préstamos se controlará los préstamos que le otorgan a la empresa los principales compradores para conocer el total de préstamos que se realizan en toda la temporada.

En dicha pantalla se contará con una tabla donde se ingresarán los datos necesarios para tener dicho control, la tabla contiene las columnas:

-	Fecha
-	Cantidad

El usuario tendrá que ingresar los valores solicitados en cada columna para poder realizar el registro de forma exitosa, cuando se termine de llenar los dos campos se dará clic en el botón Guardar que se encuentra localizado en la parte inferior derecha, se mostrará un mensaje de confirmación para poder ingresar los valores a la base de datos y tener un registro exitoso.


### Materia prima

En el menú principal se seleccionará la pestaña Materia prima donde se mostrará el botón Modificar, al dar clic en dicho botón el usuario ingresará en la pantalla principal Materia prima.

En la pantalla Materia prima se controlará la compra de la materia prima, en la empresa Textiles Jiménez se trabaja con hilo acrílico calibre 2/30, es importante para la empresa tener el control sobre esta información porque el precio de la materia prima puede tener varios cambios a lo largo del año, además de conocer los kilos necesarios para producir cierto número de prendas.

En la pantalla se tendrá una tabla donde se ingresará la información:

-	Fecha
-	No. Factura
-	Kilos
-	Total Neto

El usuario tendrá que ingresar valores en cada columna para poder realizar el registro en la base de datos de forma exitosa, cuando se termine de llenar las columnas de la tabla se dará clic en el botón Guardar que se encuentra localizado en la parte inferior derecha, se mostrará un mensaje de confirmación para ingresar la información de la factura en la base de datos.


### Cuenta total

En el menú principal se seleccionará la pestaña Cuenta donde se mostrará el botón Modificar, al dar clic en dicho botón el usuario ingresará en la pantalla principal Cuenta Total.

En la pantalla Cuenta Total se controlará la información de los pedidos realizados por los compradores, se divide en tres secciones:

-	Chaleco
-	Suéteres niño
-	Suéteres niña
  
Las tres tablas cuentan con las mismas columnas las cuales son:

-	Modelo
-	No. Orden
-	Cantidad
-	Precio
-	Total
  
Se tiene que ingresar información en todas las columnas para no generar problemas con la base de datos, además de ser necesario todos los datos para que la contabilidad sea correcta cuando se consulte al final de la temporada. Después de ingresar los datos en la tabla deseada, el usuario dará clic en el botón “Guardar”.


### Sección de referencia para usuario administrador

No se cuentan con áreas exclusivas porque este sistema lo utilizará solamente el gerente de la empresa, se instalará solamente en su equipo personal. El administrador podrá ver las mismas funciones que el gerente.


## Roadmap

### Requerimientos a implementar en un futuro

Los requerimientos por implementar son:

-	Control en las fechas de entrega, marcar advertencia por fecha de vencimiento.
-	Generar reporte mensual de ingresos y egresos.
-	Desarrollo de aplicación móvil.
