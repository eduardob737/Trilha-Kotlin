package one.digitalinnovation.collections

fun main() {

    // Criando objetos do tipo Funcionario
    val jose = Funcionario("José", 1000.0, "CLT")
    val maria = Funcionario("Maria", 3000.0, "PJ")
    val carlos = Funcionario("Carlos", 1400.0, "CLT")

    // Criando uma constante para receber uma lista com objetos do tipo Funcionario de modo inferido
    val funcionarios = listOf(jose, maria, carlos)

    // Imprimindo cada objeto da lista de funcionarios
    funcionarios.forEach { println(it) }

    println("------------------------------")

    // Procurando pelo objeto cuja variavel nome seja "Maria"
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------------------")

    // Ordenando os itens da lista pelo atributo salário
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------------------")

    // Agrupando os itens da lista pelo tipo de contratação dos funcionários
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}



