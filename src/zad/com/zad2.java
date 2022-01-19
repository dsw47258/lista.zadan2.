package zad.com;
import java.util.*;
import java.util.Iterator;

public class zad2 {
    public static void main(String[] args){
Set<Integer> zbior1 = new HashSet<>();
zbior1.add(1);
zbior1.add(2);
zbior1.add(3);
zbior1.add(4);
System.out.println(zbior1.size());//4

Set<Integer> zbior2 = new TreeSet<>();
zbior2.add(4);
zbior2.add(5);
zbior2.add(6);
zbior2.add(7);

zbior1.addAll(zbior2);
System.out.println("Po dodaniu"+"zbior1:"+zbior1 + "zbior2: "+ zbior2);

zbior1.retainAll(zbior2);
System.out.println("Po usunięciu elemrntów nienalężących do zbioru2 "+"zbior1:"+zbior1 + "zbior2: "+ zbior2);

zbior1.removeAll(zbior2);
System.out.println("Po usunięciu zbioru2"+"zbior1:"+zbior1 + "zbior2: "+ zbior2);

System.out.println(zbior1.size());//po dodaniu drugiego zbioru otrzymano 7 a nie 8 elementów
// ponieważ jeden element się powtraza
        zbior1.addAll(zbior2);
       int count=0;
        Iterator<Integer> iterator = zbior1.iterator();
        while(iterator.hasNext()) {
           Integer element = iterator.next();
           if (zbior2.contains(element))
           {
               count++;

           }
        }
        System.out.println("Ile się powtarza: "+count);
    }
}

