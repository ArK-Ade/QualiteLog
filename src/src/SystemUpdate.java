import java.time.LocalTime;

/**
 * This strategy represents how you take the time from the pc
 */
public class SystemUpdate extends UpdateClockBehavior {

    /***    Constructors      ***/


    /**
     * Default constructor
     */
    public SystemUpdate() {
        super();
    }

    /**
     * Comfortable constructor
     * @param clock
     */
    public SystemUpdate(Clock clock) {
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
