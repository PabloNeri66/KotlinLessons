package Lambdas

fun main() {
    val soma = { x: Int, y: Int ->
        x + y // corpo
        1 + 3//Retorno é a ultima linha do lambda
    }
    println(soma(4, 2))
    val soma2 = {x: Int, y: Int -> x + y}
    println(soma2((2-3+6/4), 4))
}