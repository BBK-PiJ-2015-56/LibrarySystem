// Q) when I had to change the interface for libraray,
// it meant that all these prev tests now fail. Firstly, how do I write the 
// mock object so that I don't have to change the tests once I plug in
// the real Library object? Also, how to I deal with the fact that when changing an interface, it
// means that previous tests now fail?



import org.junit.*;
import static org.junit.Assert.*;

public class TestUserImpl{
	
	User u;
	Library lib;
	@Before
	public void init(){
		u = new UserImpl("Michael Jordan");
		lib = new LibraryImpl();
	}
	@Test 
	public void testsGetName(){
		String output = u.getName();
		String expected = "Michael Jordan";
		assertEquals(expected , output);
	}
	
	@Test
	public void testsGetIdBeforeSet(){
		int output = u.getId();
		int expected = 0;
		assertEquals(expected , output);
	}
	@Test
	public void testsRegister(){
		int output = u.register(lib);
		int expected = 99;
		assertEquals(expected , output);
	}
	@Test
	public void testsGetLibraryWhenRegistered(){
		u.register(lib);
		String output = u.getLibrary();
		String expected = "Birkbeck Mock Library";
		assertEquals(expected , output);
	}
	
	@Test
	public void testsGetLibraryWhenNotRegistered(){
		String output = u.getLibrary();
		String expected = "User not registered at a library";
		assertEquals(expected , output);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}