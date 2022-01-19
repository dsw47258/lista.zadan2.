package zad.com;

import java.util.Scanner;
import java.util.*;

public class zad5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String code;
        ArrayDeque<Customer> rejestracja = new ArrayDeque<>();
        System.out.println("""
                add - zarejestruj nową osobę w kolejce
                pull - wywołaj  następną osobę z kolejki
                out - zamknij program""");

        label:
        while (true){
            code = input.next();

            switch (code) {
                case "add":
                    System.out.print("Imie: ");
                    rejestracja.add(new Customer(input.next()));
                    System.out.println("Dodany do kolejki: " + rejestracja.getLast().getName());
                    break;
                case "pull":
                    if (rejestracja.size() == 0) {
                        System.out.println("Brak osób w kolejce");
                        continue;
                    }

                    System.out.println("Zaproszono: " + rejestracja.getFirst().getName());
                    rejestracja.remove(rejestracja.getFirst());
                    break;
                case "out":
                    break label;
                default:
                    System.out.println("Nie zdefiniowano");
                    break;
            }
        }

    }
}