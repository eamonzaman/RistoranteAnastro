import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Cibo> c1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10);
            c1.add(new Cibo(num));
        }

        for (Cibo cibo : c1) {
            System.out.println(cibo.toString());
        }
    }
}
