public abstract class Format {

	/*** Attributes ***/

	/**
	 * Represent the number of time the display will appear
	 */
	private int compAnIntMax = 0;

	/**
	 * Represent the actual count
	 */
	private int compAnInt = 0;

	/***    Constructors      ***/

	/**
	 * Default constructor
	 */
	public Format() {
	}

	/**
	 * Comfortable constructor
	 * @param compAnIntMax
	 */
	public Format(int compAnIntMax) {
		this.compAnIntMax = compAnIntMax;
	}

	/***    getters & setters      ***/

	public int getCompAnInt() {
		return compAnInt;
	}

	public void setCompAnInt(int compAnInt) {
		this.compAnInt = compAnInt;
	}

	public int getCompAnIntMax() {
		return compAnIntMax;
	}

	public void setCompAnIntMax(int compAnIntMax) {
		this.compAnIntMax = compAnIntMax;
	}

	/***    Methods      ***/

	/**
	 * Methods that define the manner to show the time
	 * @param o
	 */
	void display(Clock o) {
	}
}
