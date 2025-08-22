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

## Referencias

- Chacon, S., & Straub, B. (2014). *Pro Git* (2nd ed.). Apress. [https://git-scm.com/book/en/v2](https://git-scm.com/book/en/v2)  
- Loeliger, J., & McCullough, M. (2012). *Version Control with Git* (2nd ed.). O’Reilly Media.
