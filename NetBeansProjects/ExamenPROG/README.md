# ExamenPROG

Este proyecto es una aplicación básica para la gestión de cuentas de clientes en una empresa de finanzas. Permite crear clientes, gestionar sus cuentas realizando transacciones como depósitos y retiros, y muestra el saldo actualizado después de cada operación. La interfaz gráfica de usuario (GUI) está desarrollada utilizando Java Swing.

## Funcionalidades

### 1. Gestión de Clientes

- **Crear Cliente:** Se puede agregar un nuevo cliente especificando su ID, nombre, apellido y saldo inicial de cuenta.
- **Listar Clientes:** La interfaz muestra la lista de clientes registrados.
- **Funciones**: Los clientes se identifican con la variable ID, siendo que si se cambia esta, la cuenta será otra, por lo que se debe usar el correcto para poder llevar a cabo las transacciones.

### 2. Gestión de Cuentas

- **Realizar Transacciones:** Se pueden realizar depósitos y retiros en las cuentas de los clientes.
- **Validación de Retiros:** Se valida que los retiros no excedan el saldo disponible en la cuenta.
- **Conteo**: Se hace uso de la variable "monto" para llevar la cuenta exacta de la cantidad de dinero en la cuenta, mostrando por pantalla un error en caso de que no haya saldo suficiente en la cuenta.

### 3. Interfaz Gráfica de Usuario (GUI)

- La interfaz gráfica utiliza Java Swing para proporcionar una experiencia de usuario intuitiva.
- Incluye formularios para la gestión de clientes y cuentas, así como un área de texto para mostrar información relevante como el saldo actualizado después de cada transacción.

### 4. Manejo de Excepciones

- Se manejan excepciones para casos como intentos de retiro con saldo insuficiente.
- Los errores se capturan y se muestran en la interfaz de usuario para informar al usuario sobre problemas durante las transacciones.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

- **Cliente.java:** Clase que representa a un cliente con su ID, nombre, apellido y saldo.
- **Cuenta.java:** Clase que gestiona la cuenta de un cliente, permitiendo depósitos y retiros.
- **Transaccion.java:** Clase que define las transacciones realizadas en las cuentas, almacenando la información en ArrayList para manejarla cada vez que se ejecuta la aplicación.
- **GUI.java:** Clase que implementa la interfaz gráfica de usuario usando Java Swing.
- **Main.java:** Clase principal que inicia la aplicación.

## Cómo Ejecutar

### Desde NetBeans

1. **Clonar el Repositorio:**
   - Abre NetBeans y selecciona `Team` -> `Git` -> `Clone...`.
   - Ingresa la URL de tu repositorio de GitHub y sigue las instrucciones para clonarlo.

2. **Importar el Proyecto:**
   - Una vez clonado, NetBeans debería reconocer automáticamente el proyecto. Si no lo hace, puedes abrir el proyecto manualmente seleccionando `File` -> `Open Project...` y navegando hasta la carpeta del repositorio clonado.

3. **Configurar la Clase Main:**
   - Asegúrate de que la clase `Main.java` esté configurada como la clase principal de la aplicación. Esto se puede verificar haciendo clic derecho en el proyecto en el Explorador de Proyectos de NetBeans, seleccionando `Properties`, y asegurándote de que `Main Class` esté configurado correctamente.

4. **Ejecutar el Proyecto:**
   - Haz clic en el botón de "Run Project" (verde) en la barra de herramientas de NetBeans o selecciona `Run` -> `Run Project` desde el menú.
   - La interfaz gráfica debería abrirse, permitiéndote interactuar con la aplicación.

### Desde Otro IDE

1. **Clonar y Configurar el Proyecto:**
   - Clona el repositorio desde GitHub a tu máquina local como se mencionó anteriormente.
   - Abre tu IDE preferido (como Eclipse o IntelliJ IDEA).

2. **Importar el Proyecto:**
   - Importa el proyecto Java clonado desde el directorio en tu máquina local donde se encuentra.

3. **Configurar la Clase Main:**
   - Verifica que la clase `Main.java` esté configurada como la clase principal de la aplicación según las configuraciones de tu IDE.

4. **Ejecutar el Proyecto:**
   - Ejecuta el proyecto desde el IDE seleccionando la opción correspondiente para ejecutar aplicaciones Java.
