
public class MyDate {

	// Initialize time variables
	int day, month, year;
	
	// Default Empty Constructor
	public MyDate() {
		
	}
	
	// Constructor with arguments
	public MyDate(int m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	// toString method will return the date in mm/dd/yyyy format
	public String toString() {
		return this.month + "/" + this.day + "/" + this.year;
	}
	
	// setDate method will set the date of the MyDate Object
	public void setDate(int m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
}
