import java.time.LocalTime;

public class SystemUpdate implements updateClockBehavior {

    /***    Attributes      ***/
    private Clock clock;


    /***    Methods      ***/
    @Override
    public void updateClock() {
        LocalTime time = LocalTime.now();
        clock.setHour(time.getHour());
        clock.setMinute(time.getMinute());
        clock.setSecond(time.getSecond());
    }
}
