import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Observable;
import java.util.Observer;

public class FormatEN implements Format, Observer {

	int compteur = 0;

	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}

	/***    Constructors      ***/

	/**
	 * Default constructor
	 */
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
		setCompteur(getCompteur()+1);
		if(o.getClass() == Clock.class && getCompteur()>=60){
			display((Clock) o);
			setCompteur(0);
		}
	}
}
