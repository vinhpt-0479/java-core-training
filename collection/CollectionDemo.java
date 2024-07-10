import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.function.DoubleToIntFunction;

public class CollectionDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable();
        h.put(1, "one");
        h.put(2, "two");
        h.put(3, "three");
        Set<Integer> a = new HashSet<Integer>(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two Set: "+union);
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two Set: "+intersection);
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference of the two Set: "+difference);
        System.out.println(h);
    }
}
