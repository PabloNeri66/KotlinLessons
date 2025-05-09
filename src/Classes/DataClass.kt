package Classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 239)
    val g2 = Geladeira("Brastemp", 239)
    val tv1 = Televisao("toshiba", 12)
    val tv2 = Televisao("toshiba", 12)

    println(g1 == g2) //equals que nao existe no class
    println(tv1 == tv2)// equals implementado
    println(tv1.toString())
    println(tv1.copy(polegadas = 90))

    //Destructuring em cima de data class
    val (marca, pol) = tv1
    println("$marca, $pol")

}