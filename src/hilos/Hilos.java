/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdist
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Implementación "Impura"
            HelloThread hilo1 = new HelloThread();
            //Implementación "Pura"
            Thread hilo2 = new Thread(new HelloRunnable());
            System.out.println(Thread.currentThread().getName());
            hilo1.start();
            hilo1.join(15);
            hilo2.start();
            //Se imprimen todos con nombre main pq no se está activando concurrencia
            //Se están concatenando hilo1 y hilo2 en el centro del main y
            //luego el main sigue
            //El Run concatena, !!!! el start hace un fork !!!!, el run solo se
            //usa para ver que el método funciona.
            
            //El join hace que el hilo1 se "una" al main y se acabe de correr
            //Le da prioridad a ese hilo
            //antes de que cualquier otro siga. puedes poner un argumento en el
            //método da un tiempo máximo de prioridad al hilo
            
                /* //Es uny ejemlpo de como instanciar el hilo
                try {
                // TODO code application logic here
                Thread.sleep(1000);
                System.out.println("A- "+Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("B- "+Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("C- "+Thread.currentThread().getName());

                } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }
                */
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
