package one.digitalinnovation.collections

fun main() {

    // Array simples de valores doubles
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    // Impressão com forEach
    salarios.forEach {
        println(it * 2)
    }

    println("-----------------------------------")

    // Usando forEachIndexed para alterar os valores do array
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }

    // Imprimindo os novos valores
    salarios.forEach {
        println(it)
    }

    println("-----------------------------------")

    // Array dinâmico de valores doubles
    val salarios2 = doubleArrayOf(2500.0, 3500.0, 7400.0)

    // Ordenando o array
    salarios2.sort()

    // Imprimindo o array
    salarios2.forEach {
        println(it)
    }


}