package fundamentos.controle

fun main() {
    val nota = 3

    when(nota){
        10, 9 -> println("Ótimo")
        8, 7 -> println("Parabéns")
        5, 6 -> println("Tá na corda chefe")
        in 0..4 -> println("Reprovado")
        else -> println("Nota Inválida")
    }
}



