package one.digitalinnovation.collections

fun main() {
    // Criando variável do tipo Pair (par) que recebe uma chave e um valor vinculado a ela
    val pair: Pair<String, Double> = Pair("José", 1000.0)

    // Criando variável como map para receber o par declarado anteriormente
    val map1 = mapOf(pair)

    // Exibindo a chave e valor declarada
    map1.forEach {
        (k, v) -> println("Chave: $k - Valor: $v")
    }


    // Craindo outra variável do tipo map que recebe de forma inferida os atributos (chave e valor)
    val map2 = mapOf(
        "Carlos" to 2000.0,
        "Maria" to 3000.0
    )

    map2.forEach {
        (k, v) -> println("Chave: $k - Valor: $v")
    }
}