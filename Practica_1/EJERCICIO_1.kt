fun main() {
    try {
        println("Ingrese el primer numero")
        val numeroUno = readLine()!!.toDouble()

        println("Ingrese el segundo numero")
        val numeroDos = readLine()!!.toDouble()

        println("Ingrese la operacion (+, -, *, /):")
        val operacion = readLine()

        calculate(numeroUno, numeroDos, operacion)
    } catch (e: NumberFormatException) {
        println("Error: Ingrese un número válido.")
    }
}

fun calculate(numeroUno: Double?, numeroDos: Double?, operacion: String?) {
    if (operacion == null || numeroDos == operacion == null ) {
        println("Error: Operación no válida.")
        return
    }

    val resultado = when (operacion) {
        "+" -> numeroUno + numeroDos
        "-" -> numeroUno - numeroDos
        "*" -> numeroUno * numeroDos
        "/" -> numeroUno / numeroDos
        else -> {
            println("Error: Operación no válida.")
            return
        }
    }

    println("Resultado de la operación $numeroUno $operacion $numeroDos = $resultado")
}
