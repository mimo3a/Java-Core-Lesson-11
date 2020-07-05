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

public class Wheel {
	/*Name of class*/
	private int diameter ;
	private String material;
	String [] materialArray = {"ALKANTARA", " LEATHER", "NINYL", " PLASTIC", " WOOD"};
	public Wheel() {	
	}
	public int getDiameter() {
		return diameter;
		
	}
	public int setDiameter() {
		diameter = new Random().nextInt(50 - 30) + 30;

		return diameter;
		
	}
	public String getMaterial() {
		return material;
	}
	public String setMaterial() {
		material =  materialArray[new Random().nextInt(materialArray.length)];
		

		return material;
	}
	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", material=" + material + "]";
	}
	
	
	

}
