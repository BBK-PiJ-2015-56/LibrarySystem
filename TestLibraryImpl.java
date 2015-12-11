import org.junit.*;
import static org.junit.Assert.*;

public class TestLibraryImpl{
	Library lib;
	User u;
	
	@Before
	public void setUp(){
		lib = new LibraryImpl("Birkbeck Library");
		u = new UserImpl("Michael Jordan");
	}
	
	
	@Test
	public void testsGetMaxBooksPerUserWhenNotSet(){
		int output = lib.getMaxBooksPerUser();
		int expected = 5;
		assertEquals(expected , output);
	}
	
	
	
	
}