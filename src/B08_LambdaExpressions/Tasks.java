package B08_LambdaExpressions;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tasks {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

        // Schreibe 2 unterschiedliche Consumer
        System.out.println("Beispiele für Consumer");
        System.out.println("----------------------");

        Consumer<String> rent = (carBrand) -> {
            System.out.println("You rented a " + carBrand + " car.");
        };
        rent.accept("Mercedes");
        rent.accept("Porsche");

        Consumer<LocalDate> findYourAge = (birthDay) -> {
            System.out.println(Period.between(birthDay, LocalDate.now()).getYears());
        };
        findYourAge.accept(LocalDate.of(2009, 7, 12));
        findYourAge.accept(LocalDate.of(2017, 6, 12));
        System.out.println();

        // Schreibe 2 unterschiedliche Predicate
        System.out.println("Beispiele für Predicate");
        System.out.println("----------------------");

//        Predicate<Product> preiseLimit = (o) -> o.getPrice() > 100;
//        Product product = new Product("Tasse, gelb", 120, 2.99);
//        if(preiseLimit.test(product))
//            System.out.println(product.getName()+ " ist teuer.");
//        else
//            System.out.println(product.getName()+ " ist nicht teuer.");

        Predicate<String> capitalLetterCheck = (o) -> o.matches(".*[A-Z].*");
        System.out.println(capitalLetterCheck.test("askdjncksdc"));
        System.out.println(capitalLetterCheck.test("askdjNcksdc"));
        System.out.println();

        // Schreibe 2 unterschiedliche Supplier
        System.out.println("Beispiele für Supplier");
        System.out.println("----------------------");

        Supplier<Double>  pi = () ->{
            return Math.PI;
        };
        System.out.println(pi.get());


        // Schreibe 2 eigene FunctionalInterfaces und
        // jeweils 2 Lambdas pro Interface
        System.out.println("Beispiele für FunctionalInterfaces");
        System.out.println("----------------------");
        Example1 strToAsciiList = (str) ->{
            List<Integer> intList= new ArrayList<>();
            for (char ch:str.toCharArray() ) {
                intList.add((int)ch);
            }
            return  intList;
        };

        System.out.println(strToAsciiList.doIt("Hello!"));


        Example2 sumOElements = (ii)->{
            int s=0;
            for (int i:ii) {
                s+=i;
            }
            return s;
        };
//        System.out.println(sumOElements.doIt(List.of(1,2,3,4,6,7)));

        Example2 median = (ii)->{
            Collections.sort(ii);
            if(ii.size()%2!=0){
               return ii.get((ii.size())/2);
            }
            else{
                return ((ii.get(ii.size()/2)-1)+ii.get((ii.size()/2)))/2;
            }
        };

//        List<Integer> numbers = new ArrayList<>(List.of(13,3,4,5,7,1,8)); //5
//        System.out.println(median.doIt(numbers));
//
//        numbers = new ArrayList<>(List.of(2,4,6,8,9,10)); //7
//        System.out.println(median.doIt(numbers));
    }

    @FunctionalInterface
    interface Example1{
        List<Integer> doIt(String str);

    }
    @FunctionalInterface
    interface Example2{
        int doIt(List<Integer> intList);
    }
}
