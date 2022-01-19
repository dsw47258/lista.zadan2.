package zad.com;
import java.security.Key;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj przedział");
        int x = input.nextInt();
        System.out.println("Podaj ile losowań");
        int y = input.nextInt();

        Random losowe = new Random();
        HashMap<Integer, Integer> zbiorLiczb = new HashMap<>();

        for (int i = 0; i < y; i++) {
            int number = losowe.nextInt(x)+1;
            int count =0;

            if (zbiorLiczb.containsKey(number)) {

                int currentCount = zbiorLiczb.get(number);
                zbiorLiczb.put(number, currentCount + 1);//liczba wylosowana, ile liczb o takim kluczu
            } else {
                zbiorLiczb.put(number,count++);
            }
        }
        System.out.println(zbiorLiczb);

    }
}



