package Classes

class Calculadora {
    private var resultado: Int = 0

    fun Somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }
}