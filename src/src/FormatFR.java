import java.util.Observable;
import java.util.Observer;

public class FormatFR implements Observer, Format {

	/***    Constructors      ***/

	public FormatFR(){

	}

	/***    Methods      ***/

	/**
	 * This methods permit to show the time with the french format
	 * @param clock
	 */
	public void display(Clock clock){
		System.out.println("Format FR :" + clock.getHour() + "heure : " +clock.getMinute()+"minutes"+clock.getSecond());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o.getClass() == Clock.class)
			display((Clock) o);
	}
}