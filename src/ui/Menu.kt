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
        }
    } while (opcao != 0)
}
