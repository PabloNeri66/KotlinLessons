package Fundamentos

import java.util.Date

fun main() {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 === 30)


    val d1 = Date(0)
    val d2 = Date(0)

    //Igualdade Referencial: se as duas var ou val estã no mesmo endereço de memória...
    println("Resultado com '===' ${d1 === d2}")

    // Igualdade Estrutural
    println("Resultado com '==' ${d1 == d2}")
}