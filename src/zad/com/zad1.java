package zad.com;

import java.util.*;

import java.util.List;
import java.util.Collections;

public class zad1 {
    public static void main(String[] args){
        List<String> listaImion = new LinkedList<>();
listaImion.add("imie1");
listaImion.add("imie2");
listaImion.add("imie3");
listaImion.add("imie4");
listaImion.add("imie5");
listaImion.add("imie6");
listaImion.add("imie7");
listaImion.add("imie8");
listaImion.add("imie9");
listaImion.add("imie10");


        for (int i : new int[]{0, 1, 2, 7, 8, 9}) listaImion.get(i);


        listaImion.add(5,"noweimie");
        listaImion.remove(0);
        listaImion.remove(0);
        listaImion.remove(0);
        listaImion.remove(4);
        listaImion.remove(4);
        listaImion.remove(4);

List<String> nowaLista = new ArrayList<>();
nowaLista.add("a");
nowaLista.add("b");
nowaLista.add("c");
nowaLista.add("f");
nowaLista.add("h");
nowaLista.add("m");
listaImion.addAll(nowaLista);
System.out.println(listaImion);

Collections.sort (listaImion);
System.out.println(listaImion);

Collections.reverse(listaImion);
System.out.println(listaImion);

            }
        }

