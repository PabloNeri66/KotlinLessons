package Classes

class Filme {
    val nome: String
    val anoLancamento: String
    val genero: String

    constructor(nome: String, anoLancamento:String, genero:String) // Por isso a gente nao poe nem val nem var (Inicializacao do objeto)
    {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("estomago", "2006", "Suspense")
    println("${filme.nome} exibido em ${filme.anoLancamento}")
}