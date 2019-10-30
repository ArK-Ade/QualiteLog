/**
 * This class is where you launch the program
 */
public class MainLauncher {

    public static void main(String[] args) {

        System.out.println("-- Debut du programme --");

        FormatFR fr = new FormatFR();
        FormatEN en = new FormatEN();
        SystemUpdate system = new SystemUpdate();

        Clock mainClock = new Clock(system);
        mainClock.getUpdateClockBehavior().updateClock();
        mainClock.addObserver(fr);
        mainClock.addObserver(en);

        Thread t= new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(1000); // 1 second
                    System.out.println("[thread 1] | ");
                    mainClock.setChanged();
                    mainClock.getUpdateClockBehavior().updateClock();
                    mainClock.notifyObservers();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();

    }
}