package br.com.digitalhouse.aula10.exercicio4

class Funcionario(val nome: String, val numero: Int) {
    init {
        println("O funcionário $nome($numero) foi criado")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Funcionario) return false

        if (numero != other.numero) return false

        return true
    }
}