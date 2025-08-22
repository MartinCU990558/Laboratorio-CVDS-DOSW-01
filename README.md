# Maratón Git 2025-2

**Integrantes:**
- David Santiago Palacios 
- Valeria Bermudez Aguilar

**Nombre de la rama:** feature/BermudezValeria_PalaciosDavid_2025-2

---
### Reto 1: La Bienvenida
**Evidencia:**
(https://imgur.com/a/XZjNtr4)
Se implementó un programa en Java compuesto por tres clases: **Reto1**, **Student** y **MessageGenerator**. La clase `Student` representa a un estudiante con atributos como nombre, semestre, edad y correo institucional. La clase `Message` se encarga de recibir dos objetos de tipo `Student` y construir un mensaje en español que presenta a ambos estudiantes de manera detallada. Finalmente, la clase `Reto_1` contiene el método `main`, donde se crean los objetos `Student`, se instancia la clase `Message` y se imprime el mensaje generado en la consola. Este diseño permite separar la lógica de datos (estudiantes), la generación del mensaje y la ejecución principal, logrando una estructura clara y organizada.


### Reto 2: Commit colaborativo
**Evidencia:**
![Captura](imagenes/reto2_log.png)
...

<<<<<<< HEAD
### Reto 3: Commit colaborativo
**Evidencia:**
En este código se creó la clase EcoMisterioso, que define un método estático ecoMisterioso encargado de recibir un mensaje, repetirlo tres veces separado por espacios y luego invertir completamente la cadena resultante. Para ello, se utiliza un StringBuilder para concatenar las repeticiones y un StringBuffer para realizar la inversión. En el método main, se aprovecha una expresión lambda con Function<String, String> que apunta al método ecoMisterioso, y al aplicarla con el texto "Hola", se imprime en consola la cadena "aloH aloH aloH" invertida.
...

### Reto 4: Commit colaborativo
**Evidencia:**
En este código se implementa la clase `CofreTesoro`, la cual simula la unión de dos estructuras de datos diferentes (`HashMap` y `Hashtable`) para resolver el reto de las llaves duplicadas. El método **`construirHashMap`** recibe una lista de pares clave-valor y los guarda en un `HashMap`, ignorando claves repetidas conservando el primer valor encontrado; lo mismo hace **`construirHashTable`** pero con un `Hashtable`. Luego, **`unirMapas`** combina ambos mapas usando `Stream.concat`, y en caso de conflicto en las claves se priorizan los valores del `Hashtable`. Finalmente, el método **`mostrarTesoro`** transforma todas las claves a mayúsculas, ordena alfabéticamente los resultados y los imprime en consola. En el `main` se cargan listas de ejemplo y se ejecuta todo el proceso, mostrando el contenido final del “tesoro”.

...

### Reto 5: Commit colaborativo
**Evidencia:**
Este código implementa la clase BatallaConjuntos, donde se trabaja con dos tipos de conjuntos en Java: HashSet y TreeSet, para simular una "batalla".
El método generarHashSet crea un conjunto con 10 números aleatorios entre 1 y 30, pero después filtra los que son múltiplos de 3.
El método generarTreeSet hace lo mismo, pero usando un TreeSet y eliminando los múltiplos de 5.
En el main, se generan ambos conjuntos, se combinan en un nuevo TreeSet llamado union (que garantiza el orden ascendente automático), y finalmente se imprimen los números resultantes, mostrando cada uno como si participara en una “arena de batalla”.
...
### Reto 6: Commit colaborativo
**Evidencia:**
![Captura](imagenes/reto2_log.png)
...
=======
>>>>>>> 2ff32989233b34fbea183566de4c22d28ed7ad5e

## Preguntas teoricas
**1.	Cuál es la diferencia entre git merge y git rebase**
El git merge por su parte combina dos ramas creando un commit más de merge, ademas mantiene el las ramas divergentes que se unen en un mismo lugar, mientras que el gir rebase busca "reescribir" los commits de una rama para escribirlos sobre la otra y mantener una estructura más lineal.
**2.	Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?**
Ocurre un conflicto de Merge donde Git no puede decidir con cual de las dos versiones quedarse, asi que se debe resolver manualmente, ya see editando alguno, escogiendo uno o combinandolos.
**3.	¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?**
Se puede utilizar un comando que es git log --oneline --graph --all para lograr esto.
**4.	Explica la diferencia entre un commit y un push?**
El commit solo envia y guarda los cambios en el repositorio local mientras que push envia los commits locales al repositorio remoto.
**5.	Para que sirve git stash y git pop?**
Git Stash guarda temporalmente los cambios realizados pero no se hace un commit, y por su parte git pop se encarga de "recuperar" esos cambios y los aplica a la rama donde este.
**6.	Qué diferencia hay entre HashMap y HashTable?**
La principal diferencia se basa en que un HashTable no permite valores ni claves nulos mientras que el HashMap si.
**7.	Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?**
Una de las ventajas es la creacion de mapas con streams, permitiendo usar las funcionalidades(tranformaciones) de streams y reduciendo codigo.
**8.	Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?**
Una tranformación/operación intermedia ya que el map aplica un cambio a cada elemento pero sigue devolviendo otro Stream.
**9.	Que hace el método stream().filter() y que retorna?**
Se encarga de filtrar los datos bajo alguna condición booleana(verdadera-falsa)y retorna otro stream.
**10.	 Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.**
Si estamos ya en la rama develop, debemos usar el comando checkout -b nombreRama para crearla y cambiarla y luego hacer un psuh u -origin para "mandar" o terminar con el proceso de creación de la rama en el repositorio remoto.
**11.	¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?**
Al crear una rama con git checkout -b, aparte de crearla, te mueves automaticamente hacia allá, mientras que con branch solo la creas.
**12.	¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?**
Evita romper el código estable en main, que es el codigo que esta listo para la etapa de produccion, además,permite trabajar en al mismo tiempo con otras personas sin interferir,y principalmente cumple con el ciclo correcto de GitFLOW.

