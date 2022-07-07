package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Carlos"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }

}