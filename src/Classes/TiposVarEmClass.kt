package Classes

val diretamenteNoarquivo = "Bom dia"

fun toplevel(){
    val local = "Fulano"
    println("$local, $diretamenteNoarquivo")
    return Unit
}

class Coisa{
    var variavelDeInstancia: String = "Boa Noite!"

    companion object{
        @JvmStatic val constantDeClass = "Ciclano"
    }

    fun fazer(){
        val local : Int = 7
    }
}