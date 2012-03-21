/**
 * @author Greg Chambers
 * @author Jacob Juby
 * @author Yin Poon
 */

import java.lang.*;
import java.util.*;

/**
 * A threadable class that uses resources allocated to it by the Banker class.
 */
public class Client extends Thread {

	private Banker banker; // The banker
	private long minSleepMillis; // Minimum sleep period
	private long maxSleepMillis; // Maximum sleep period
	private int nUnits; // Amount of Resouce to Claim
	private int nRequests; // Number of Requests
	
	/**
	 * Creates a new Client object, ready to run as a seperate thread.
	 */
	public Client(String name, Banker banker, int nUnits, int nRequests, 
			long minSleepMillis, long maxSleepMillis){
		super.setName(name);
		this.banker = banker;
		this.minSleepMillis = minSleepMillis;
		this.maxSleepMillis = maxSleepMillis;
		this.nUnits = nUnits;
		this.nRequests = nRequests;
	} // end constructor Client
	
	/**
	 * Begins execution of the thread.
	 */
	public void run(){
		banker.setClaim(nUnits);
		int counter = 0;
		while(counter < nRequests) {
			if(banker.remaining()==0) {
				bank.release(nUnits);
			}
			else {
				bank.request(nUnits);
				Thread.sleep(generate(minSleepMillis, maxSleepMillis));
			}
		}
		banker.release(nUnits);
		return;
	} // end method run
	
	/**
	 * Generate Random Sleep Time in a Specific Range
	 */
	private long generate(long min, long, max) {
		if(min>max) {
			throw new IllegalArgumentException("Min cannot exceed Max");
		}
		Random random = new Random();
		long result;
		while(true) {
			result = random.nextLong(max);
			if(result>=min)
				return result;
		}
	}
	
} // end class Client
