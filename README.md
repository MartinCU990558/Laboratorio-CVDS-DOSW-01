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

