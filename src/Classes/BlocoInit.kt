package Classes

class Filme3(nome: String, anoLancamento:String, genero: String){
    val nome: String
    val anoLancamento:String
    val genero:String


    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme  = Filme3("PI", "2011", "drama")
    print("${filme.nome}, foi lancado em ${filme.anoLancamento}")
}