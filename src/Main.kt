/*1. Descripción:

Este ejercicio simula una emocionante carrera automovilística donde varios vehículos compiten para alcanzar una distancia total establecida. La competencia destaca no solo por la velocidad sino también por la habilidad de los conductores para realizar maniobras espectaculares conocidas como filigranas (derrapes en y caballitos en motocicletas), junto con la gestión estratégica del combustible.
2. Lógica de la carrera:

Se iterará sobre la lista de vehículos. En cada iteración se unique se espera una alejamiento, incremento de los kilómetros recorridos en una reclave cantidad entre 10 y 200. Cada vehículo se hace cada 20 km, y de forma aleatoria, una o dos filigramas (derrapación, caballito). Hay que tener en cuenta que tendrá que volver apostar cuando sede sin combustible, Por tanto, si tiene que recorrer 100 km y tiene combustible para recorrer 10, que recorran los 10 kilómetros, luego repostar y recorrer los 90 restantes.
3. Detalles de la Carrera:

    Distancia Total: Se define una distancia total que cualquier vehículo puede alcanzar para completar la carrera.
    Iteraciones Aleatorias: En cada turno, se seleccionan un vehículo para avanzar una distancia de 10 y 200 kilómetros.
    Filigranas: Cada 20 kilómetros recorridos, de forma aleatoria, los vehículos que sensacionan una o dos filigranas, lo que impacta el consumo de combustible.
    Repostaje: Los vehículos necesitan repostar combustible cuando no tienen suficiente para completar la distancia planeada en un turno. Repostarán tantas veces como se ha vuelto a completar la distancia del turno.
    Historial de Acciones: De cada vehículo se mantendrá un registro de todas sus acciones durante la carrera, incluyendo el inicio, los repostajes, Los filigranas, y su posición final.
    Finalización y Clasificación: La carrera final cuando al menos un vehículo alcance la distancia total. Se muestra una clasificación final con la posición de cada vehículo y los kilómetros totales recorridos. También se puede mostrar información relativa a cada vehículo, repostajes, filigranas realizadas, etc.

4. Objetivo:

Desarrollar un entendimiento profundo de la herencia y la sobreescritura en la programación orientada a objetos a objetos. Practicar la implementación de métodos de clase para modificar atributos se da a la práctica a toda una categoría de objetos. El manejo de la visibilidad y el control de acceso a los miembros de las clases.
5. Trabajo a:

    Agregar la propiedad nombre (String)a la clase Vehiculo. A la hora de crear la lista de vehículos en el principal, el nombre de cada vehículo será distinto (manual).
    Definición de la clase Carrera, clase que solo se halizado única, con las propiedades y métodos necesarios para llevar a cabo el sistema.
    Implementan la función main, en la que se ejecutar todo el sistema.
    Recuerda mostrar por todo lo que sucede en la carrera y la posición final de cada participante.

6. Estructura de Clases:

Para que la clase Carreragestione efectivamente el seguimiento de los movimientos y posiciones de los vehículos, así como el historial de sus acciones, se puede proponer las propiedades siguientes y métodos:

    Propiedades:
        nombreCarrera: String- El nombre de la carrera para identificación.
        distanciaTotal: Float- La distancia total que los vehículos deben recorrer para completar la carrera.
        participantes: List<Vehiculo>- Una lista que contiene todos los vehículos participantes en la carrera.
        estadoCarrera: Boolean- Un indicador de si la carrera está en curso o ha finalizado.
        historialAcciones: MutableMap<String, MutableList<String>>- Un mapa para registrar la historial de las acciones de cada vehículo. La clave es el nombre vehículo y el valor es una lista de cuerdas de sus acciones.
        posiciones: MutableList<Pair<String, Int>> o MutableMap<String, Int>- Una lista o diccionario para mantener un registro de la posición y los recorridos recorridos por cada vehículo. Cada elemento es un par donde el primer valor es el nombre del vehículo y el segundo su kilometraje acumulado.

    Métodos:

        iniciarCarrera()Inicia la carrera, de Estado de Carrera a true y de la ciclo de iteraciones donde los vehículos avanzan y realizan acciones.

        avanzarVehiculo(vehiculo: Vehiculo)Identificado el vehículo, lo que hace avanzar una distancia aleo entre 10 y 200 km. Si el vehículo necesita repostar, se llama al método repostarVehiculo (antes) antes de que pueda continuar. Este método llama a realizar filigranas.

        repostarVehiculo(vehiculo: Vehiculo, cantidad: Float): Reposta el vehículo, seleccionador su combustibleActual e incupera la acción en la empresa.

        realizarFiligrana(vehiculo: Vehiculo): Determinamente se da a la determina si un vehículo realiza una filigrana (derrape o caballito) y registra la acción.

        actualizarPosiciones(): Actualiza posiciones con los kilómetros recorridos por cada vehículo después de cada vehículo de la iteración, un seguimiento de la competencia.

        determinarGanador(): Revisa posiciones para identificar al vehículo (o vehículos) que ha alcanzado o superado la distanciaTotal, estableciendo el estado de la carrera a a) y determinantendo el ganador.

        obtenerResultados(): Devuelve una clasificación final de los vehículos, cada elemento tendrá el nombre del vehiculo, posición ocupada, la distancia total recorrida, el número de paradas para volver a poner en su postar y el historial de acciones. La collección se encuentra ordenada por la posición ocupada.

        Para este método podéis crear una clase de datos anidadada en la propia clase de la Carrera:

        /**
         * Representa el resultado final de un vehículo en la carrera, incluyendo su posición final, el kilometraje total recorrido,
         * el número de paradas para repostar, y un historial detallado de todas las acciones realizadas durante la carrera.
         *
         * @property vehiculo El [Vehiculo] al que pertenece este resultado.
         * @property posicion La posición final del vehículo en la carrera, donde una posición menor indica un mejor rendimiento.
         * @property kilometraje El total de kilómetros recorridos por el vehículo durante la carrera.
         * @property paradasRepostaje El número de veces que el vehículo tuvo que repostar combustible durante la carrera.
         * @property historialAcciones Una lista de cadenas que describen las acciones realizadas por el vehículo a lo largo de la carrera, proporcionando un registro detallado de su rendimiento y estrategias.
         */
        data class ResultadoCarrera(
            val vehiculo: Vehiculo,
            val posicion: Int,
            val kilometraje: Float,
            val paradasRepostaje: Int,
            val historialAcciones: List<String>
        )

        De esta manera, la función obtenerResultados()podría retornar una lista de tipo ResultadoCarrera.

        registrarAccion(vehiculo: String, accion: String)Añade una acción al historialAcciones del vehículo especificado.

Este diseño permite a la clase Carrera llevar un control exhaustivo sobre el desarrollo de la carrera, desde el seguimiento del progreso de cada vehículo Hasta la gestión de eventos como repostajes y filigranas, culminando con la determinación del ganador y la presentación de los resultados finales. La inclusión de un historial detallado de acciones para cada vehículo enriqueció la simulación, proporcionando una narrativa completa de la competencia.

Inicialización de la clase carrera:

El constructor se ha formado por el nombre de la carrera, la distancia a recorrer y el número de participantes.

Un ejemplo de lista de participantes podría:

val aurora = Automovil("Aurora", "Seat", "Panda", 50f, 50f * 0.1f, 0f, true) // Coche eléctrico con capacidad de 50 litros, inicia con el 10%
val boreal = Automovil("Boreal", "BMW", "M8", 80f, 80f * 0.1f, 0f, false) // SUV híbrido con capacidad de 80 litros, inicia con el 10%
val cefiro = Motocicleta("Céfiro", "Derbi", "Motoreta", 15f, 15f * 0.1f, 0f, 500) // Motocicleta de gran cilindrada con capacidad de 15 litros, inicia con el 10%
val dinamo = Automovil("Dinamo", "Cintroen", "Sor", 70f, 70f * 0.1f, 0f, true) // Camioneta eléctrica con capacidad de 70 litros, inicia con el 10%
val eclipse = Automovil("Eclipse", "Renault", "Espacio", 60f, 60f * 0.1f, 0f, false) // Coupé deportivo con capacidad de 60 litros, inicia con el 10%
val fenix = Motocicleta("Fénix", "Honda", "Vital", 20f, 20f * 0.1f, 0f, 250) // Motocicleta eléctrica con capacidad de 20 litros, inicia con el 10%

ACLARACI-N : Simulando un entorno de trabajo y desarrollo real, os encontrareis necesidades que no se ha contemplado en el diseño de las clases, coméntalas en clase con tus compañeros y profesor antes de continuar.*/
fun main() {
    println("Hello World!")
}