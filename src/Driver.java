/**
 * @author Greg Chambers
 * @author Jacob Juby
 * @author Yin Poon
 */

import java.util.List;
import java.util.ArrayList;

/**
 * Class containing the main method that sets up the program's initial state
 * and then tells it to run.
 */
public class Driver {

  //total number of clients in the system
  final private static int totalClients = 0;
  //the number of requests each client will run
  final private static int numOfRequests = 0;
  //the number of units the banker has
  final private static int numOfUnits = 0;
  //minimum client sleep time
  final private static long minSleepMillis = 0;
  //maximum client sleep time
  final private static long maxSleepMillis = 0;

	/**
	 * The main method. Command line arguments are left unused.
	 * 
	 * @param String args
	 */
	public static void main(String[] args) {
    //banker object
    Banker banker = new Banker(numOfUnits);

    //list of clients to join on
    List<Client> clients = new ArrayList<Client>();

    //client initialization loop
    for(int i = 0; i < totalClients; i++) {
      Client t = new Client("CLIENT "+i, banker, numOfUnits, numOfRequests, minSleepMillis, maxSleepMillis);
      //start the thread 
      t.start();
      clients.add(t);
    }

    for(Client c : clients) {
      try {
        c.join();
      } catch (InterruptedException ignore) {}
    }

	} // end method main

} // end class Driver
