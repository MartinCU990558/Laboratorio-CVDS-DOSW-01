# Laboratorio-CVDS-DOSW-01

## Integrantes
- Juan Andres Suarez
- Raquel Selma

## Evidencias 
### Creación de la Rama Principal
- Se creó la rama `feature/SelmaRaquel_SuarezAndres_2025-2` desde `develop`, siguiendo el estándar del laboratorio.
<img width="1575" height="739" alt="img" src="https://github.com/user-attachments/assets/8e630643-1cef-49bf-9920-bb7254827d7b" />
- Hacimos pull y push para que se carga
<img width="1780" height="570" alt="img_1" src="https://github.com/user-attachments/assets/a6e5e053-eb80-46c5-b8a2-bbbd843a03c5" />
- Hicimos el primer commit 
<img width="1795" height="670" alt="img_2" src="https://github.com/user-attachments/assets/6e45d72d-9f88-4b16-9038-ebb19941af2c" />

### RETO #1: La Bienvenida
- Se implementó la clase `Estudiante` y `MensajeBienvenida`.
- Se utilizó `List`, expresiones `lambda`, `stream().map()` y `collect()` para generar el saludo.

**Evidencia:**
  
  
### RETO #2: Carrera en Paralelo
- Se trabajó en subramas `carril_uno` y `carril_dos`.
- Cada estudiante desarrolló funciones para calcular máximo y mínimo.
- Se resolvieron **conflictos de merge** y se unieron funciones en un objeto `Resultados`.

**Evidencia:**

![Imagen de WhatsApp 2025-08-21 a las 16 39 05_76622fa6](https://github.com/user-attachments/assets/9a3c2552-430a-464e-b8b3-4e02aae694c6)


### RETO #3: El eco misterioso
- Se implementaron métodos usando `StringBuilder` y `StringBuffer`.
- Se generó un choque de merge y se resolvió combinando repeticiones + inversión del texto.

**Evidencia:**
![Imagen de WhatsApp 2025-08-21 a las 17 14 47_e12bf08f](https://github.com/user-attachments/assets/370785bd-8987-4b25-ba1d-f7ef3ebff4fb)

### RETO #4: El tesoro de las Llaves duplicadas
- Se usaron `HashMap` y `Hashtable`.
- Se resolvieron duplicados priorizando el `Hashtable`.
- Se integraron funciones para **mayúsculas y orden ascendente* con `Collectors.toMap()` y `stream().sorted()`.

**Evidencia:**
![Imagen de WhatsApp 2025-08-21 a las 18 18 12_a8868bd6](https://github.com/user-attachments/assets/58f141c3-94bf-4bfd-96fb-2b94a4362959)


### RETO #5: Batalla de Conjuntos
- Se implementaron `HashSet y TreeSet`.
- Se aplicó `stream().filter()` para eliminar múltiplos de 3 y 5.
- Se unieron resultados sin duplicados.

**Evidencia:**
![Imagen de WhatsApp 2025-08-21 a las 18 42 37_9745e1a4](https://github.com/user-attachments/assets/d57c7365-9f94-4764-adcf-808f957921fd)

### RETO #6: La máquina de decisiones
- Se implementó un `switch-case` con distintos comandos.
- Se usó `Map<String, Runnable>` y **lambdas** para ejecutar cada acción.
  
**Evidencia:**

## Respuestas Teóticas

1. **Diferencia entre `git merge` y `git rebase`:**  
   - `merge` combina cambios preservando la historia completa de commits.  
   - `rebase` reescribe la historia moviendo commits sobre la rama base para que la línea de tiempo sea más lineal.  

2. **Si dos ramas modifican la misma línea:**  
   - Se genera un **conflicto de merge** que debe resolverse manualmente antes de confirmar los cambios.  

3. **Ver historial de merges gráficamente en consola:**  
   ```bash
   git log --graph --oneline --all

4. **Diferencia entre commit y push:**  
   - `commit`: guarda cambios **localmente** en el repositorio.  
   - `push`: envía los commits locales al repositorio **remoto**.  

5. **`git stash` y `git pop`:**  
   - `stash`: guarda temporalmente los cambios no confirmados.  
   - `pop`: restaura esos cambios guardados.  

6. **Diferencia entre `HashMap` y `Hashtable`:**  
   - `HashMap` no es sincronizado (más rápido).  
   - `Hashtable` es sincronizado (seguro para hilos, más lento).  

7. **Ventajas de `Collectors.toMap()`:**  
   - Permite convertir streams en mapas de forma declarativa, clara y más eficiente que un bucle tradicional.  
   - Reduce código repetitivo y hace uso del paradigma funcional en Java.  

8. **Uso de `stream().map()`:**  
   - Es una **operación intermedia de transformación**.  
   - Aplica una función a cada elemento y retorna un nuevo stream con los resultados transformados.  

9. **Uso de `stream().filter()`:**  
   - Filtra elementos que cumplen una condición booleana.  
   - Retorna un nuevo stream con solo los elementos que cumplen el filtro.  

10. **Crear una rama desde develop (funcionalidad nueva):**  
   ```bash
   git checkout develop
   git pull
   git checkout -b feature/nueva_funcionalidad  
  ```
  - Se parte desde develop para mantener la base actualizada.
  - Se crea la rama feature/ para trabajar de forma aislada en la nueva funcionalidad.
    
11. **Diferencia entre `git branch` y `git checkout -b`:**

  - `git branch nombre`: crea la rama pero no cambia a ella.
  - `git checkout -b nombre`: crea y cambia a la nueva rama automáticamente.

12. **Recomendación de usar ramas feature:**

  - Permite aislar nuevas funcionalidades sin afectar la rama principal.
  - Evita romper `main` o `develop` con código no probado.
  - Facilita la colaboración en equipos, ya que cada funcionalidad vive en su propia rama.
