package funcoes

inline fun <T> execComLog(nomeF: String, funcao: () -> T): T {
    println("Logando na funcao $nomeF")
    try {
        return funcao()
    } finally {
        println("Sainu fio")
    }
}

fun somar2(a: Int, b:Int): Int{
    return a + b
}

fun main() {
    val resultado = execComLog("Somar"){
        somar2(3, 5)
    }
    print(resultado)
}