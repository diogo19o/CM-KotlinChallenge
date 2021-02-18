package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo(var identificador : String) : Movimentavel {

    var posicao : Posicao = Posicao()
    var dataDeAquisicao : Date = Date()

    fun getID() : String{
        return identificador
    }

    abstract fun requerCarta() : Boolean

    override fun moverPara(x: Int, y: Int) {
        this.posicao.x = x
        this.posicao.y = y
    }
}
