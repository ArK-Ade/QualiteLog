import java.time.LocalTime;

/**
 * This strategy represents how you take the time from a distant server
 */
public class NetworkUpdate extends UpdateClockBehavior {

    /***    Constructors      ***/

    /**
     * Default constructor
     */
    public NetworkUpdate() {
    }

    /**
     * Comfortable constructor
     * @param clock
     */
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
