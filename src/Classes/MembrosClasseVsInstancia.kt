package Classes

class ItemDePedido(val nome: String, val preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)//retorno
        @JvmStatic var desconto: Double = 0.0

    }

    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main() {
    val item = ItemDePedido.create("Tv Toshiba", 2906.00)
    println(item.precoComDesconto())
    ItemDePedido.desconto = 0.9
    println(String.format("%.2f", item.precoComDesconto()))

} // esse companion objec só confunde se quer uma funcao top level tira da classe e mesma coisa pra variavel static