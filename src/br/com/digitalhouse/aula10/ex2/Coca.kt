package br.com.digitalhouse.aula10.ex2

class Coca (var tamanho: Int, var preco: Double){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        other as Coca
        if (tamanho === other.tamanho) return true
        if (javaClass != other?.javaClass) return false

        return true
    }
}
