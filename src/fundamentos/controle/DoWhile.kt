package Fundamentos

fun main() {
    //Do while Permite rodar pelo menos 1x, igual no C.
    var opcao: Int = 0

    do {
        print("Digite um Número: ")
        val line = readLine() ?: "0" // Caso o input der null e estiver vazio, esse elvis substituirá por 0
        opcao = line.toIntOrNull() ?: 0 // esse elvis seria usado caso nossa variavel fosse nula ele jogaria pra zero pois métodos nao trabalham com objetos nulos.
        println("Você escolheu a opção $opcao")
    }while(opcao != 0)
    println("Até a próxima!")
}