package one.digitalinovation.colletions

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("________________________")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")


    //Filtrar salarios
    val slMaior2500 = salarios.filter{it > 2500.0}
    println("________________________")
    slMaior2500.forEach{println(it)}

    println("--- Contar salarios dentro de um Range")
    println(salarios.count{ it in 2000.0..5000.0})


    println("--- Encontrar valor ----")
    println(salarios.find{ it == 2250.0})

    println("--- Encontrar valor qualquer que a expressao seja valida - Retorna True / False ----")
    println(salarios.any{ it == 1000.0})




}