package one.digitalinnovation.collections

fun main() {

    val jose = Funcionario("José", 1000.0, "CLT")
    val maria = Funcionario("Maria", 3000.0, "PJ")
    val carlos = Funcionario("Carlos", 1400.0, "CLT")

    // Atribuindo objetos às variáveis
    val funcionarios1 = setOf(jose, carlos)
    val funcionarios2 = setOf(maria)

    // Unindo as duas váriaveis em uma só
    val resultadoUniao = funcionarios1.union(funcionarios2)
    resultadoUniao.forEach { println(it) }

    println("-----------------------------")

    // Atribuindo os 3 objetos à variável
    val funcionarios3 = setOf(jose, carlos, maria)

    // Atribuindo a variavel anterior e removendo dela os valores de funcionarios2
    val resultadoSubtracao = funcionarios3.subtract(funcionarios2)
    resultadoSubtracao.forEach { println(it) }

    println("-----------------------------")

    // Atribuindo à variável os valores em comum entre funcionarios3 e funcionarios2
    val resultadoIntersecao = funcionarios3.intersect(funcionarios2)
    resultadoIntersecao.forEach { println(it) }



}