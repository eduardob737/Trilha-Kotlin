package one.digitalinnovation.collections

fun main() {

    // Array de string comum (mais verboso)
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Carlos"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }


    println("-----------------")



    // Array de string (dinâmico) com tipo inferido usando arrayOf
    val nomes2 = arrayOf("Maria", "José", "Carlos")

    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}