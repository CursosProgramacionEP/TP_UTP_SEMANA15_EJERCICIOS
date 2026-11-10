# Taller de Programación - Ejercicios de práctica (Semana 15)

Tres ejercicios para practicar antes de la **Práctica Calificada 3**. Tienen la misma forma que el examen: se le entrega un proyecto con las capas **Vista** y **Controlador** ya desarrolladas y usted implementa las clases de la capa **Modelo** siguiendo un diagrama UML. Un corrector automático revisa su trabajo cada vez que sube sus cambios a GitHub.

Resuélvalos **en orden**: cada ejercicio agrega temas nuevos sobre el anterior.

| # | Ejercicio | Nivel | Tiempo sugerido | Qué practica | Puntos |
|---|---|---|---|---|---|
| 1 | [Refugio de Mascotas](Ejercicio1_RefugioMascotas/README.md) | Básico | 25 minutos | Atributos privados, constructores, *getters*, `toString()` y una clase que contiene a otra | 20 |
| 2 | [Festival de Música](Ejercicio2_FestivalMusica/README.md) | Intermedio | 45 minutos | Lo anterior, más un registro con arreglo de objetos: `agregar`, `obtenerTodas`, recorridos y `StringBuilder` | 20 |
| 3 | [Misiones Espaciales](Ejercicio3_MisionesEspaciales/README.md) | Simulacro de examen | 90 minutos | Todo lo anterior, más un reporte tabular con `String.format()` | 18 + 2 |

## Cómo trabajar

1. Cada carpeta `Ejercicio…` es un **proyecto de NetBeans independiente**. Ábralos uno por uno con *File > Open Project*; no abra la carpeta raíz del repositorio como proyecto.
2. Lea el `README.md` del ejercicio: ahí están el diagrama UML, los requerimientos y los formatos exactos que se evalúan.
3. Cree sus clases **solo** en el paquete `Modelo` del ejercicio. No modifique los paquetes `Vista` y `Controlador` ni la carpeta `test`.
4. Haga un *commit* por cada clase terminada y suba sus cambios (*push*). Así practica la forma de entrega del examen.

## Cómo saber si está bien

- **En GitHub:** después de cada *push*, entre a la pestaña **Actions** de su repositorio y abra la última ejecución. Verá una tabla con cada pregunta, si pasó o no y el puntaje obtenido. Si una pregunta falla, abra su detalle: el mensaje indica qué se esperaba y qué devolvió su código.
- **En NetBeans:** clic derecho sobre el proyecto y elija *Test*. Se ejecutan las mismas pruebas que usa el corrector.

Cada ejercicio se califica por separado: puede tener el Ejercicio 1 completo aunque todavía no haya empezado los otros.

## Reglas que también valen en el examen

- Los paquetes se llaman `Modelo`, `Vista` y `Controlador`, **con la primera letra en mayúscula**. Un paquete `modelo` no será reconocido por el corrector.
- Los nombres de clases, atributos y métodos, y **el orden de los parámetros de los constructores**, deben ser exactamente los del diagrama UML.
- Los textos de `toString()` y de los reportes deben coincidir **carácter por carácter** con el formato pedido: mayúsculas, tildes, espacios y signos.
- Un error de compilación en **cualquier** clase del paquete `Modelo` de un ejercicio hace que todas las preguntas de ese ejercicio obtengan 0. Antes de cada *commit* verifique que su código compile.
- Mientras no existan todas las clases del modelo, el proyecto no se podrá ejecutar, porque la Vista y el Controlador ya las usan. Es normal mientras avanza.
