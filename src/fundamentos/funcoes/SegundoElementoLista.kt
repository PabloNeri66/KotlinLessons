package fundamentos.funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null
// generics para acrescentar uma parametro no tipo Lista existente no kotlin
//  <E> é um generics que identifica o tipo da lista, list <String> = ...
//    Portanto <E> é uma icognita, pode ser qualquer elemento.


fun main() {
    val list = listOf("João", "Maria", "Pedro")
    print(list.secondOrNull())
}

// a vantagem de criar dessa forma, é tratar e adicionar um métdo
// diretamente na lista ou ao qual classe existente desejar.