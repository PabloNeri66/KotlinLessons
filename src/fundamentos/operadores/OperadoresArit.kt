package Fundamentos

fun main() {
    val(v1, v2, v3, v4) = listOf(3, 5, 1, 15)

    val soma = v1 + v2 + v3 + v4
    val sub = v4 - v3
    val div = v4 / v1
    val mult = v1 * v2
    val modulo = v1 % 2

    print("$soma $sub $div $mult $modulo")
}