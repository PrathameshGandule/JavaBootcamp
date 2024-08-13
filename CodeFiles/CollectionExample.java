// import java.util.ArrayList;
import java.util.*;
public class CollectionExample{
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<String>();

        cars.add("ALtroz");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");

        System.out.println(cars);

        //hashset duplicate not allowed 
        //hashset order not maintained
        //linkedHashSet when order should be maintained
        //TreeSet used when wanted in sorted order
    }
} 