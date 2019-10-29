import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Observable;
import java.util.Observer;

public class FormatEN implements Format, Observer {

    /***    Constructors      ***/

	public FormatEN(){
	}

    /***    Methods      ***/

	public void display(Clock o){
		if(o.getHour() <= 12)
			System.out.println(o.getHour() +"AM" + o.getMinute());
		else
			System.out.println(o.getHour() +"PM" + o.getMinute());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o.getClass() == Clock.class)
			display((Clock) o);
	}
}
