/**
* A place that registers users, loans books to the users
* up to a maximum number for each user
*/

public interface Library{
	
	
	public int registerAUser();
	
	/**
	* a method for getting the maximum number of books allowed out 
	* on loan by any one user.
	*/
	public int getMaxBooksPerUser();
}