package one.digitalinnovation.collections

fun main() {
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



}