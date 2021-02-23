package one.digitalinovation.colletions

fun main() {
    //Instancia de Double Array
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 5000.0

    //Imprimir Salarios
    salarios.forEach { println(it) }

    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1

    }

    println("Resultado do Aumento nos salarios")
    salarios.forEach { println(it) }

    //outra forma de instanciar
    val salarios2 = doubleArrayOf(2000.0, 3000.0, 4000.0)
}