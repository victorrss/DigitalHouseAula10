package br.com.digitalhouse.aula10.exercicio4

fun main() {
    val funcionarios = mutableListOf<Funcionario>()

    funcionarios.addAll(arrayOf(
            Funcionario("Victor", 1),
            Funcionario("Lucas", 2),
            Funcionario("Mateus", 3)
    ))

    val funcMaria = Funcionario("Maria", 1)

    println("\n\nO funcionário de nome ${funcMaria.nome} ${if (funcionarios.contains(funcMaria)) "está" else "não está"} na lista")
}