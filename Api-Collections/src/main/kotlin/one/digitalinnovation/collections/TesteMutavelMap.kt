package one.digitalinnovation.collections

fun main() {

    val jose = Funcionario("José", 1000.0, "CLT")
    val maria = Funcionario("Maria", 3000.0, "PJ")
    val carlos = Funcionario("Carlos", 1400.0, "CLT")

    // Criando objeto da classe Repositorio com o tipo Funcionario que substitui o tipo generics T da classe
    val repositorio = Repositorio<Funcionario>()

    // Chamando a função create da classe Repositorio e passando o atributo "nome" do objeto da classe "Funcionário" como key e o próprio objeto como value.
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)
    repositorio.create(carlos.nome, carlos)

    // Imprimindo o retorno do método findById que recebeu como parâmetro uma key e retorna o value atribuído a ela
    println(repositorio.findById("Carlos"))

    println("-----------ALL VALUES----------")

    // Chamando método que retorna todos valores do map e removendo um dos funcionários
    repositorio.findAll().remove(carlos)

    // Exibindo todos valores do map atualizado
    repositorio.findAll().forEach{ println(it) }

}