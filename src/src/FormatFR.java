import java.util.Observable;
import java.util.Observer;

public class FormatFR extends Format implements Observer{

	/***    Constructors      ***/

	/**
	 * Default constructor
	 */
	public FormatFR(){
		super();
	}

	/**
	 * Comfortable constructor
	 * @param compAnInt
	 */
	public FormatFR(int compAnInt) {
		super(compAnInt);
	}

	/***    Methods      ***/

	/**
	 * This methods permit to show the time with the french format
	 * @param clock
	 */
	public void display(Clock clock){
		System.out.println("Format FR : " + clock.getHour() + "h" +clock.getMinute());
	}

	@Override
	public void update(Observable o, Object arg) {
		setCompAnInt(getCompAnInt() + 1);
		if (o.getClass() == Clock.class && getCompAnInt() >= getCompAnIntMax()) {
			display((Clock) o);
			setCompAnInt(0);
		}
	}
}