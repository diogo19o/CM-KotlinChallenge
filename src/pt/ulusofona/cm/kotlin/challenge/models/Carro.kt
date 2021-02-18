package pt.ulusofona.cm.kotlin.challenge.models

import java.text.SimpleDateFormat


class Carro(identificador: String, var motor: Motor) : Veiculo(identificador){

    override fun requerCarta(): Boolean {
        return true
    }

    override fun toString(): String {
        val padrao = "dd-MM-yyyy"
        val simpleDateFormat = SimpleDateFormat(padrao)
        val dataConv = simpleDateFormat.format(dataDeAquisicao)
        return "Carro | $identificador | $dataConv | $posicao"
    }
}
