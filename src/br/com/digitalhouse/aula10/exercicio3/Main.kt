package br.com.digitalhouse.aula10.exercicio3

fun main() {
    val alunos = mutableListOf<Aluno>()

    alunos.addAll(arrayOf(
            Aluno("Victor", 1),
            Aluno("Lucas", 2),
            Aluno("Mateus", 3)
    ))

    val alunoMaria = Aluno("Maria", 1)

    println("O aluno de nome ${alunoMaria.nome} ${if (alunos.contains(alunoMaria)) "está" else "não está"} na lista")
}