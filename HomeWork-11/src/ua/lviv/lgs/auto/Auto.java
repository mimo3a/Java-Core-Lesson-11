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
	private Wheel wheel;	
	private Engine  engine;


	
	
	public Auto(Wheel wheel, Engine engine) {
		
		this.power = setPower();
		this.year = setYear();
		this.wheel = wheel;
		this.engine = engine;
		int diameter  = wheel.setDiameter();	    
	    String material = wheel.setMaterial();
	    int cilinders = engine.setCilinders();
	    
		
		
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
	@Override
	public String toString() {
		return "Auto [power=" + power + ", year=" + year + ", wheel=" + wheel + ", engine=" + engine + "]";
	}
	
	

}

	
	
	
	
	
	
	


