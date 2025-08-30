package ui

fun menu() {
    do {


        println("1 - Cadastrar Caixa D'Água")
        println("2 - Editar Caixa D'Água")
        println("3 - listar Caixa D'Água")
        println("4 - Excluir Caixa D'Água")

        val opcao = readln().toInt()

        when (opcao) {
            1 -> println("Cadastrando caixa...")
            2 -> println("Editando caixa...")
            3 -> println("listar caixa...")
            4 -> println("Excluido caixa...")
            else -> println("Opção inválida")

import crud.cadastrarCaixa
import crud.editarCaixa
import crud.listarCaixa
import crud.editarCaixa
import entidades.CaixaDAgua

fun menu() {
    val caixas = mutableListOf<CaixaDAgua>()
    var opcao: Int

    do {
        println("\n=== MENU CAIXA D'ÁGUA ===")
        println("1 - Cadastrar Caixa D'Água")
        println("2 - Listar Caixas D'Água")
        println("3 - Editar Caixa D'Água")
        println("4 - Excluir Caixa D'Água")
        println("0 - Sair")

        opcao = readln().toInt()

        when (opcao) {
            1 -> {
                val caixa = cadastrarCaixa()
                caixas.add(caixa)
                println("Caixa cadastrada com sucesso!")
            }

            2 -> {

                if (caixas.isEmpty()) {
                    println("Nenhuma Caixa D'Água encontrada.")
                } else {
                    println("\n--- Lista de Caixas ---")
                    caixas.forEachIndexed { index, caixa ->
                        println("${index + 1} - ${caixa.marca}")

                    }
                }

            }

            3 -> {
                if (caixas.isEmpty()) {
                    println("Nenhuma caixa cadastrada para editar.")
                } else {
                    println("Escolha o número da caixa para editar:")
                    caixas.forEachIndexed { index, caixa ->
                        println("${index + 1} - $caixa")
                    }
                    val idx = readln().toInt() - 1
                    if (idx in caixas.indices) {
                        editarCaixa(caixas[idx]) // <- aqui você vai implementar a edição
                    } else {
                        println("Índice inválido.")
                    }
                }
            }

            4 -> {
                if (caixas.isEmpty()) {
                    println("Nenhuma caixa cadastrada para excluir.")
                } else {
                    println("Escolha o número da caixa para excluir:")
                    caixas.forEachIndexed { index, caixa ->
                        println("${index + 1} - $caixa")
                    }
                    val idx = readln().toInt() - 1
                    if (idx in caixas.indices) {
                        caixas.removeAt(idx)
                        println("Caixa removida com sucesso!")
                    } else {
                        println("Índice inválido.")
                    }
                }
            }

            0 -> println("Encerrando o programa...")
            else -> println("Opção inválida, tente novamente.")
        }
    } while (opcao != 0)
}
