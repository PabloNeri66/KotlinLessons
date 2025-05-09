package Classes

class Cliente2(name: String) {
    var nome: String = name
        get() = "Meu nome é $field"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?:"Anônimo"
        }
}


fun main() {
    val cl = Cliente2("")
    println(cl.nome)

    val c2 = Cliente2("Pedro")
    println(c2.nome)
}