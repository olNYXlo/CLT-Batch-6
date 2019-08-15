package TestCases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import junit.framework.TestCase;




public class LoginTest extends TestCase{
	
	
	public class Account{
		String UserID;
		String pw;
		public String getUserID() {
			return UserID;
		}
		public void setUserID(String userID) {
			UserID = userID;
		}
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}
		
		
	}
	
	private Account Ac;
	
	
	
	@BeforeClass
	// code only executed once before all test methods.
	// used to prepare testing environment like initializing resources (opening DB connection)
	// MUST BE STATIC
	public static void setUpClass() {
        // code executed before all test methods
    }
     
    @Before
    // code executed before every test method. Typically put repeated code that must be
    // executed before each test method
    @Override
    public void setUp() throws SQLException {
    	
    	Account A = new Account();
    	
    	Connection con = TestDBConnection.myConnection();
    	PreparedStatement ps;
        // code executed before each test method
		ps = con.prepareStatement("SELECT pw,UserID FROM Account LIMIT 1"); // Create statement using SQL connection


		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) { // have to include this line when processing result set else will not be able to access rs.getString or anything not sure why
			String UserID = rs.getString("UserID");
			String pw = rs.getString("pw");
			A.setPw(pw);
			A.setUserID(UserID);
			Ac = A;
			}

    }
    
    @Test
	// test method to test the functionality
	public void testDBConnection() {
    	assertNotNull("Testing DB Connection", TestDBConnection.myConnection());
	}
    
	@Test
	// test method to test the functionality
	public void testUIDExists() {
		assertEquals("Testing if UID matches","amos@gmail.com", Ac.getUserID());
	}
	
	
	@Test
	// test method to test the functionality
	public void testWrongPw() {
		assertTrue("Testing if password does not match",(!Ac.getPw().equalsIgnoreCase("hello")));
		
	}
     

     
    @After
    // code executed after every test method
    // put repeated code that must be executed after each test method
    public void tearDown() {
        // code executed after each test method
    }
     
    @AfterClass
    // executed only once after all test methods are done
    // usually code to clean up test environment
    // closing DB connection
    // implement only if necessary
    public static void tearDownClass() {
        // code executed after all test methods
    }




}
