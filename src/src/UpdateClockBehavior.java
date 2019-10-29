public abstract class UpdateClockBehavior {

	Clock clock= null;

	public UpdateClockBehavior() {

	}

	public void updateClock() {

	}

	public UpdateClockBehavior(Clock clock) {
		this.clock = clock;
	}

	public Clock getClock() {
		return clock;
	}

	public void setClock(Clock clock) {
		this.clock = clock;
	}
}
