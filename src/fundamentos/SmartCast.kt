package Fundamentos

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.uppercase())  // Versão atual do Kotlin
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any){
    when(x){
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Repense a Sua vida!")
    }
}

fun main() {
    souEsperto("ola")
    souEsperto(9)

    souEsperto2("Opa")
    souEsperto2(6)
    souEsperto2(true)
}