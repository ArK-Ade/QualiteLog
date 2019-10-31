import java.util.Observable;
import java.util.Observer;

public class FormatEN extends Format implements Observer {

	/***    Constructors      ***/

	/**
	 * Default constructor
	 */
	public FormatEN(){
		super();
	}

	/**
	 * Comfortable constructor
	 * @param compAnInt
	 */
	public FormatEN(int compAnInt) {
		super(compAnInt);
	}

	/***    Methods      ***/

	/**
	 * This methods permit to show the time with the english format
	 * @param clock
	 */
	public void display(Clock clock){
		if(clock.getHour() <= 12)
			System.out.println("Format EN : " + clock.getHour() +" am:" + clock.getMinute() + " " + clock.getSecond());
		else
			System.out.println("Format EN : " + clock.getHour() +" pm:" + clock.getMinute() + " " + clock.getSecond());
	}

	@Override
	public void update(Observable o, Object arg) {
		setCompAnInt(getCompAnInt() + 1);
		if(o.getClass() == Clock.class && getCompAnInt() >= getCompAnIntMax()){
			display((Clock) o);
			setCompAnInt(0);
		}
	}
}
