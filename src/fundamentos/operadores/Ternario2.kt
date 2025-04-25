package Fundamentos.operadores


fun obterResultado(nota: Double): String = if(nota >= 7.0)"Aprovado!" else "Reprovado"

fun main() {
    println(obterResultado(2.0))
}