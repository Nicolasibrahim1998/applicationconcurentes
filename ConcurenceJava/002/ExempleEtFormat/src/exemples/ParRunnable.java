package exemples;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pascalfares
 */
public class ParRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ParRunnableThread , en " + i);
            try {
                //Normalement ce thread sera plus long (en temps) que le thread main
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(HeritageThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("HeritageThread se termine");
    }

    public static void main(String[] args)
            throws InterruptedException {

        ParRunnable cible = new ParRunnable();

        Thread t = new Thread(cible);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Initial main, en " + i);
        }
        System.out.println("Boucle main se termine");
        System.out.println("Le second thread est il vivant? " + t.isAlive());
        t.join();
        System.out.println("Le second thread est il vivant? (après join)" + t.isAlive());

    }
}
