package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void remove() {
		Reporter.log("remove method executed........",true);
	}
	
	@Test
	public void add() {
		Reporter.log("add method executed....",true);
	}
	
	@Test
	public void delete() {
		Reporter.log("delete method executed....",true);
	}
	
}
