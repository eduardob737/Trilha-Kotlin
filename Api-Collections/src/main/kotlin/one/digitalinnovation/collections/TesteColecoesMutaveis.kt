package one.digitalinnovation.collections

fun main() {

    val jose = Funcionario("José", 1000.0, "CLT")
    val maria = Funcionario("Maria", 3000.0, "PJ")
    val carlos = Funcionario("Carlos", 1400.0, "CLT")

    // Trabalhando com listas mutáveis (dinâmicas)
    println("---------------LIST------------------")
    val funcionarios = mutableListOf(jose, maria)
    funcionarios.forEach { println(it) }

    println("-------------------------------------")
    // Adicionando um objeto à lista
    funcionarios.add(carlos)
    funcionarios.forEach { println(it) }

    println("-------------------------------------")
    // Removendo um objeto da lista
    funcionarios.remove(jose)
    funcionarios.forEach { println(it) }

    println("---------------SET------------------")
    val funcionarioSet = mutableSetOf(jose)

    funcionarioSet.add(carlos)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

}