package br.com.digitalhouse.aula10

import br.digitial.com.aula10.br.com.digitalhouse.aula10.Pessoa

fun main() {
    val p1 = Pessoa("Lucas", 3245)
    val p2 = Pessoa("Mateus", 3245)
    println(p1.equals(p2))
}