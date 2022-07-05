package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {

    val joao = Analista("João Costa", "9569", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}