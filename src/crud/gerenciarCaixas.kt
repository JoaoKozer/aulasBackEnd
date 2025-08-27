package crud

import enumeradores.Material

fun cadastrarCaixa() {
//    val material: Material,
//    val capidade: Int,
//    val cor: String,
//    val peso: Double,
//    val preco: Double,
//    val altura: Double,
//    val profundidade: Double,
//    val largura: Double,
//    val marca: String,
    println("Escolha o material do qual caixa é composta")
    println("1 - Pvc") //PVC, PLÁSTICO, METAL, FITA
    println("2 - Plástico")
    println("3- Metal")
    println("4 - Argamassa")
    val opcao = readln().toInt()
    var material : Material
    when(opcao) {
        1-> material = Material.PVC
        2-> material = Material.PLÁSTICO
        3-> material = Material.METAL
        4-> material = Material.FITA
        else -> material = Material.PLÁSTICO

    }
    println("Capacidade da Caixa: ")
}

fun editarCaixa() {

}

fun listarCaixa() {

}

fun excluirCaixa() {

}