/* LOGOS academy*/

package ua.lviv.lgs.auto;

import java.util.Arrays;

/***
 * @since java 1.8
 * @author mimo3a
 * @version 1.1
 * 
 * 
 */

import java.util.Random;

public class Engine {
	/*Name of class*/
	private int cilinders;
	int [] cilindersArray = {2,3,4,6,8};
	

	public Engine() {
	}

	public int getCilinders() {
		return cilinders;
	}

	public int setCilinders() {
		cilinders = cilindersArray[new Random().nextInt(cilindersArray.length)];
		return cilinders;
	}

	@Override
	public String toString() {
		return "Engine [cilinders=" + cilinders  + "]";
	}
	
	
	

}
