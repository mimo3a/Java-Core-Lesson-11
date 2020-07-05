/* LOGOS academy*/

package ua.lviv.lgs.auto;

/***
 * @since java 1.8
 * @author mimo3a
 * @version 1.1
 * 
 * 
 */

import java.util.Random;

public class Auto{
	/*Name of class*/
	private int power;
	private int year;
	private int myDiameter;
	private String myMaterial;
	private int myCilinders;

	
	
	public Auto() {
		
		this.power = setPower();
		this.year = setYear();
		Wheel w1 = new Wheel();
	    myDiameter = w1.setDiameter();
	    myMaterial = w1.setMaterial();
	    Engine e1 = new Engine();
	    myCilinders = e1.setCilinders();
		
		
	}
	public double getPower() {
		return power;
	}
	public int setPower() {
		power = new Random().nextInt(300 - 50) + 50;
		return power;
	}
	public int getYear() {
		return year;
	}
	public int setYear() {
		year = new Random().nextInt(2020 - 1980) + 1980;
		return year;
	}
	public int getMyDiameter() {
		
		return myDiameter;
	}
	public String getMyMaterial() {
		return myMaterial;
	}
	public int getMyCilinders() {
		return myCilinders;
	}
	@Override
	public String toString() {
		return "Auto [power=" + power + ", year=" + year + ", myDiameter=" + myDiameter + ", myMaterial=" + myMaterial
				+ ", myCilinders=" + myCilinders + "]";
	}
	
	
	
	
	

}
