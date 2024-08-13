import java.util.*;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

class streamexpample {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(60);
        System.out.println(num);

        Set<Integer> ans = num.stream().filter(i -> i%20==0).collect(Collectors.toSet());
        System.out.println(ans);

        List<Integer> ans2 = num.stream().map(i -> i+10).collect(Collectors.toList());
        System.out.println(ans2);
    }
}
