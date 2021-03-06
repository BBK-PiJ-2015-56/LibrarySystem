public class UserImpl implements User{
	private final String name; //name of User
	private int Id;   //Id of user
	private String nameOfLibrary;
	
	public UserImpl(String name){
		this.name = name;
	}
	
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return Id;
	}
	public int register(Library lib){
		Id = lib.registerAUser(name);
		nameOfLibrary = lib.toString();
		return Id;
	}
	public String getLibrary(){
		if(nameOfLibrary == null){
			return "User not registered at a library";
		}
		return nameOfLibrary;
	}
	
}