package br.com.digitalhouse.aula10.exec04

fun main() {
    val list = mutableListOf<Funcionario>()
    val fun01 = Funcionario("Lucas", 13)
    val fun02 = Funcionario("Vitor", 17)
    val fun03 = Funcionario("Mateus", 12)
    val fun04 = Funcionario("Astrogildo", 45)

    list.addAll(listOf(fun01, fun02, fun03, fun04))

    val fun05 = Funcionario("Vitória", 45)
    println("Funcionario${fun05.nome} está na lista? ${list.contains(fun05)}")


    println("E agora o funcionario${fun05.nome} está na lista? ${list.contains(fun05)}")
}