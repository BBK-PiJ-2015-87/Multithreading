/**
 * Created by vladimirsivanovs on 18/11/2015.
 */
public class Anna implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm Anna");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
