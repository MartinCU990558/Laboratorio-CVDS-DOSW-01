# Laboratorio-CVDS-DOSW-01
# Maratón Git 2025-2

**Integrantes:**
- Juan Pablo Caballero Castellanos
- Robinson Steven Nuñez Portela

**Nombre de la rama:** feature/CaballeroJuan_PortelaRobinson_2025-2

---

## Retos Completados

### Reto 1: Configuración y creación de rama
**Evidencia:**
![Captura](imagenes/reto1_config.png)
**Descripción:**
El código define una clase que nos representa como estudiantes con nuestro nombre, edad, correo y semestre. Toma nuestros datos y genera un mensaje de bienvenida usando una lista de estudiantes, mostrando sus datos básicos y los correos institucionales.

## Reto 2: Carrera en Paralelo
**Evidencia:**
![Captura final](imagenes/reto2_1.jpg)
![Captura proceso](imagenes/reto2_2.jpg)
![Captura proceso2](imagenes/reto2_3.jpg)

**Descripción:**
Se renombro reto2, luego se crearon las subramas con el fin de hacer 2 carriles en los cuales se fueron competian en una carrera pero se chocaban y cuando lo hacian se juntaban sus tareas. 

## Reto 3: El eco misterioso
**Evidencia:**
![Captura evidencia](imagenes/reto3_final.jpg)
![Captura evidencia](imagenes/reto3_merge.jpg)
![Captura evidencia](imagenes/reto3_concat.png)
![Captura evidencia](imagenes/reto3_invert.jpg)

**Descripción:**
Los estudiantes A y B trabajan con un String. El A debe dar una concatencación con un espacio para el string usando StringBuilder y que se repita 3 veces, el estudiante B debe invertir el string finalmente los 2 metodos chocan y deven ser solucionados por medio de merge


## Reto 4: El tesoro de las Llaves duplicadas
**Evidencia:**
![Captura evidencia](imagenes/reto4_final.jpg)
![Captura evidencia](imagenes/reto4_merge_1.jpg)
![Captura evidencia](imagenes/reto4_merge_2.jpg)
![Captura evidencia](imagenes/reto4_hashTable.jpg)
![Captura evidencia](imagenes/reto4_hashMap.jpg)


**Descripción:**
El estudiante A tuvo que realizar un HashMap en el cual debia tomar una llave y su valor y que no fuera repetido.
El estudiante B hizo lo mismo pero usando HashTable, luego cada uno hizo un metodo para combinar los hash y se realizo el primer merge para solucionar los conflictos. Continuo el estudiante A añadiendo un metodo para convertir las llaves a mayúsculas y el estudiante B hizo un metodo de orden ascendente para las llaves. Finalmente se hizo un segundo merge y se soluciono todo agrupando los métodos ya realizados para cumplir con el objetivo de la salida y darle prioridad al HashTable.


## Reto 5: Batalla de Conjuntos
**Evidencia:**

![Captura evidencia](imagenes/reto5_final.jpg)
![Captura evidencia](imagenes/reto5_salida.jpg)
![Captura evidencia](imagenes/reto5_merge.jpg)
![Captura evidencia](imagenes/reto5_sinMult_3.jpg)


**Descripción:**
El estudiante A realizo un método usando HashSet para generar números aleatorios pero quitando los que son multiplos de 3.
El estudiante B hizo algo similar solo que uso TreeSet, que ordena los números ascendentemente y quito los multiplos de 5.
Luego se realizo el merge, para solucionarlo se creo un metodo de unión para ambos tipos de set/conjunto, pero se conviritio en un TreeMap ya que este ordena los números ascendentemente para asi lograr la salida. 



## Reto 6: La máquina de decisiones
**Evidencia:**
![Captura evidencia](imagenes/reto6_final.jpg)
![Captura evidencia](imagenes/reto6_salida.jpg)
![Captura evidencia](imagenes/reto6_merge.jpg)
![Captura evidencia](imagenes/reto6_prueba.jpg)

**Descripción:**
Ambos estudiantes A y B deben hacer uso de switch para que se ejecuten comandos para que impriman ciertas frases para cada uno.
Luego se deben unir los comandos de los estudiantes A y B recibiendolos en listas.


## PARTE 3 – Cuestionario

Una vez finalizado el tiempo de la parte 2, es momento de resolver las siguientes preguntas en pareja, la idea es que se dividan las preguntas entre los dos participante del laboratorio, generen una rama donde agregan las respuestas a la sección previamente creada en el README y al finalizar realizan commit a la rama feature del laboratorio.


1. Cuál es la diferencia entre git merge y git rebase

- RTA:
GIT MERGE
-	Combina cambios de una rama a otra, crea un commit de fusión.
GIT REBASE
-	Toma los commits de una rama y los reaplica sobre otra, reescribe la historia de los commits.

2. Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?

- RTA:
Si sucede eso git no sabe cuál versión mantener entonces se interrumpirá el merge y pasará un conflicto en ese archivo, el cual se deberá corregir manualmente y mirar que mantener, combinar o eliminar. Luego se guardan los cambios se vuelve a subir y así se resolverá el conflicto.

3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

- RTA:
El comando que me permite ver gráficamente el historial de merges y ramas es:
git log --oneline --graph --all –decorate
oneline: Muestra los commits.
Graph: Dibuja el árbol con las líneas y ramas.
All: Muestra todas las ramas.
Decorate: Muestra nombres y etiquetas en conjunto de los commits.
4. Explica la diferencia entre un commit y un push?

- RTA:
COMMIT 
-	Guarda cambios en el repositorio local.
-	Guarda el mensaje de los cambios que se hicieron.
PUSH
-	Envia los commits locales al repositorio remoto (GitHub).
-	Envia los archivos con cambios que se realizaron al remoto (lo actualiza).

5. Para que sirve git stash y git pop?

- RTA:
GIT STASH: Guarda temporalmente cambios los cuales no se han hecho su respectivo commit, con el fin de cambiar o actualizar una rama sin perder los cambios que se han hecho.

GIT POP: Recupera los cambios guardados en el stash y los aplica a la rama en la que estas actualmente.

6. Qué diferencia hay entre HashMap y HashTable?

- RTA:
HASHMAP
-	No es thread-safe (al acceder al mismo hash map y lo modifican puede haber inconsistencias.
-	Permite valores null y una clave null.
-	Es más rápida sin sincronización.
-	Hereda de AbstractMap.
HASHTABLE
-	Es thread-safe (solo un hilo puede acceder a sus métodos a la vez.
-	No  permite claves o valores null.
-	Mas lento por la sincronización.
-	Hereda de Dictionary.

7. Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?

- RTA Ventajas:

 - En vez de estar iterando se puede usar un stream() y se puede transformar una colección a un mapa así podemos hacerlo más legible

 - No es necesario a cada rato revisar si es NULL

 - Maneja claves repetidas ya que es clave/valor

 - Los más notorio es que reduce líneas de código

8. Si usas List con objetos y luego aplicas stream().map() que tipo de operación estás haciendo?

- RTA: Se estaría transformando, ya que cada elemento de la lista lo transformamos a otro valor, pero no cambia la lista original por lo que al mapear se crea un nuevo flujo de datos

9. Que hace el método stream().filter() y que retorna?

- RTA ¿Que hace?: Se está filtrando los elementos que cumplan cierta condición booleana de una expresión lambda y si no la cumple se eliminan.

- RTA ¿Qué retorna?: Estaría retornando otro stream con los elementos que hayan pasado el filtro, si se quiere una lista tocaría con otros métodos como toList() y etc…

10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.

1.) Cámbiate a develop usando estos comandos:

```bash
   git checkout develop “Cambiamos a la rama develop”
   git pull origin develop “Descarga últimos cambios”
```


2.) Creamos una nueva rama; con -b creamos la rama y nos movemos a ella

```bash
   git checkout -b feature/nueva_funcionalidad_portela
```


3.) Y para actualizar cambios y subirlos usamos

```bash
   git add .
   git commit -m "Actualizando la nueva funcionalidad"
```


4.) Finalmente, para subirlo a GitHub usamos:

```bash
   git push origin feature/ nueva_funcionalidad_portela
```

11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?

- RTA:
 - Diferencia git branch: Solo estamos creando la rama mas no nos mueve hacia ella así que seguimos estando en la rama que se tenga actualmente.
 - Diferencia git checkout -b nombre_rama: Igualmente estamos creando la rama, pero si nos cambiamos a ella automáticamente.

12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?

- RTA Ventajas:

 - Como se pudo evidenciar trabajando con subramas es que solo afectan la rama en la que estemos trabajando mas no afecta la rama principal.

 - Cuando se usa /feature nos quiere decir que se añadió una nueva funcionalidad mas no un bug o prueba.

 - Es mas sencillo trabajar en equipo ya que no se esta chocando con los features de otros y se mantiene el flujo de trabajo.

 - Cuando se hace merge o pull se revisa el código ante de llegar al main.Cuando se hace merge o pull se revisa el código ante de llegar al main.