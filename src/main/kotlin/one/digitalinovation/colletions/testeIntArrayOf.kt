package one.digitalinovation.colletions

fun main() {
    //array sem dimensão - Pode adicionar, remover
    val values = intArrayOf(2,4,5,3,1)

    //Valores sem ordenacao
    values.forEach {
        println(it)
    }

    //Valores ordenados
    values.sort()
    values.forEach {
        println(it)
    }
}

