public class GenericDemo<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
    public static void main(String[] args) {
        // use Integer
        GenericDemo<Integer> m1 = new GenericDemo<Integer>();
        m1.add(2);
        System.out.println(m1.get());

        // use String
        GenericDemo<String> m2 = new GenericDemo<String>();
        m2.add("Hello");
        System.out.println(m2.get());
    }
}
