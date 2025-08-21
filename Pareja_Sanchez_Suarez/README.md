# Maratón Git 2025-2

**Integrantes:**
- Oscar andres Sanchez porras
- Santiago Suarez

**Nombre de la rama:** feature/SanchezOscar_SuarezSantiago_2025-2

---

## Retos Completados

### Reto 1: Configuración y creación de rama
**Evidencia:**
![Captura](imagenes/reto1.png)

<h4>Descripción breve de lo que hicieron:  
</h4>

Configuramos el correo institucional en Git, creamos la rama desde `develop` y confirmamos que se reflejó en el repositorio remoto.

---

### Reto 2: Commit colaborativo
**Evidencia:**
![Captura](imagenes/reto2.png)

<h4>Descripción breve de lo que hicieron:  
</h4>
Ambos integrantes realizamos cambios para practicar commits colaborativos y resolver conflictos en Git.

---
### Reto 3: Commit colaborativo
**Evidencia:**
![Captura](imagenes/reto3.png)
![Captura](imagenes/reto3CodigoE.png)
![Captura](imagenes/reto3CodigoM.png)
![Captura](imagenes/reto3CodigoR.png)

<h4>Descripción breve de lo que hicieron:  
</h4>
Se hicieron 2 ramas, una para implementar el mensaje builder que repite tres veces el mensaje y otra para implementar el mensaje buffer que invierte el mensaje. Luego se
combinaron las ramas y se creó un método que implementa los dos mensajes en uno.

---
### RETO #4: El tesoro de las Llaves duplicadas
**Evidencia**

![Captura](imagenes/reto4.png)
![Captura](imagenes/reto4_1.png)


<h4>Descripción breve de lo que hicieron:  
</h4>
Se crearon ramas creando hash, y se solucionaron problemas con el merge.
Se soluciono el problema gracias a los metodos del stream y sus colecciones.
Se decicio crear una clase mapa del tesoro para los metodos de este y en la clase reto 4 
se crean los mapas respectivos. 

---
### Reto 5: Commit colaborativo
**Evidencia:**
![Captura](imagenes/reto5Resultado.png)
![Captura](imagenes/reto5Codigo1.png)
![Captura](imagenes/reto5Codigo2.png)

<h4>Descripción breve de lo que hicieron:  
</h4>

Se crean dos ramas HashSet donde la lista descarta números que son múltiplos de 3 y otra rama TreeSet donde descarta números que son múltiplos de 5, luego se crea otra lista donde se unen las listas TreeSet y HastSet sin números repetidos y se imprime cada elemento de la lista recorriéndolo.

---
### Retp 6: La máquina de decisiones

**Evidencia:**
![Captura](imagenes/reto6.png)
![Captura](imagenes/reto6_1.png)

<h4>Descripción breve de lo que hicieron:  
</h4>
Se usa un switch para cada accion dependiendo de su nombre y se llama un metodo que usa la interfaz runable para llamar el metodo desigando
---
### PARTE 3 – Cuestionario:
1.	Cuál es la diferencia entre git merge y git rebase
La diferencia es que git merge une el historial de una rama origen a una rama destino.
Y git rebase reescribe el historial de una rama origen a una rama destino unificando las ramas mientras que el otro mantiene las ramas independientes
2. Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?
3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
git log --oneline --graph –all
git log permite observa el historial de los commits utilizados por las ramas
 --oneline → muestra cada commit en una sola línea (más compacto).
 --graph → dibuja un gráfico ASCII de las ramas y merges.
 --all → muestra todas las ramas, no solo la actual.
4. Explica la diferencia entre un commit y un push?
5. Para que sirve git stash y git pop?
Git stash sirve para guardar las configuraciones temporalmente. Esto es útil para cuando hay conflictos entre repositorio remoto y local.
Git stash pop recupera los archivos guardados en stash y los aplica en la rama.
6. Qué diferencia hay entre HashMap y HashTable?
7. Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
•	Más declarativo y conciso: en un ciclo for tiene un estilo imperativo mientras que este es mas directo en obtener no que se requiere.
•	Mejor legibilidad
•	Permite definir qué hacer con claves duplicadas.
•	Se integra fácilmente con filter, map, sorted en Streams.
•	Permite elegir la implementación del Map (HashMap, TreeMap, etc.).
8. Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?
9. Que hace el método stream().filter() y que retorna?
Lo que hace es filtrar n elementos de una colección mediante una condición.
Esta retorna otro stream con los elementos que hayan pasado el filtro.
10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?
Git Branch crea la rama pero no se mueve a ella inicialmente se queda en la rama donde se creo la otra rama, mientras que checkout crea la rama pero se mueve directamente a ella.
12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
---
