import org.junit.*;
import static org.junit.Assert.*;

public class TestBookImpl{

	Book book;
	@Before
	public void init(){
		book = new BookImpl("Stephen King" , "The Shining");
	}
	
	@Test
	public void testsGetAuthor(){
		String output = book.getAuthor();
		String expected = "Stephen King";
		assertEquals(expected , output);
	}
	
	@Test
	public void testsGetName(){
		String output = book.getName();
		String expected = "The Shining";
		assertEquals(expected , output);
	}
	
	
}