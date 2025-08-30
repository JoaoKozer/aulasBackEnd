

package entidades

import enumeradores.Material


class CaixaDAgua(
    val material: Material,
    val capidade: Int,
    val cor: String,
    val peso: Double,
    val preco: Double,
    val altura: Double,
    val profundidade: Double,
    val largura: Double,
    val marca: String,
    //val dimensao : Array<Double>, //Altura, Largura, Profundidade
)//Aqui vai os atributos da classe
//{
//    val capacidade = 20000
//    val peso = 200000
//    val cor = "Azul"
//    val altura = 2.00
//    val largura = 2.50
//    val material = "Plástico"
//    val valor = 500.00
//    val conteudo = "água"
//    val valorInstalação = 200.00
//    val outroUso = "Piscina"
//}

import java.math.BigDecimal

class CaixaDAgua(
    var material: Material,
    var capacidade: Int,
    var cor: String,
    var peso: Double,
    var preco: BigDecimal,
    var altura: Double,
    var profundidade: Double,
    var largura: Double,
    var marca: String,

    )

