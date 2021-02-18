package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat
import java.util.*


class Pessoa(val nome : String, var dataDeNascimento : Date) : Movimentavel {

    var veiculos : MutableList<Veiculo> = mutableListOf<Veiculo>()
    lateinit var carta : Carta
    var posicao = Posicao()

    fun comprarVeiculo(veiculo : Veiculo){
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador : String) : Veiculo? {
        for ( v in veiculos ){
            if(v.getID().equals(identificador)){
                return v
            }
        }
        return null
    }

    fun venderVeiculo(identificador : String, comprador : Pessoa) {
        for (i in 0..veiculos.size){
            var veiculo : Veiculo = veiculos.get(i)
            if(veiculo.getID().equals(identificador)){
                veiculos.removeAt(i)
                comprador.veiculos.add(veiculo)
            }
        }
    }

    fun moverVeiculoPara(identificador : String, x : Int, y : Int) {
        for ( v in veiculos ){
            if(v.getID().equals(identificador)){
                v.moverPara(x,y)
            }
        }
    }

    fun temCarta() : Boolean {
        return false
    }

    fun tirarCarta() {
        this.carta = Carta()
    }

    override fun moverPara(x: Int, y: Int) {
        this.posicao.x = x
        this.posicao.y = y
    }

    override fun toString(): String {
        val padrao = "dd-MM-yyyy"
        val simpleDateFormat = SimpleDateFormat(padrao)
        val dataConv = simpleDateFormat.format(dataDeNascimento)
        return "Pessoa | $nome | ${dataConv} | $posicao"
    }
}
