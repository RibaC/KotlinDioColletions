package one.digitalinovation.colletions

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"

    println("Nomes ")
    for(nome in nomes){
        println(nome)
    }


    println("Nomes ordenados")
    nomes.sort()
    nomes.forEach { println(it) }


    println("Nova instancia de String")
    val nomes2 = arrayOf("Ana","Bia" ,"Carol")

    nomes2.forEach { println(it) }

}