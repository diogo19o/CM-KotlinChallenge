package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoNaoEncontradoException : Exception() {
    override val message = "Nao possui nenhum veiculo com esse identificador"
}
