package Classes

enum class DiaSemana2(val id: Int, val nome:String, val util:Boolean){
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda", true),
    TERCA(3, "Terça", true),
    QUARTA(4, "Quarta", true),
    QUINTA(5, "Quinta", true),
    SEXTA(6, "Sexta", true),
    SABADO(7, "Sábado", false)
}

fun main() {
    for(dia in DiaSemana2.values()){
        println("${dia.nome}, ${dia.id}, ${dia.util}")
    }
}