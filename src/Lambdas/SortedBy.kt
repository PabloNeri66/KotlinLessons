package Lambdas

fun main() {
    val nomes = arrayListOf("Renata", "José", "Anderson", "Zélia")
    val ordenados = nomes.sortedBy { it }
    val ordenadoUltimaLetra = nomes.sortedBy { it.reversed() }
    println(ordenados)
    println(ordenadoUltimaLetra)
}