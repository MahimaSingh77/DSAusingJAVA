import java.net.SocketTimeoutException;
import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(54);
        set.add(21);

        System.out.println(set); // order is not defined and duplicate elements are not allowed

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

    }
}
