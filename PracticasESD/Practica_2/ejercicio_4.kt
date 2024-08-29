fun main() {
    val numeros = IntArray(4) 

    for (i in numeros.indices) {
        while (true) {
            try {
                print("Ingresa el número ${i + 1}: ")
                val input = readLine()
                if (input != null) {
                    numeros[i] = input.toInt() 
                    break 
                }
            } catch (e: NumberFormatException) {
                println("Entrada no válida. Por favor, ingresa un número entero.")
            }
        }
    }

    val numeroMayor = numeros.maxOrNull() 
    if (numeroMayor != null) {
        println("El número mayor del array es: $numeroMayor")
    } else {
        println("No se pudo encontrar un número mayor en el array.")
    }
}
