package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(cavalos : Int, cilindrada : Int ) : Ligavel {
    var ligado : Boolean = false

    override fun ligar() {
        if(ligado){
            throw VeiculoLigadoException()
        }
        ligado = true
    }

    override fun desligar(){
        if(!ligado){
            throw VeiculoDesligadoException()
        }
        ligado = false
    }

    override fun estaLigado(): Boolean {
        return this.ligado
    }
}