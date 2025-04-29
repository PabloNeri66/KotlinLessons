package fundamentos.funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maiorQue(produto: Produto): Boolean = this.preco > produto.preco



fun main() {
    val p1 = Produto(preco = 15.00, nome = "Antena")
    val p2 = Produto("bombril", 2.50)
    println(p1 maiorQue p2)

}
/*A notação infixa em Kotlin é útil para tornar o código mais legível e expressivo, especialmente para funções que representam operações matemáticas ou relacionais. É viável quando a função tem um único parâmetro e a notação infixa facilita a compreensão da lógica do código.*/