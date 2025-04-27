package Fundamentos.Funcoes

import  java.util.*

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agoraHorario(): Horario{
    val agora = Calendar.getInstance()

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main() {
    val(h, m, s) = agoraHorario() // para pegar essas 3 variaveis (podiam existir mais), usamos o destructor!!

    println("$h : $m : $s")
}