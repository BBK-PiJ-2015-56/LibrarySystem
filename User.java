/** 
*A person with a unique name and ID number who uses the library.
*/

public interface User{
	/**
	* Returns the name of the user
	* @return     the unique name belonging to the user
	*/
	public String getName();
	
	/**
	* Returns the Id number of the user
	* @return     the unique Id number belonging to the user
	*/
	public int getId();
	
	
	/**
	* Registers the user to the given library by returning user's new Id number
	* @return     the unique Id number belonging to the user
	*/
	public int register(Library lib);
	
	/**
	* Returns the name of the library that the user is registered to
	* @return     the name of the library the user is registered to
	*/
	public String getLibrary();
}