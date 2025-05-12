package Lambdas


class Calculadora{
    fun calcul(a: Int, b: Int, operacao: (Int, Int) -> Int ):Int {
        return operacao(a, b)
    }
}

fun main() {
    val subt = {a: Int, b: Int -> a-b}
    val calculadora = Calculadora()
    val resu = calculadora.calcul(3, 4, subt)
    println(resu)
}