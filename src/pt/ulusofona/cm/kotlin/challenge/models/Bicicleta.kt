package pt.ulusofona.cm.kotlin.challenge.models

import java.text.SimpleDateFormat

class Bicicleta(identificador : String) : Veiculo(identificador){
    override fun requerCarta(): Boolean {
        return false
    }

    override fun toString(): String {
        val padrao = "dd-MM-yyyy"
        val simpleDateFormat = SimpleDateFormat(padrao)
        val dataConv = simpleDateFormat.format(dataDeAquisicao)
        return "Bicicleta | $identificador | $dataConv | $posicao"
    }
}
