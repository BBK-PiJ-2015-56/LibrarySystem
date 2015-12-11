import org.junit.*;
import static org.junit.Assert.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestUserImpl{
	
	User u;
	@Before
	public void init(){
		u = new UserImpl("Michael Jordan");
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
		Library lib = new Library();
		int output = u.register(lib);
		int expected = 99;
		assertEquals(expected , output);
	}
	@Test
	public void testsGetLibraryWhenRegistered(){
		Library lib = new Library();
		u.register(lib);
		String output = u.getLibrary();
		String expected = "Birkbeck Mock Library";
		assertEquals(expected , output);
	}
	
	@Test
	public void testsGetLibraryWhenNotRegistered(){
		Library lib = new Library();
		String output = u.getLibrary();
		String expected = "User not registered at a library";
		assertEquals(expected , output);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}