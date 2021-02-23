package one.digitalinovation.colletions

fun main() {
    //objeto pair / pares - passa os tipos e os valores
    val pair: Pair< String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v")}

    //Mapa 2 / tipo infix
    println("==== mapa 2 ====")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach{ (k, v) -> println("Chave: $k - Valor: $v")}

}
