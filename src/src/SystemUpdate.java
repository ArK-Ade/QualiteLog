import java.time.LocalTime;

public class SystemUpdate extends UpdateClockBehavior {

    /***    Attributes      ***/

    public SystemUpdate(Clock clock) {
        super(clock);
    }

    public SystemUpdate() {
        super();
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
