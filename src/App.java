import java.util.Scanner;

/**
 * Created by vladimirsivanovs on 18/11/2015.
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vlad vlad = new Vlad();
        Anna anna = new Anna();
        new Thread(vlad).start();
        new Thread(anna).start();
        String str = "";
        while (!str.equals("-1")) {
            str = sc.nextLine();
            System.out.println(str.toUpperCase());
        }
    }
}
