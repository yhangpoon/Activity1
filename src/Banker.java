/**
 * @author Greg Chambers
 * @author Jacob Juby
 * @author Yin Poon
 */

import java.util.HashMap;

/**
 * A passive, non-threaded class that other threads can use to request
 * resources. Resources will only be granted if doing so will not result in an
 * unsafe state.
 */
public class Banker {
	
	private final int totalUnits; // Total number of resources
	private int availableUnits; // Number of resources Banker has
	private HashMap<Thread, ThreadLoan> threadClaims; // Registered threads with 
												   // their max claims.
	
	/**
	 * A class containing two integers representing a thread's current
	 * resource allocation amount and the amount left before reaching
	 * their max claim.
	 */
	private class ThreadLoan {
		
		private final int maxClaim;
		private int allocated;
		
		/**
		 * Creates a new ThreadLoan object with the given int parameter used
		 * for determining the maximum claim that can be made by the thread.
		 * It initially has no resources allocated to it.
		 * 
		 * @param int maxClaim
		 */
		public ThreadLoan(int maxClaim){
			this.maxClaim = maxClaim;
			this.allocated = 0;
			
		} // end constructor ThreadLoan
		
		/**
		 * Returns the value of allocated.
		 * 
		 * @return int
		 */
		public synchronized int getAllocated(){
			return this.allocated;
			
		} // end method getAllocated
		
		/**
		 * Returns the difference between the amount currently allocated and
		 * the maximum claim.
		 * 
		 * @return int
		 */
		public synchronized int getRemaining(){
			return this.maxClaim - this.allocated;
			
		} // end method getRemaining
		
		/**
		 * Sets the new amount of allocated resouces. Returns false if the
		 * new amount would be illegal. Otherwise returns true.
		 * 
		 * @param int newAllocated
		 * @return boolean
		 */
		public synchronized boolean setAllocated(int newAllocated){
			//TODO
			return true;
			
		} // end method setAllocated
		
		/**
		 * Similar to the setAllocated() method but is used for making relative
		 * changes instead of absolute changes. For example, decrementing the
		 * amount by one can be done simply by calling this method and passing
		 * it -1 as a value.
		 * 
		 * @param int delta
		 * @return boolean
		 */
		public synchronized boolean deltaAllocated(int delta){
			//TODO
			return true;
			
		} // end method deltaAllocated
		
	} // end class ThreadLoan
	
	/**
	 * Makes a new Banker object with nUnits number of reosurces and with no
	 * registered threads.
	 * 
	 * @param int nUnits
	 */
	public Banker(int nUnits){
		totalUnits = nUnits;
		availableUnits = totalUnits;
		threadClaims = new HashMap<Thread, ThreadLoan>();
		
	} // end constructor Banker
	
	/**
	 * Registers the current thread with the Banker object with a maximum claim
	 * of nUnits number of resources.
	 * 
	 * @param int nUnits
	 */
	public synchronized void setClaim(int nUnits){
		//TODO
		
	} // end method setClaim
	
	/**
	 * Represents the current thread making a request for additional resources.
	 * It returns true if the request can be granted and changes the state
	 * accordingly. If it returns false, it means it could not complete the
	 * request because that would mean moving into an unsafe state. If true is
	 * returned, then the current thread will be allocated nUnits number of
	 * additional resources.
	 * 
	 * @param int nUnits
	 * @return boolean
	 */
	public synchronized boolean request(int nUnits){
		//TODO
		return true;
		
	} // end method request
	
	/**
	 * Releases nUnits number of resources from the current thread. If a case
	 * is encountered where the release cannot be completed, such as releasing
	 * more resources than a thread actually has or if the thread has no claim
	 * to begin with, an error message will be printed to standard output and
	 * then the application shall exit with a return value of 1.
	 * 
	 * @param int nUnits
	 */
	public synchronized void release(int nUnits){
		//TODO
		
	} // end method release
	
	/**
	 * Returns the number of resources the current thread has allocated to it.
	 * 
	 * @return int
	 */
	public synchronized int allocated(){
		//TODO
		return 0;
		
	} // end method allocated
	
	/**
	 * Returns the number of resources the current thread has left before
	 * reaching the maximum claim registered for the thread.
	 * 
	 * @return int
	 */
	public synchronized int remaining(){
		//TODO
		return 0;
		
	} // end method remaining
	
} // end class Banker
