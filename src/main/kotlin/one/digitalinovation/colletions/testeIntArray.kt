package one.digitalinovation.colletions

fun main() {
    println("Hello World!!")
    //Array com dimensão fixa
    val values = IntArray(5)

    values[0] = 5
    values[1] = 3
    values[2] = 4
    values[3] = 2
    values[4] = 1

    /*
    *for normal imprime Valores armazenados
     */
    println("--- IntArray -----")
    for (valor in values){
        println("Valor na posição values${valor}")
    }


    /*
    *it é o nome dado para iteração
     */
    println("--- Usando ForEach -----")
    values.forEach {
        println(it)
    }

    /*
    *imprimir Indices
     */
    println("--- Imprimindo Indices -----")
    for( index in values.indices){
        println("Valor ${values[index]} na posição - ${index}")
    }

    println("--- Imprimindo ordenado -----")
    values.sort() //ordena
    for (valor in values){
        println("Valor na ${valor}")
    }

}