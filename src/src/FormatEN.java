import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Observable;
import java.util.Observer;

//TODO faire en sorte que le format EN soit notifier toutes les minutes
public class FormatEN implements Format, Observer {

    /***    Constructors      ***/

	public FormatEN(){
	}

    /***    Methods      ***/

	/**
	 * This methods permit to show the time with the english format
	 * @param clock
	 */
	public void display(Clock clock){
		if(clock.getHour() <= 12)
			System.out.println("Format EN :" + clock.getHour() +" AM " + clock.getMinute());
		else
			System.out.println("Format EN :" + clock.getHour() +" PM " + clock.getMinute());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o.getClass() == Clock.class)
			display((Clock) o);
	}
}
