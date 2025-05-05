package Classes

class Pessoa1()
class Pessoa2(var nome:String)
class Pessoa3(val nome:String)
class Pessoa4(nomeI : String){
    val nome: String = nomeI
}

fun main() {
    val p2 = Pessoa2(nome = "John")
    p2.nome = "John wick"
    print("${p2.nome} ")

    val p3 = Pessoa3("maria")
    val p4 = Pessoa4(nomeI = "Roger")
}