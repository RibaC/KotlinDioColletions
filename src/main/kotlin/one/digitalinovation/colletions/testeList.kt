package one.digitalinovation.colletions

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{println(it)}

    println("Busca funcionario com nome informado")
    println(funcionarios.find{it.nome == "Joao"})

    println("-- Organizar por algo sortedBy --")
    funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}

    println("-- Agrupar por uma propriedade --")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach{println(it)}

    println("-- Adicionar funcionario-- API Colletions nao tem como adicionar --")


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString(): String =
        """
            Nome:     $nome
            salario: $salario
        """.trimIndent()
}