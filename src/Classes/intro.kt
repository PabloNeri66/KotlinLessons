package Classes

class Cliente{
    var nome: String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "João"
    println(cliente.nome)
}