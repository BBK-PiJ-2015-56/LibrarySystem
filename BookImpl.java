/**
* @see
* A basic implementation of Book
*/

public class BookImpl implements Book{
	private final String author;
	private final String name;
	
	
	public BookImpl(String author , String name){
		//setAuthor(author);
		//setName(name);
		this.author = author;
		this.name = name;
	}
	/**
	* @see
	*/
	public String getAuthor(){
		return author;
	}
	
	/**
	* @see
	*/
	public String getName(){
		return name;
	}
	
	//why not allowed to be private?
	/*public void setAuthor(String author){
		this.author = author;
	}
	
	public void setName(String name){
		this.name = name;
	}*/
}

