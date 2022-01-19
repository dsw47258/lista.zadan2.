package zad.com;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class zad4 {
    public static void main(String[] args) {
        Person person1 = new Person(1234567L, "Mar", "ir", 18, "sdfgh");
        Person person2 = new Person(1234567L, "Mrr", "ir", 18, "sdfgh");
        Person person3 = new Person(1234567L, "Lar", "ir", 18, "sdfgh");
        Person person4 = new Person(1234567L, "Nar", "ir", 18, "sdfgh");
        Person person5 = new Person(1234567L, "Lam", "ir", 18, "sdfgh");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj literę od której nie może zaczynać się imię");
        String firstLetter = input.next();
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()) {
            Person element = iterator.next();
            if (element.checkIndex(firstLetter)) {
                iterator.remove();
            }
        }
        System.out.println("Ludzie po usunięciu"+personList);
    }
}

