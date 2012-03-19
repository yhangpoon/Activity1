/**
 * @author Greg Chambers
 * @author Jacob Juby
 * @author Yin Poon
 */

/**
 * A passive, non-threaded class that other threads can use to request
 * resources. Resources will only be granted if doing so will not result in an
 * unsafe state.
 */
public class Banker {
	
	/**
	 * Makes a new Banker object with nUnits number of reosurces and with no
	 * registered threads.
	 * 
	 * @param int nUnits
	 */
	public Banker(int nUnits){
		//TODO
		
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
