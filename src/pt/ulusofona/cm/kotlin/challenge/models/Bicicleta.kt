package pt.ulusofona.cm.kotlin.challenge.models

class Bicicleta(identificador : String) : Veiculo(identificador){
    override fun requerCarta(): Boolean {
        return false
    }
}
