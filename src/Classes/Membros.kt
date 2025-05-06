package Classes

class Date( var day:Int, var month: Int, var year:Int){
    fun format(): String{
        return "$day/$month/$year"
    }
}

fun main() {
    var nascimento: Date = Date(day = 11,10, 2004)
    println("nasceu em ${nascimento.day}/${nascimento.month}/${nascimento.year}")
}