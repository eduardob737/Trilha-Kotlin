package one.digitalinnovation.collections

    // Criação da classe Funcionário com o construtor primário
data class Funcionario (val nome: String, val salario: Double){

        // Sobrepondo método de impressão para objetos do tipo Funcionario
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}

fun main() {

    // Criando objetos do tipo Funcionario
    val jose = Funcionario("José", 1000.0)
    val maria = Funcionario("Maria", 3000.0)
    val carlos = Funcionario("Carlos", 1400.0)

    // Criando uma constante para receber uma lista com objetos do tipo Funcionario de modo inferido
    val funcionarios = listOf(jose, maria, carlos)

    // Imprimindo cada objeto da lista de funcionarios
    funcionarios.forEach { println(it) }

    println("------------------------------")

    // Procurando pelo objeto cuja variavel nome seja "Maria"
    println(funcionarios.find { it.nome == "Maria" })

}



