package Fundamentos.Funcoes

fun imprimirRelacao(chefe: String, funcionario:String):String{
    return "$funcionario é Subordinado(a) a $chefe"
}

fun main() {
    println(imprimirRelacao(funcionario = "Joao", chefe = "Maria"))
}