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


import entidades.CaixaDAgua
import enumeradores.Material
import java.math.BigDecimal


fun cadastrarCaixa(): CaixaDAgua {
    println("Escolha o material do qual a caixa é: ")
    println("1 - PVC")
    println("2 - Plástico")
    println("3 - Metal")
    println("4 - Fita")

    val opcao = readln().toInt()
    val material: Material = when (opcao) {
        1 -> Material.PVC
        2 -> Material.PLÁSTICO
        3 -> Material.METAL
        4 -> Material.FITA
        else -> Material.PLÁSTICO
    }

    println("Capacidade da Caixa (litros): ")
    val capacidade = readln().toInt()

    println("Cor da Caixa: ")
    val cor = readln()

    println("Peso da Caixa (kg): ")
    val peso = readln().toDouble()

    println("Preço da Caixa: ")
    val preco: BigDecimal = readln().toBigDecimal()

    println("Altura da Caixa (m): ")
    val altura = readln().toDouble()

    println("Profundidade da Caixa (m): ")
    val profundidade = readln().toDouble()

    println("Largura da Caixa (m): ")
    val largura = readln().toDouble()

    println("Marca da Caixa: ")
    val marca = readln()

    return CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundidade,
        largura = largura,
        marca = marca
    )
}

fun editarCaixa(caixa: CaixaDAgua) {
    println("=== Editando Caixa ===")

    println("Material atual ${caixa.material}")
    println("Escolha o novo material (enter manter)")
    println("1 - PVC | 2 - Plástico | 3 - Metal | 4 - Fita")
    val opcao = readln()
    if (opcao.isNotBlank()) {
        caixa.material = when (opcao.toInt()) {
            1 -> Material.PVC
            2 -> Material.PLÁSTICO
            3 -> Material.METAL
            4 -> Material.FITA
            else -> Material.PLÁSTICO
        }
    }

    print("Capacidade atual (${caixa.capacidade}): ")
    val novaCapacidade = readln()
    if (novaCapacidade.isNotBlank()) caixa.capacidade = novaCapacidade.toInt()

    print("Cor atual (${caixa.cor}): ")
    val novaCor = readln()
    if (novaCor.isNotBlank()) caixa.cor = novaCor

    print("Pso atual (${caixa.peso}): ")
    val novoPeso = readln()
    if (novoPeso.isNotBlank()) caixa.peso = novoPeso.toDouble()

    print("Preço atual (${caixa.preco}): ")
    val novoPreco = readln()
    if (novaCor.isNotBlank()) caixa.preco = novoPreco.toBigDecimal()

    print("Altura atual (${caixa.altura}): ")
    val novaAltura = readln()
    if (novaAltura.isNotBlank()) caixa.altura = novaAltura.toDouble()

    print("Profundidade atual (${caixa.profundidade}): ")
    val novaProfundidade = readln()
    if (novaProfundidade.isNotBlank()) caixa.profundidade = novaProfundidade.toDouble()

    print("Largura atual (${caixa.largura}): ")
    val novaLargura = readln()
    if (novaLargura.isNotBlank()) caixa.largura = novaLargura.toDouble()

    print("Marca atual (${caixa.marca}): ")
    val novaMarca = readln()
    if (novaMarca.isNotBlank()) caixa.marca = novaMarca.toString()

    println("Caixa editada com sucesso! ")

}

fun listarCaixa() {


}

fun excluirCaixa() {

}

}


fun excluirCaixa(caixas: MutableList<CaixaDAgua>) {

    if (caixas.isEmpty()) {
        println("Nenhuma Caixa D'Água encontrada.")
    } else {
        println("\n--- Lista de Caixas ---")
            caixas.forEachIndexed { index, caixa ->
                println("$index - ${caixa.marca} (${caixa.capacidade}L) ")
                }
        println("Qual caixa você deseja remover? (Número) ")
        val opcao = readln().toInt()

        if (opcao in caixas.indices) {
            caixas.removeAt(opcao)
            println("Caixa removida com sucesso")

        } else {
            println("Opção inválida ")
        }

        }
    }

