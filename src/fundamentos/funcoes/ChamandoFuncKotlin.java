package fundamentos.funcoes;

import kotlin.collections.CollectionsKt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class ChamandoFuncKotlin {
    public static void main(String[] args){
        ArrayList<String> list = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
        System.out.println(SegundoElementoListaKt.secondOrNull(list));

    }
}
