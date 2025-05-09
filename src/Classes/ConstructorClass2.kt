package Classes

class Filme2(val nome:String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2("Monstros S.A", 2003, "Animacao")
    println("${filme.genero}, ${filme.nome} foi exibida em ${filme.anoLancamento}!")
}