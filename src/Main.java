import java.util.Arrays;


public class Main {
    static int count = 0;

    Main() {
        while (count < 10) new Main(++count);
    }

    Main(int x) {
        super();
    }

    public static void main(String[] args) {
        new Main();
        new Main(count);
        System.out.println(count++);
    }
}



