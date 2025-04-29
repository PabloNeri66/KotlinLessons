package fundamentos.funcoes

fun ordenarArgs(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}



fun main() {
    for(n in ordenarArgs(38, 4, 12, 25, 7, 112)){
        print("$n ")
    }
}