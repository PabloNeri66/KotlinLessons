package fundamentos.funcoes

fun imprimirMaior(a:Int, b:Int){
    println(a+b)
}
fun imprimirMaior2(a:Int, b:Int): Unit{
    println(a+b)
}
fun imprimirMaior3(a:Int, b:Int): Unit{
    println(a+b)
    return
}
fun imprimirMaior4(a:Int, b:Int) {
    println(a+b)
    return Unit
}
fun imprimirMaior5(a:Int, b:Int): Unit{
    println(a+b)
    return Unit
}

fun main() {
    println(imprimirMaior5(2, 1).run { 2 > 1 }.run { println("Resultado = $this") })
} // Essas lambdas e metodos Unit é fundamentais para encadeamento. toString por exemplo
