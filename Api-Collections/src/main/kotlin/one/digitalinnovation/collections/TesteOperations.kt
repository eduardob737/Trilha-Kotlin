package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2280.0, 1000.0, 4520.0)

    for (salario in salarios){
        println(salario)
    }

    // Filtrando o maior, menor e a média do array
    println("----------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("----------------------")


    // Filtrando salários acima de 2500
    val salariosGrandes = salarios.filter {
        it > 2500
    }

    salariosGrandes.forEach {
        println("Salário > 2500: $it")
    }

    println("----------------------")

    // Contando quantos valores estão entre a faixa de 2000.0 até 5000.0
    println(salarios.count { it in 2000.0 .. 5000.0 })
    println("----------------------")

    // Buscando o primeiro valor que atenda a condição (nesse caso, que seja maior que 2250)
    println(salarios.find { it > 2250.0 })
    println(salarios.find { it == 500.0 })
    println("----------------------")

    // Verificando se existe algum valor que atenda a sentença e retorna um boolean
    println(salarios.any { it > 2250.0 })
    println(salarios.any { it == 500.0 })
    println("----------------------")

}
