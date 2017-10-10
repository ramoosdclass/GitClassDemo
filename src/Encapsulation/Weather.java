package Encapsulation;

import java.util.Date;

public class Weather {
	
	private String city;
	private String state;
	private int low;
	private int high;
	private Date dateOfBirth;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		if (low > 32) {
			this.low = low;
		}
		else {
			System.out.println("People would freeze below 32");
		}
	}
	
	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		if (high < 180) {
			this.high = high;
		}
		else {
			System.out.println("People would burn at a temp higher than 180");
		}
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}	
	

}
