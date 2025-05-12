package Lambdas

fun main() {
    val nomes = arrayListOf("Renata", "José", "Anderson", "Zélia")
    val ordenados = nomes.sortedBy { it }
    println(ordenados)
}