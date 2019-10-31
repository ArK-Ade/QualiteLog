import java.util.*;

/**
	This class represents a clock.
 */
public class Clock extends Observable {

	/*** Attributes ***/

	/**
	 * Attribute that represent the hour
	 */
	private int hour;

	/**
	 * Attribute that represent the minute
	 */
	private int minute;

	/**
	 * Attribute that represent the second
	 */
	private int second;

	/**
	 * Attribute that represent the strategy use to recover the time
	 */
	private UpdateClockBehavior updateClockBehavior;

	/***    Constructors      ***/

	public Clock() {
	}

	public Clock(UpdateClockBehavior updateClockBehavior) {
		this.updateClockBehavior = updateClockBehavior;
		updateClockBehavior.clock = this;
	}

	public Clock(int hour, int minute, int second, UpdateClockBehavior updateClockBehavior) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.updateClockBehavior = updateClockBehavior;
		updateClockBehavior.clock = this;
	}

	/***    getters & setters      ***/

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public UpdateClockBehavior getUpdateClockBehavior() {
		return updateClockBehavior;
	}

	public void setUpdateClockBehavior(UpdateClockBehavior updateClockBehavior) {
		this.updateClockBehavior = updateClockBehavior;
	}

	/***    Methods      ***/

	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		super.deleteObserver(o);
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	@Override
	public void notifyObservers(Object arg) {
		super.notifyObservers(arg);
	}

	@Override
	public synchronized void deleteObservers() {
		super.deleteObservers();
	}

	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}

	@Override
	public synchronized boolean hasChanged() {
		return super.hasChanged();
	}
}
