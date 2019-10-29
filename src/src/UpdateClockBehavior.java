/**
 * This abstract class represents the strategy that you want to use for
 * updating your clock
 */
public abstract class UpdateClockBehavior {

	/***    Attributes      ***/

	Clock clock= null;

	/***    Constructors      ***/

	/**
	 * Default constructor
	 */
	public UpdateClockBehavior() {

	}

	/**
	 * Comfortable constructor
	 * @param clock
	 */
	public UpdateClockBehavior(Clock clock) {
		this.clock = clock;
	}

	/***    getters & setters      ***/
	public Clock getClock() {
		return clock;
	}

	public void setClock(Clock clock) {
		this.clock = clock;
	}

	/***      Methods         ***/

	/**
	 * Function that will change in term of time format
	 */
	public void updateClock() {

	}
}
