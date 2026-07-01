package JavaCollections.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main (String[]args){

        List<Integer>numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        System.out.println(numbers);

        List<Integer>numbers2 = new ArrayList<>();

        numbers2.add(30);
        numbers2.add(35);
        numbers2.add(40);

        ListIterator<Integer> iterator = numbers2.listIterator(numbers2.size());

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        ListIterator<Integer> numbersIterator = numbers.listIterator();

        while (numbersIterator.hasNext()){
            numbers2.add(numbersIterator.next());
        }
        System.out.println(numbers2);
    }
}
