package fundamentos.funcoes

class Operacoes(){
    fun somar(a: Int, b:Int):Int{
        return a+b
    }
}


fun somar(a:Int, b:Int): Int{
    return a+b
}

//Esse 3º Parametro de calc() é um molde de uma funcao com 2 parametros Int que retorne Int, somar() consegue se encaixar neste exemplo portanto usamos para referenciar.
fun calc(a:Int, b:Int, func: (Int, Int) -> Int/*Referenciar*/):Int{
    return  func(a, b)/*Invocar Somar*/
}


fun main() {
    println(calc(2, 3, ::somar))//
    println(calc(2, 3, Operacoes()::somar))
}