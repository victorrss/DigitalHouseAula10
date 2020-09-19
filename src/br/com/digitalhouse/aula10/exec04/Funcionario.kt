package br.com.digitalhouse.aula10.exec04

class Funcionario(val nome: String, val numeroRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (numeroRegistro != other.numeroRegistro) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}