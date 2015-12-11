public class LibraryImpl implements Library{
	
	//Q) How do I do a mock object so it remains?

	private String libName;
	
	public LibraryImpl(String libName){
		this.libName = libName;
	}
	
	public int registerAUser(){
		return 99;
	}
	public String toString(){
		return libName;
	}
	
	public int getMaxBooksPerUser(){
		return 10;
	}
}