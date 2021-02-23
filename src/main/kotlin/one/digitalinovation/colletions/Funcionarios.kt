package one.digitalinovation.colletions

class Funcionarios (
    val nome: String,
    val salario: Double,
    val tipoContrato: String

) {
    override fun toString(): String =
        """
            Nome:     $nome
            salario: $salario
        """.trimIndent()
}
