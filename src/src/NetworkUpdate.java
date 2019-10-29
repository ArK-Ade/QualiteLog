import java.time.LocalTime;

public class NetworkUpdate extends UpdateClockBehavior {

    /***    Attributes      ***/


    public NetworkUpdate(Clock clock) {
        super(clock);
    }

    /***    Methods      ***/
    @Override
    public void updateClock() {
        LocalTime time = LocalTime.now();
        clock.setHour(time.getHour());
        clock.setMinute(time.getMinute());
        clock.setSecond(time.getSecond());
    }
}
