package br.com.digitalhouse.aula10.exercicio3

class Aluno(val nome: String, val numero: Int) {
    init {
        println("O aluno $nome($numero) foi criado")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aluno) return false

        if (numero != other.numero) return false

        return true
    }
}