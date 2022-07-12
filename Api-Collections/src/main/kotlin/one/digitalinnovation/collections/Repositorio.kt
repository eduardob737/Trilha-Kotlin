package one.digitalinnovation.collections

// Criando classe Repositorio e atribuindo o tipo T (generics) para ser vinculado a essa classe.
// Esse T será "substituído" por um tipo de classe específico declarado no momento da instânciação dela
class Repositorio<T> {
    // Criando um map mutável que terá uma chave do tipo String e um valor do tipo T(generics)
    private val map = mutableMapOf<String, T>()

    // Função que recebe uma chave (key) e um valor (value) e os insere no map
    fun create (key: String, value: T){
        map[key] = value
    }

    // Função que encontra o map através da chave e retorna de forma dinâmica o valor corrrespondente
    fun findById (key: String) = map[key]

    // Função que retorna todos valores do map
    fun findAll () = map.values
}