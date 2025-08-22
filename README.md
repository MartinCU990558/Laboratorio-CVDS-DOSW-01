#Maraton Git 2025-2

**Integrantes**

-Sergio Alejandro Idarraga Torres
-Karol Estefany Estupiñan Viancha

**Nombre de la rama:** feature/Idarraga_estupiñan_20025-2

---
##Retos Completados

### Reto 1:La Bienvenida
![alt text](<Captura de pantalla de 2025-08-17 12-14-07-1.png>)

Realizamos tres clases (Estudiante, Mensaje y Reto1) y, apoyándonos en herramientas tecnológicas, utilizamos stream y map para la ejecución de este primer reto, con el fin de comprender mejor su funcionamiento.

### Reto 2:  Carrera en paralelo



## Reto 4: El tesoro de las llaves duplicadas
![alt text](<Captura de pantalla de 2025-08-21 00-30-44.png>)
Seguimos la guía paso a paso, utilizando expresiones lambda y streams. Realizamos cada commit y merge de manera ordenada, resolviendo manualmente los conflictos tanto en los archivos con el mismo nombre como en el último merge para crear la función completa.

## Reto 6: La maquina de decisones
![alt text](<Captura de pantalla de 2025-08-21 20-16-17.png>)
Creamos los métodos correspondientes siguiendo cuidadosamente las indicaciones proporcionadas. Una vez implementados, procedimos a subir los cambios a las ramas correspondientes y realizamos el merge para unificar el trabajo de ambos integrantes del equipo. Durante todo el proceso, tomamos decisiones sobre la implementación y la organización del código basándonos en lo que consideramos más adecuado, aplicando los conocimientos adquiridos y asegurándonos de mantener la coherencia y funcionalidad del proyecto.

## Preguntas y Respuestas

1. **¿Cuál es la diferencia entre git merge y git rebase?**  
    git merge crea un commit de merge preservando el historial original.  
    git rebase reaplica commits de una rama sobre otra, generando un historial lineal.  

2. **¿Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?**  
    Git genera un conflicto que debe resolverse manualmente con git add y git commit.  

3. **¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?**    
     ```bash
     git log --oneline --graph --all --decorate
     ```  

4. **Explica la diferencia entre un commit y un push?**  
    commit guarda los cambios localmente.  
    push envía los commits al repositorio remoto.  

5. **Para que sirve git stash y git pop?**  
    git stash guarda temporalmente cambios no confirmados.  
    git pop recupera los cambios guardados en el stash y los aplica de nuevo.

6. **Qué diferencia hay entre HashMap y HashTable?**  
    HashMap no es sincronizado y permite claves nulas.  
    Hashtable es sincronizado y no permite claves ni valores nulos.  

7. **Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?**  
   - Permite llenar mapas de forma declarativa y concisa.  
   - Integración con Streams para transformar y filtrar datos.  
   - Código más legible y menos propenso a errores.  

8. **Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?**  
    Operación intermedia de transformación que genera un nuevo Stream con los resultados.  

9. **Que hace el método stream().filter() y que retorna?**  
   - Filtra elementos que cumplen una condición.  
   - Retorna un nuevo Stream con los elementos que pasan el filtro.  

10. **Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.**  

   1. Cambia a la rama develop.
   git checkout develop
   2. Baja los cambios del repositorio.
   git pull origin develop
   3. Crea y cambia a la rama nueva localmente.
   git checkout -b feature/nueva-funcionalidad
   4. Sube los cambios al repositorio remoto.
   git push -u origin feature/nueva-funcionalidad

11. **¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?**
    git branch nombre_rama: crea la rama pero no cambia a ella.
    git checkout -b nombre_rama: crea la rama y cambia a ella automáticamente.

12. **¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?**
    - Permite trabajar aislado sin afectar la rama principal (main).
    - Facilita revisiones de código y merges controlados.
    - Mejora la organización y colaboración en equipo, evitando conflictos directos en main.


## Referencias

- Chacon, S., & Straub, B. (2014). *Pro Git* (2nd ed.). Apress. [https://git-scm.com/book/en/v2](https://git-scm.com/book/en/v2)  
- Loeliger, J., & McCullough, M. (2012). *Version Control with Git* (2nd ed.). O’Reilly Media.
- Chacon, S., & Straub, B. (2014). Pro Git (2nd ed.). Apress. https://git-scm.com/book/en/v2
- Loeliger, J., & McCullough, M. (2012). Version Control with Git (2nd ed.). O’Reilly Media.
- Oracle. (2023). Java Platform, Standard Edition 20 API Specification. https://docs.oracle.com/en/java/javase/20/docs/api/index.html

