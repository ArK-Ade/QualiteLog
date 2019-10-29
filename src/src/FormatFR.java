import java.util.Observable;
import java.util.Observer;

public class FormatFR implements Observer, Format {

	/***    Attributes      ***/
	private int hour;
	private int minute;

	/***    Constructors      ***/

	public FormatFR(){

	}

	public FormatFR(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	/***    Getters & Setters      ***/
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

	/***    Methods      ***/
	public void display(){
		System.out.println(toString());
	}

	public void update(Clock o, Object arg) {
		setHour(o.getHour());
		setMinute(o.getMinute());
		display();
	}

	@Override
	public String toString() {
		return "FormatFR{" +
				"hour=" + hour +
				", minute=" + minute +
				'}';
	}

	@Override
	public void update(Observable o, Object arg) {

	}
}