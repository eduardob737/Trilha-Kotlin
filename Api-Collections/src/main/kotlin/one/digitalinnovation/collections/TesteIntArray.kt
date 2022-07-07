package one.digitalinnovation.collections

fun main() {

    // Array de Int mais verboso
    val values = IntArray(5)

    values[0] = 5
    values[1] = 2
    values[2] = 9
    values[3] = 6
    values[4] = 8

        for (valor in values){
            println(valor)
        }

    println("-----------------------")

        for (index in values.indices){
            println(values[index])
        }

    println("-----------------------")


    values.forEach {num ->
        println(num)
    }

    println("-----------------------")

    // Sort para ordernar a lista
    values.sort()
    for (valor in values){
        println(valor)
    }


    println("-----------------------")


    // Array dinâmico, com tamanho inferido de acordo com os valores dentro dele, sem tamanho pré-definido.
    val numeros = intArrayOf(5, 8, 0, 2, 6, 15)

    for (valor in numeros){
        println(valor)
    }



}