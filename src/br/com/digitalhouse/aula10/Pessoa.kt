package br.digitial.com.aula10.br.com.digitalhouse.aula10

class Pessoa(val nome: String, val rg: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (rg != other.rg) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}