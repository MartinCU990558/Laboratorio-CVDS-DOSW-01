# Laboratorio-CVDS-DOSW-01

## **Integrantes**
- Juan Sebastian Puentes Julio  
- Nestor David Lopez Castañeda  
**feature/Puentes_Lopez_2025-2**

---

## ✅ Retos Completados 

---

### 🔹 Reto 1: La Bienvenida

Para este primer reto, se nos solicitó crear dos objetos: `Estudiante` y `MensajeBienvenida`. Además, se debía utilizar la estructura `List` y aplicar los métodos de programación funcional: `stream()`, `map()` y `collect()`.

**1. Clase Estudiante**  
En esta clase definimos los atributos necesarios, implementamos el constructor y generamos los métodos getters correspondientes para acceder a la información de cada estudiante.

![alt text](image.png)  
Como se puede observar en la imagen, lo primero que hicimos fue definir los atributos de `Estudiante`, realizando el respectivo constructor y los getters.

**2. Clase MensajeBienvenida**  
![alt text](image-1.png)  
En esta clase, construimos un método que, utilizando `stream()`, `map()` y `collect()`, genera un mensaje de bienvenida personalizado a partir de la lista de estudiantes. El resultado es un mensaje concatenado con los nombres de todos los participantes.

![alt text](image-3.png)  
Una vez completadas ambas clases, nos dirigimos al método `main`, donde almacenamos los datos de los estudiantes (en este caso, los integrantes de nuestro dúo) en una lista. Luego, llamamos a la función generadora del mensaje de bienvenida e imprimimos el mensaje solicitado.

---

### 🔹 Reto 2: Carrera en Paralelo

El primer paso consiste en cambiar el nombre del archivo, crear las subramas correspondientes y definir los métodos necesarios. Una vez realizados estos pasos, ejecutamos `git merge` y nos enfrentamos al primer conflicto.

![alt text](image-15.png)

**Resolución del primer conflicto**  
Procedemos a resolver los conflictos generados y realizamos la combinación de ramas. Posteriormente, continuamos con las instrucciones y nos preparamos para enfrentar el segundo y tercer conflicto.

![alt text](image-16.png)

**Implementación final y solución**  
Finalmente, creamos la función requerida, realizamos la combinación de ramas restante, resolvemos los conflictos pendientes y obtenemos la solución completa del problema.

![alt text](image-17.png)  
![alt text](image-18.png)

---

### 🔹 Reto 3: El eco misterioso

**Para este reto, comenzamos creando las ramas correspondientes: una para la implementación con `StringBuilder` y otra para `StringBuffer`.**

![alt text](image-4.png)

Una vez creadas las ramas, procedimos a realizar un `git merge` para combinarlas. Durante este proceso, resolvimos los conflictos que surgieron entre ambas implementaciones.

![alt text](image-5.png)

En la solución final del reto, contamos con los métodos y el `main` necesarios para resolver el problema planteado. Es importante destacar que la función que unifica el uso de ambos métodos (`StringBuilder` y `StringBuffer`) fue desarrollada por ambos integrantes del equipo, y luego se integró mediante una fusión de ramas (`merge`).

![alt text](image-6.png)  
Y este sería el resultado esperado.

---

### 🔹 Reto 4: El tesoro de las Llaves duplicadas

**Para este reto, comenzamos creando las ramas correspondientes, en las cuales desarrollamos los métodos solicitados. Posteriormente, realizamos la combinación de las ramas (`merge`) y comparamos los cambios, resolviendo los conflictos que surgieron durante el proceso.**

![alt text](image-13.png)

Luego implementamos las funciones requeridas, volvimos a hacer un `merge` y verificamos que el resultado fuera el esperado.

![alt text](image-14.png)

---

### 🔹 Reto 5: Batalla de Conjuntos

En este reto, comenzamos creando las ramas correspondientes: una para la implementación con `HashSet` y otra para `TreeSet`, en las cuales desarrollamos los métodos requeridos.

![alt text](image-10.png)

Una vez que ambos cambios fueron subidos, realizamos un `merge` y solucionamos los conflictos que surgieron. Posteriormente, procedimos a crear la función que unifica ambos conjuntos (`Sets`).

![alt text](image-11.png)

Finalmente, al ejecutar el programa, obtenemos la impresión del resultado esperado.

![alt text](image-12.png)

---

### 🔹 Reto 6: La máquina de decisiones

**Para el reto 6 lo primero que vamos a hacer es crear las respectivas ramas creando el fragmento 1 y 2 y haciendo lo que este nos pide respetivamente.**

![alt text](image-7.png)

Para este reto, comenzamos creando las ramas correspondientes, denominadas Fragmento 1 y Fragmento 2, y desarrollamos en cada una las funcionalidades que se nos solicitaron.

![alt text](image-8.png)

Luego, combinamos ambas ramas mediante un `merge` en la rama principal del reto 6, donde resolvimos los conflictos y dejamos el código completamente funcional.  
Después, implementamos el método que integra y unifica ambos fragmentos para que funcionen de manera conjunta.

![alt text](image-9.png)

Finalmente, realizamos un `merge` de la rama principal del reto 6 con la rama principal del proyecto, donde se encuentran las demás soluciones de los retos anteriores.

---

## 📚 Preguntas teóricas

---

### ⦁ ¿Cuál es la diferencia entre `git merge` y `git rebase`?
La diferencia principal que podemos encontrar es que `git rebase` nos va a dejar un historial más limpio y cuenta con capacidades de iteración rápida. Por otro lado, el `merge` sirve más para evidenciar, y es más útil cuando se necesita colaboración, transparencia y registros de auditoría.

---

### ⦁ Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer `merge`?
El principal problema que se va a presentar cuando sucede esto es que Git no puede determinar cuál de los dos cambios aceptar, por lo que va a generar un conflicto, el cual debe resolverse para luego hacer el `merge`.

---

### ⦁ ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
Para poder ver el historial de merge en la consola vamos a usar el comando: git log

---


---

### ⦁ Explica la diferencia entre un `commit` y un `push`
La diferencia principal es que `commit` trabaja en el repositorio local mientras que `push` lo hace con el repositorio remoto.

---

### ⦁ ¿Para qué sirve `git stash` y `git stash pop`?
`git stash` almacena temporalmente los cambios no confirmados en el directorio de trabajo.  
`git stash pop` aplica los cambios guardados en el stash y los elimina automáticamente.

---

### ⦁ ¿Qué diferencia hay entre `HashMap` y `HashTable`?
- `HashTable` es mejor para aplicaciones multihilo ya que ofrece sincronización en sus métodos de acceso y modificación.
- `HashTable` no permite llaves ni valores `null`, mientras que `HashMap` permite una llave `null` y múltiples valores `null`.

---

### ⦁ ¿Qué ventajas tiene `Collectors.toMap()` frente a un bucle tradicional para llenar un mapa?
Las ventajas incluyen:
- Código más conciso y legible
- Permite transformar elementos fácilmente
- Es más declarativo y evita errores comunes en la manipulación manual del mapa

---

### ⦁ Si usas `List` con objetos y luego aplicas `stream().map()`, ¿qué tipo de operación estás haciendo?
Estás haciendo una **operación de transformación**, aplicando una función que convierte cada elemento del stream original en otro elemento, posiblemente de otro tipo.

---

### ⦁ ¿Qué hace el método `stream().filter()` y qué retorna?
Este método **filtra** elementos de un stream según una condición lógica (`Predicate`).  
Retorna un `Stream<T>` con solo los elementos que cumplen la condición.

---

### ⦁ Describe el paso a paso de cómo crear una rama desde `develop` si es una funcionalidad nueva.
1. Acceder al repositorio local.
2. Ejecutar `git fetch` para traer los últimos cambios.
3. Cambiar a la rama `develop`: `git checkout develop`
4. Actualizarla: `git pull origin develop`
5. Crear y cambiar a una nueva rama: `git checkout -b feature/nueva-funcionalidad`

---

### ⦁ ¿Cuál es la diferencia entre crear una rama con `git branch` y con `git checkout -b`?
- `git branch` **solo crea** la rama.
- `git checkout -b` **crea y cambia automáticamente** a esa rama.

---

### ⦁ ¿Por qué es recomendable crear ramas `feature/` para nuevas funcionalidades en lugar de trabajar en `main` directamente?
Es recomendable para:
- Evitar errores que puedan dañar la rama principal
- Aislar cambios experimentales o en desarrollo
- Facilitar la colaboración y revisión antes de integrarlos a `main`

---

## 🔗 Referencias

- https://www.datacamp.com/es/blog/git-merge-vs-git-rebase  
- http://codigoelectronica.com/blog/fusion-de-ramas-con-git-merge  
- https://es.stackoverflow.com/questions/1234/cu%C3%A1l-es-la-diferencia-entre-hashmap-y-hashtable-en-java  

---
