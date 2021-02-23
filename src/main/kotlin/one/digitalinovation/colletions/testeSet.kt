package one.digitalinovation.colletions

fun main() {
    val joao = Funcionarios("Joao", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0,"CLT")

    //Instancia de Conjuntos
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, pedro, maria )

    //Uniao
    println("=======UNIAO=========")
    val resUnion = funcionarios1.union(funcionarios2)
    resUnion.forEach{println(it)}


    println("======SUBTRAÇÃO==========")
    //
    val resSubtrac = funcionarios3.subtract(funcionarios2)
    resSubtrac.forEach{println(it)}

    println("======Interesecção==========")
    //
    val resIntersect = funcionarios3.intersect(funcionarios2)
    resIntersect.forEach{println(it)}

}