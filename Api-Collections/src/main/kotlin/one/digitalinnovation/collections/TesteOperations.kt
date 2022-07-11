package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2250.0, 1000.0, 4520.0)

    for (salario in salarios){
        println(salario)
    }

    println("----------------------")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")


    // Filtrando salários acima de 2500
    val salariosGrandes = salarios.filter {
        it > 2500
    }

    println("----------------------")

    salariosGrandes.forEach {
        println("Salário > 2500: $it")
    }


}
