package javaCollections.duplicates;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));



        months.add(7, new Month("August"));

        System.out.println("-Arraylist:");
        for (Month month : months) {
            System.out.println(month.getName());
        }
        HashSet<Month> monthSet = new HashSet<>(months);

        System.out.println("-Hashset:");
        for (Month month : monthSet){
            System.out.println(month.getName());
        }

        System.out.println("-Iterator:");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()){
            Month month = iterator.next();
            System.out.println(month.getName());
        }
    }
}