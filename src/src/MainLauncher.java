/**
 * This class is where you launch the program
 */
public class MainLauncher {

    public static void main(String[] args) {

        System.out.println("-- Debut du programme --");

        FormatFR fr = new FormatFR(10);
        FormatEN en = new FormatEN(0);
        SystemUpdate system = new SystemUpdate();

        Clock mainClock = new Clock(system);
        mainClock.getUpdateClockBehavior().updateClock();
        mainClock.addObserver(fr);
        mainClock.addObserver(en);

        Thread t= new Thread(() -> {
            while(true){
                try {
                    mainClock.setChanged();
                    mainClock.getUpdateClockBehavior().updateClock();
                    mainClock.notifyObservers();
                    Thread.sleep(1000); // 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
    }
}