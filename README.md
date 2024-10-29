# Sistema de Gestión de Tienda de Mascotas

## Descripción

Este proyecto es una aplicación Java diseñada para gestionar una tienda de mascotas. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre registros de mascotas en venta, e implementa manejo de excepciones personalizadas.

![Interfaz del Proyecto](https://i.postimg.cc/bwpg2kqP/Captura-de-pantalla-2024-10-29-175936.png)

## Requisitos

La aplicación está estructurada de la siguiente manera:

1. **Clase Mascota**:
   - **Atributos**:
     - `ID` (String)
     - `Nombre` (String)
     - `Especie` (String: "Perro", "Gato", "Ave", "Reptil", "Otro")
     - `Edad` (int, en años)
     - `Precio` (double)
   - **Métodos**:
     - Getters y Setters para todos los atributos.
     - Constructor para inicializar todos los atributos.

2. **Clase Tienda**:
   - Contiene un `ArrayList` para almacenar objetos de la clase `Mascota`.
   - **Métodos CRUD**:
     - `agregarMascota(Mascota mascota) throws MascotaDuplicadaException`
     - `buscarMascota(String id) throws MascotaNoEncontradaException`
     - `actualizarMascota(String id, Mascota mascotaActualizada) throws MascotaNoEncontradaException`
     - `eliminarMascota(String id) throws MascotaNoEncontradaException`
     - `listarMascotas()`: Lista todas las mascotas disponibles.

3. **Excepciones Personalizadas**:
   - `MascotaNoEncontradaException`: Para manejar el caso de búsqueda de una mascota que no existe.
   - `MascotaDuplicadaException`: Para manejar el intento de agregar una mascota con un ID ya existente.

4. **Interfaz Gráfica (GUI)**:
   - Formulario que incluye:
     - TextFields para ingresar los datos de la mascota (ID, nombre, edad, precio).
     - Un ComboBox para seleccionar la especie.
     - Un TextArea para mostrar la información de las mascotas y mensajes de error.
     - Botones para realizar las operaciones CRUD.

5. **Lógica de la Interfaz**:
   - Los botones ejecutan acciones utilizando los métodos de la clase `Tienda`.
   - Se utilizan bloques `try-catch` para capturar y manejar excepciones personalizadas, mostrando mensajes de error en el TextArea.

## Instalación

1. Clona este repositorio en tu máquina local usando:
   ```bash
   git clone https://github.com/BSTR7/Tienda-De-Macotas-Evaluacion-Java-Poo.git
