package zad.com;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

import static java.lang.System.nanoTime;

public class zad6 {
    public static void main(String[] args) {
        ArrayList<LinkedList<Double>> firstList = new ArrayList<>();
        LinkedList<LinkedList<Double>> secondList = new LinkedList<>();
        LinkedList<Double> numbers = new LinkedList<Double>();

        Random a = new Random();
    for (int i=0 ; i<5000; i++ ){
            double b = a.nextDouble();
            numbers.add(b);
    }
    long startTimeArray = System.currentTimeMillis();
    firstList.add(numbers);
    long endTimeArray = nanoTime();
    System.out.println("Total time for adding to ArrayList: " + (endTimeArray-startTimeArray));

        long startTimeRemoveArray = System.currentTimeMillis();
        firstList.remove(numbers);
        long endTimeRemoveArray = nanoTime();
        System.out.println("Total time for removing from ArrayList: " + (endTimeRemoveArray-startTimeRemoveArray));

        firstList.add(numbers);
int i=0;
        long startTimeGettingArray = System.currentTimeMillis();
        while (i<firstList.size() ){
            firstList.get(i);
            i++;
        }
        long endTimeGettingArray = nanoTime();

        System.out.println("Total time for getting numbers from ArrayList: " + (endTimeGettingArray-startTimeGettingArray));


        Iterator<LinkedList<Double>> iteratorForArray = firstList.iterator();
        long startTimeIterateArray = System.currentTimeMillis();
        while (iteratorForArray.hasNext()){
            LinkedList<Double> element = iteratorForArray.next();
        }
        long endTimeIterateArray = nanoTime();
        System.out.println("Total time for iterating ArrayList: " + (endTimeIterateArray-startTimeIterateArray));
        //Linkedlist//

        long startTimeLinked = System.currentTimeMillis();
        secondList.add(numbers);
        long endTimeLinked = nanoTime();
        System.out.println("Total time for adding to LinkedList: " + (endTimeLinked-startTimeLinked));

        long startTimeRemoveLinked = System.currentTimeMillis();
        secondList.remove(numbers);
        long endTimeRemoveLinked = nanoTime();
        System.out.println("Total time for removing from LinkedList: " + (endTimeRemoveLinked-startTimeRemoveLinked));

        secondList.add(numbers);
        int b=0;
        long startTimeGettingLiked = System.currentTimeMillis();
        while (b<firstList.size() ){
            firstList.get(b);
            b++;
        }
        long endTimeGettingLinked = nanoTime();

        System.out.println("Total time for getting numbers from LinkedList: " + (endTimeGettingLinked-startTimeGettingLiked));


        Iterator<LinkedList<Double>> iteratorForLinked = secondList.iterator();
        long startTimeIterateLinked = System.currentTimeMillis();
        while (iteratorForLinked.hasNext()){
            LinkedList<Double> number = iteratorForLinked.next();
        }
        long endTimeIterateLinked = nanoTime();
        System.out.println("Total time for iterating LinkedList: " + (endTimeIterateLinked-startTimeIterateLinked));


    }
}
