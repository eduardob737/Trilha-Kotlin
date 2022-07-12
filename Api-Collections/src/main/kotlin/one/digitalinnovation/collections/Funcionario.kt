package one.digitalinnovation.collections

 // Criação da classe Funcionário com o construtor primário
    data class Funcionario (val nome: String, val salario: Double, val tipoContratacao: String){

        // Sobrepondo método de impressão para objetos do tipo Funcionario
        override fun toString(): String =
            """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
    }