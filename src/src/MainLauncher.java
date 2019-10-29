import java.util.HashSet;
import java.util.Observer;

public class MainLauncher {

    public static void main(String[] args) {

        System.out.println("-- Debut du programme --");

        FormatFR format = new FormatFR();
        SystemUpdate system = new SystemUpdate();

        Clock fr = new Clock(system);
        fr.getUpdateClockBehavior().updateClock();
        fr.addObserver(format);

        Thread t= new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(1000); // 1 seconds
                    fr.setChanged();
                    fr.getUpdateClockBehavior().updateClock();
                    fr.notifyObservers();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //Starting anonymous thread
        t.start();
    }
}