import java.util.Observable;
import java.util.Observer;

public class FormatFR implements Observer, Format {

	/***    Constructors      ***/

	public FormatFR(){

	}

	/***    Methods      ***/
	public void display(Clock o){
		System.out.println("Format FR :" + + o.getHour() + "heure : " +o.getMinute()+"minutes"+o.getSecond());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o.getClass() == Clock.class)
			display((Clock) o);
	}
}