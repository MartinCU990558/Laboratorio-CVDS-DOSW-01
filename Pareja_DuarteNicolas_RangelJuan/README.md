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

