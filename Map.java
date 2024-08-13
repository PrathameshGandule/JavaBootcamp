import java.util.*;
class Map{
    public static void main(String[] args) {
        HashMap<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Altroz");
        cars.put(2, "Nexon");
        cars.put(3, "BMW");
        cars.put(4, "Ford");
        cars.put(5, "Mazda");
        cars.put(6, "Mazda");

        System.out.println(cars.getOrDefault(1, "bye"));
        System.out.println(cars.getOrDefault(5, "hello"));
    }
}