package fundamentos.funcoes


fun <E> selecionar(lista: List<E>, filtro: (E) ->Boolean): List<E>{
    val listaFiltrada = ArrayList<E>()
    for(elemento in lista){
        if(filtro(elemento))listaFiltrada.add(elemento)
    }
    println(listaFiltrada)
    return listaFiltrada
}
fun filtrar(nome: String): Boolean{
    return nome.length == 3
}

fun main() {
    val nome = arrayListOf("Maria", "José", "Luiz", "Eva", "let", "Jão", "Caique")
    selecionar(nome, ::filtrar)
}