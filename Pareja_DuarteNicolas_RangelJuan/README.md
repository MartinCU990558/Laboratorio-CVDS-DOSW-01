# Maraton git 2025-2

**integrantes:**

- Nicolas Duarte
- Juan Felipe Rangel

**Nombre de la rama:** feature/DuarteNicolas_RangelJuan_2025-2'
---

## Retos completados
## Reto 1
![img.png](images/img.png)
![img_1.png](images/img_1.png)

creamos la clase estudiante donde definimos los parametros y sus getters.

![img_2.png](images/img_2.png)

Se creo la clase mensaje donde se implementaron las estructuras de stream() y collect junto a map(). donde
a partir de map se filtran los datos de cada estudiante para crear el mensaje luego con collect se juntan los
mensajes de ambos estudiantes.<br />

## reto 2
<img width="1146" height="718" alt="image" src="https://github.com/user-attachments/assets/31d07c59-7643-4a30-8a10-9a4becf02c0e" />

Se definio la clase resultado donde se definen los atributos y el constructor, seguidos por el metodo to string
para facilitar la respuesta a modo de texto

<img width="1212" height="655" alt="image" src="https://github.com/user-attachments/assets/885aab99-7265-4238-a90c-211d4cad27ca" />

en el metodo calcular resultados unicamente se llama al metodo analizar lista con las listas dadas en los parametros
y posteriormente se imprimira el resultado con lo que haya retornado el metodo analizar lista.
el metodo analizar lista se encarga de todos los procedimientos pedidos para el reto, para esto se utilizan streams para hayar
el minimo y el maximo utilizando las operaciones de stream min y max, para la cantidad de elementos se utiliza un .size y para 
saber si el mayor es multiplo y divisor de 2 ysi es par o impar se utilizaron simples casos de if-else con operador ternario.

<img width="1122" height="326" alt="image" src="https://github.com/user-attachments/assets/f6cf643b-cae3-4ca8-9aa1-e96cae4bb2d4" />

finalmente en la clase reto 2 se hace el llamado mediante la funcion main junto con unos datos de prueba 

<img width="1859" height="982" alt="image" src="https://github.com/user-attachments/assets/cab923a1-c442-4eee-a2eb-490407f0ba21" />



## Reto 3 
![img.png](images/img_3.png)<br />

Se crean tanto un string builder como un string buffer, donde usamos el builder como la opcion mas rapida y
el buffer como la opcion mas seguro, ya que esta tiene un manejo de hilos.
Luego usamos stream junto a funciones lambda, en este caso intStream.range lo cual hace que se repita la
accion en el rango, luego forEach() donde hacemos que se repita el mensaje junto al espacio deseado.
luego en el buffer usamos .reverse() el cual invierte el string dado.
Por ultimo retornamos el stream con toString() para volverlo string y .trim() para eliminar espacion fuera
de las palabras.<br />

<img width="1910" height="1014" alt="image" src="https://github.com/user-attachments/assets/8bacbe59-7e40-4e4e-9524-da5c1d5a88bc" />


## reto 4
<img width="1043" height="878" alt="image" src="https://github.com/user-attachments/assets/1f2e6752-74ee-446f-9bc4-ea8862cddc9c" />

se crean la clase mapa tesoro junto con su constructor como es de costumbre, donde se definen como atributo los tipos de mapa
segun la estructura a utilizar (hashmap: mapa lento, hashtable: mapa seguro y map como la respuesta final).
Luego se implementan los metodos para agregar valores a cada uno de los mapas teniendo en cuenta no agregar elementos repetidos.
Para mezclar los elementos de ambos mapas se utiliza el metodo combinar, que primero toma todo el conjunto de entradas de ambos mapas 
y los convierte en stream para luego concatenar ambos conjuntos en un solo stream con .concat (primero pasan todos los elementos de mapa rapido
y luego los de mapa lento), luego con collect to map se convierte el stream en un map con las entradas de este y se asignan las claves a sus valores
correspondientes.
y finalmente se utiliza una lambda para que en caso de llaves repetidas en ambos mapas, unicamente quede el valor del mapa lento.
<img width="1174" height="252" alt="image" src="https://github.com/user-attachments/assets/033438e6-4a90-478e-b926-4a181240d09b" />
se usa el metodo mostrar para imprimir la respuesta implementando un stream para que organice los valores en orden alfabetico con .sorted y en mayuscula con upper case

<img width="1875" height="988" alt="image" src="https://github.com/user-attachments/assets/ff91a3b5-a4af-4709-9cbd-ac5db8ec588b" />

## Reto 5 
![img.png](images/img_5.png)<br />

Creamos un HashSet para numeros no ordenas ya que este set tiene esa caracteristica, y un TreeSet para los
ordenados por esto mismo, luego mediante un .filter creamos las excepciones en ambos casos uno donde no 
puede haber multilpos de 3 y otro multiplos de 5, y estos resultados los guardamos con .collect().

luego hacemos la union de estos en un set<interger> con .concat()

<img width="1890" height="980" alt="image" src="https://github.com/user-attachments/assets/fce7c9c4-37d2-4a08-9bf5-489f9168823c" />


## reto 6
<img width="1174" height="766" alt="image" src="https://github.com/user-attachments/assets/0f89df19-f983-4284-917a-080b3682f35b" />

en este reto unicamente se utiliza una lambda para imitar el comportamiento de un switch case en donde dependiendo de la
respuesta dada se toma el "case" deseado para cada uno de los comandos definidos.
para esto se utiliza runnable lo que permite tratar el objeto como una accion que directamente ejecutara la funcion lambda a la que esta relacionada

<img width="1868" height="976" alt="image" src="https://github.com/user-attachments/assets/8f0f9c43-5ff0-4ead-9728-9d2e1b2ec411" />

pruebas de su resultado con valores dados en la main

## preguntas teoricas

1. Cuál es la diferencia entre git merge y git rebase
R) la diferencia entre git merge y git rebase es que merge une dos ramas creando un commit adicional que conserva el historial de commits de ambas ramas, mientras que rebase muestra la combinacion final como si no hubiera tenido commits 

2. Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?
R) si dos ramas modifican la misma línea de un archivo y luego se hace un merge, Git no puede decidir automáticamente qué cambio conservar, por lo que se produce un conflicto que debe resolverse manualmente  editando el archivo y eligiendo qué versión de la línea mantener

3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
R) para ver gráficamente el historial de merges y ramas en consola se utiliza el comando git log --graph --oneline --all, el cual muestra un árbol visual con las diferentes ramas y los commits de merge de forma organizada

4. Explica la diferencia entre un commit y un push?
R) un commit guarda cambios en el repositorio local como una versión del proyecto, mientras que un push envía esos commits al repositorio remoto lo que permite que alguien mas tengan acceso a los cambios realizados

5. Para que sirve git stash y git pop?
R) el comando git stash se usa para guardar temporalmente cambios a los que aun no se les quiere hacer commit, limpiando el área de trabajo sin perderlos, mientras que git stash pop recupera esos cambios guardados y los aplica nuevamente en el área de trabajo

6. Qué diferencia hay entre HashMap y HashTable?
R) la diferencia entre HashMap y HashTable es que HashMap nes más rápido pero no seguro en entornos multi-hilo, y permite claves y valores null, mientras que HashTable es  más lento pero seguro en entornos concurrentes, y no admite null

7. Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
R) la ventaja de usar Collectors.toMap() frente a un bucle tradicional es que el código resulta menos propenso a errores, además de que le
es mas facil integrarse a streams , lo que facilita transformaciones y operaciones sobre colecciones

9. Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?
R) si se usa una lista de objetos y se aplica stream().map(), lo que hace es una operación de transformación en la que cada elemento de la lista se convierte en otro valor u objeto según la función que se pase al map

10. Que hace el método stream().filter() y que retorna?
R) el método stream().filter() se utiliza para aplicar una condición booleana sobre los elementos de un stream, dejando pasar solo aquellos que cumplen la condición; su resultado es un nuevo Stream compuesto únicamente por los elementos filtrados

11. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
R) primero se debe mover a la rama develop con git checkout develop, luego actualizarla con git pull, y finalmente crear y cambiarte a la nueva rama con git checkout -b feature/"nombre"

12. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?
R) La diferencia entre git branch y git checkout -b es que git branch "nombre" únicamente crea la rama sin cambiar a ella, mientras que git checkout -b nombre-rama crea la rama y al mismo tiempo mueve el entorno de trabajo a esa rama recién creada

13. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
R) porque esto evita alterar el código estable, permite que varias personas trabajen en paralelo sin interferir con sus cambios, y facilita revisar, probar y aprobar nuevas funcionalidades antes de integrarlas a la rama principal.
