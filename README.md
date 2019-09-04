# Mollapp
Examen Programación Java - 3ª evaluación Dual Septiembre 2019  
  
En Palma ha comenzado a operar una nueva start-up que promueve el uso compartido de coches eléctricos.  

Un vez que un usuario/a se da de alta en el sistema, la empresa proporciona una aplicación para el móvil llamada mollapp que permite acceder a los coches que la empresa y los usuarios/as estacionan en diversos lugares de Palma.  

Cuando una persona quiere utilizar uno de los vehículos, la aplicación del móvil envía una petición al sistema, que solicita su autenticación con el nombre del usuario/a, y el sistema autoriza el acceso al coche. Después, el sistema envía al vehículo la señal inalámbrica de abrir la puerta del vehículo.  

Construye la arquitectura del sistema de tal manera que la app móvil solicite las dos comprobaciones especificadas al sistema, que estas sean ejecutadas por el sistema y que este envíe la señal de abrir la puerta del vehículo, teniendo en cuenta que:  

El orden de ejecución de las tareas es definido en el instante de configurar el sistema.  
Como el sistema de la start-up está en período de pruebas, todos los usuarios/as tienen el acceso permitido y no se debe programar la lógica de la autenticación y la autorización.  
El mensaje al vehículo, en el caso expuesto, será solo un texto por consola.  

Dado que se trata de una start-up, el producto se encuentra en desarrollo, motivo por el cual, en cuestión de semanas, nuevas tareas serán implementadas en el sistema y serán exigidas a l’app móvil. Además, la intención es conectar el sistema a otras aplicaciones cliente. También se quiere extender el negocio a bicicletas y patinetes. Diseña su solución de tal manera que añadir nuevas tareas, nuevas apps clientes y/o nuevos vehículos, resulte posible sin modificar la estructura del sistema y el código.  

## El script principal ha de producir la siguiente salida por consola:   
  
Autenticación OK para Francesc  
Autorización OK para Francesc  
Puerta abierta Francesc!  

## Diagrama de clases UML  

Construye la aplicación según la arquitectura que se representa en el diagrama de clases UML de la figura que se proporciona en papel. Al final del examen tendrás que añadir nuevos componentes al diagrama. Pon tu nombre y devuélvemela al finalizar el examen.  

Respeta los nombres de todos los componentes, métodos y propiedades que se indican.  

## Prepara el proyecto
Crea un nuevo repo en tu cuenta en Github  
Crea un nuevo directorio en tu equipo y clona el repositorio de Github.  
Abre VSCode /Eclipse /Netbeans y establece como workspace el directorio que has clonado.  
Crea un proyecto Maven.  
Pon el proyecto en seguimiento en Git y configura .gitignore.  
Copia y pega la función principal App.java. Utilízala como guía en el proceso TDD. No puedes modificar su código, pero sí puedes comentar aquellas partes que aun no hayas implementado.  
Completa las clases que aquí se indican implementando los casos test que necesites. Practica TDD.  
Realiza commits como mínimo cada vez que termines una historia de usuario.   

## Cómo entregar el código
Desde Eclipse exporta el proyecto a un fichero.  
En VSCode, comprime la carpeta del proyecto.  
Envíame el archivo por correo electrónico.   
Realiza commits periódicamente mientras avanzas en el desarrollo de la aplicación.  
Realiza un push al repo remoto en GitHub SOLO cuando hayas terminado el proyecto.  
  
## Salida de la aplicación
Intenta que la salida del programa sea lo más parecida posible a las imágenes que se proporcionan.  

## Historias de usuario  
Las historias de usuario están enunciadas en el script principal App.java  

Utiliza este script para guiar el desarrollo del diagrama de clases UML.  

La salida de este script es la siguiente:  
  
Autenticación OK para Francesc  
Autorización OK para Francesc  
Puerta abierta Francesc!   

## Código
SOLID  
Garantiza que tu solución satisfaga los 5 principios SOLID:  
    
Las clases y métodos solo han de asumir una única responsabilidad.  
Para añadir nuevos componentes al sistema no debe ser necesario reescribir el código.  
Utilizar el polimorfismo para que cada objeto muestre su comportamiento en tiempo de ejecución.  
Segrega las interfaces para desacoplar el código de los detalles de bajo nivel y del resto de componentes.  
