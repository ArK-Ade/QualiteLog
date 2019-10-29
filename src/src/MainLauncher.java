import java.util.HashSet;
import java.util.Observer;

/**
 * This class is where you launch the program
 */
public class MainLauncher {

    public static void main(String[] args) {

        System.out.println("-- Debut du programme --");

        FormatFR format = new FormatFR();
        FormatEN format2 = new FormatEN();
        SystemUpdate system = new SystemUpdate();

        Clock fr = new Clock(system);
        fr.getUpdateClockBehavior().updateClock();
        fr.addObserver(format);
        fr.addObserver(format2);

        Thread t= new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(1000); // 1 second
                    System.out.print("[thread 1] | ");
                    fr.setChanged();
                    fr.getUpdateClockBehavior().updateClock();
                    fr.notifyObservers();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

//        Thread t2= new Thread(() -> {
//            while(true){
//                try {
//                    Thread.sleep(1000); // 1 second
//
//                    System.out.print("[thread 2] | ");
//                    fr.setChanged();
//                    fr.getUpdateClockBehavior().updateClock();
//                    fr.notifyObservers();
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });

        //Starting anonymous thread
        t.start();
//        t2.start();
    }
}