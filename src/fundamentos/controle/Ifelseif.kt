package fundamentos.controle

fun main() {
    val nota: Double = 9.3

    // Usando o Operador Range
    // O metodo feito na aula nao funcionou por mistura int com double...
    //Portanot modifiquei os controles:

    if(nota in 8.0..10.0){
        println("Excelente")
    }else if(nota in 6.0..8.0){
        println("Boa")
    }else if(nota in 4.0..6.0) {
        println("Ta na corda")
    }else if(nota in 0.0..4.0){
        println("REPROVADO")
    }else{
        println("Nota Inválida")
    }
}