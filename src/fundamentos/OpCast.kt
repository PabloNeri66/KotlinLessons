package Fundamentos

fun imprimirConceito(nota:Any){
    when(nota as Int){
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        1, 2 -> println("E")
        else -> println("Nota Inválida")
    }
}

fun main() {
    imprimirConceito( 2)
}