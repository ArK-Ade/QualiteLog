import java.util.Observable;
import java.util.Observer;

public class FormatEN implements Format, Observer {

    /***    Atributes      ***/
	private int hour;

	private int minute;

	private int second;

    /***    Constructors      ***/

	public FormatEN(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;

	}

	public FormatEN(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
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

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}


    /***    Methods      ***/

	public void display(){
		System.out.println(toString());
	}

	@Override
	public void update(Observable o, Object arg) {
		setHour(((Clock) arg).getHour());
		setMinute(((Clock) arg).getMinute());
		setSecond(((Clock) arg).getSecond());
		display();
	}

	@Override
	public String toString() {
		return "FormatEN{" +
				"hour=" + hour +
				", minute=" + minute +
				", second=" + second +
				'}';
	}
}
