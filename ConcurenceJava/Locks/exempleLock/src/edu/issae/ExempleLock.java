/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.issae;

/**
 *
 * @author ppfar
 */
public class ExempleLock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Integer i = 0;
        AvecLock al = new AvecLock(i);
        Runnable r = () -> {
            for (int j = 0; j < 100; j++) {
                al.inc();
            }
        };

        Thread t = new Thread(r);
        t.start();
        t.join();
        System.out.printf("i=%d",al.getValue());
    }

}
