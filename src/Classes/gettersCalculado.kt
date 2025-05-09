package Classes

data class Produto(val nome:String, var preco:Double, val desc:Double, val ativo:Boolean){
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desc)
}

fun main() {
    val p1 = Produto("ipad", 2300.00, 0.20, ativo = true)
    println(p1.precoComDesconto)

    val p2 = Produto("galaxy s20", 2000.00, 0.5, false)
    println("${p2.nome} De R$ ${p2.preco} por R$ ${p2.precoComDesconto}")

    if (p2.inativo) {
        p2.preco = 0.0
        println("${p2.precoComDesconto}")
    }

    val (nome, preco) = Produto(nome = "Arroz", preco = 2500.00, 0.3, true)
    println ("$nome, $preco")
}