package Fundamentos

data class Carro(val marca: String, val modelo: String){

}

fun main() {
    val (marca, modelo) = Carro("Ford", "Fusion") // Em Kotlin quando vc cria uma instância você não usa a palavra NEW igual no java
    println("$marca $modelo")

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido, $mulher")

    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar")

}