package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);
        System.out.println("2. data.value = " + data.value);
        data = null;
        System.out.println("3. data = " + data);
//        System.out.println("3. data.value = " + data.value);

        data = new Data();
        System.out.println("4. data = " + data);
        System.out.println("data.value = " + data.value);
    }
}
