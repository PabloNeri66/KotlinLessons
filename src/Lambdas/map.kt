package Lambdas

fun main() {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.uppercase()}.apply {print(this)}
}