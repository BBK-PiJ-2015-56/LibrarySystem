public class Library{
	// is it ok to call it this? 
	// How do we then later distinguish between this and the real library?
	private int Id;
	private String name = "Birkbeck Mock Library";
	
	public int getId(){
		return Id;
	}
	public void register(){
		Id = 99;
	}
	public String toString(){
		return name;
	}
}