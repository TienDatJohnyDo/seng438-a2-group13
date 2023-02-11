package org.jfree.data.test;
import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.Test;
import org.junit.*;

//Assignment 2
//Alphabetical Order of test methods as well as in the source code
//equals (Object) method 
//getCentralValue() method
//getlength() method 
//getLowerBound() method 
//getUpperBound() method 
//tostring() method 
//Class for Range Test
public class RangeTest{
	
	//equals() Range vairables 
    private Range myRangeOne;
    private Range myRangeTwo;
    private Range myRangeThree;
    private Range myRangeFour;
    private Range myRangeFive;
    private Range myRangeSix;
	
	
	//Assignment 2 getCentralValue() example variable
	private Range exampleRangeLab; 
	
	//get Length Range variables
	private Range exampleRange;
	private Range exampleRange1; 
	private Range exampleRange2; 
	private Range exampleRange3; 
	private Range exampleRange4; 
	
	//getLowerBound() Range variables
	private Range LowerRange; 
	private Range LowerRange2;
	private Range LowerRange3; 
	private Range LowerRange4; 
	private Range LowerRange5; 
	//private Range LowerRange6; 
	
	//getUpperBound()/Equals/toString Range variables
	 private Range myRange;
	 private Range myRange2;
	 private Range myRange3;
     private Range myRange4;
     private Range myRange5;
	 private Range myRange6;
	
	
	
	@BeforeClass public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception{ 
		
		//equals() Range initialization 
    	myRangeOne = new Range(-15.0, 10.0);
    	myRangeTwo = new Range(-5.0, -2.0);
    	myRangeThree = new Range(10.0, 15.0);
    	myRangeFour = new Range(0.0, 0.0);
    	myRangeFive = new Range(0.0, 15.0);
    	myRangeSix = new Range(-15.0, 0.0);
		
	
		//Assignment 2 get CentralValue() example variable initialization 
		exampleRangeLab = new Range(-1,1);
		
		//getLength() Range initialization 
		exampleRange = new Range(-5,10);// negative - positive
		exampleRange1 = new Range(-10,-5); //negative- negative 
		exampleRange2 = new Range(0,10); //0-positive
		exampleRange3 = new Range(2,10); //Positive-positive
		exampleRange4 = new Range(0,0); //0 -0 
		
		//getLowerBound () Range initialization 
		LowerRange = new Range(-5,10); // Negative-positive
		LowerRange2 = new Range(0,10); // 0-positive
		LowerRange3 = new Range(2,10); // Positive - positive
		LowerRange4 = new Range (-10,-5); // Negative-Negative
		LowerRange5 = new Range(0,0); //0-0
		//LowerRange6 = new Range (-5,-10); //Opposite value (Test should fail)
		
		//getUpperBound()/Equals/toString Range variables initialization
		myRange = new Range(-15.0, 100.0);
    	myRange2 = new Range(-5.0, -2.0);
    	myRange3 = new Range(10.0, 15.0);
    	myRange4 = new Range(0.0, 0.0);
    	myRange5 = new Range(0.0, 15.0);
    	myRange6 = new Range(-15.0, 0.0);
		
		
	}
	//equals() method Test Cases 
	
    @Test
   // this test case tests equivalent class for
   // the lower bound being negative integer and upper bound being positive integer
   public void equalsOneTest() {
       assertEquals("The output should be true",
       true, myRange.equals(myRangeOne));
   }
   
   @Test
   // this test case tests equivalent class for
   // the lower bound being negative integer and upper bound being negative integer
   public void equalsTwoTest() {
       assertEquals("The output should be true",
       true, myRange2.equals(myRangeTwo));
   }
   
   @Test
// this test case tests equivalent class for
   // the lower bound being positive integer and upper bound being positive integer
   public void equalsThreeTest() {
       assertEquals("The output should be true",
       true, myRange3.equals(myRangeThree));
   }
   
   @Test
   // this test case tests equivalent class for
   // upper and lower bound being the same number
   public void equalsFourTest() {
       assertEquals("The output should be true",
       true, myRange4.equals(myRangeFour));
   }
   
   @Test
   // this test case tests equivalent class for
   // lower bound being 0 and upper bound being positive
   public void equalsFiveTest() {
       assertEquals("The output should be true",
       true, myRange5.equals(myRangeFive));
   }
   
   @Test
   // this test case tests equivalent class for
   // lower bound being a negative number and upper bound 0
   public void equalsSixTest() {
       assertEquals("The output should be true",
       true, myRange6.equals(myRangeSix));
   }
   @Test
   // this test case tests equivalent class for
   // object calls equal on itself
   public void equalsSevenTest() {
       assertEquals("The output should be true",
       true, myRange6.equals(myRange6));
   }
   
   // this test should be false because the two ranges do not equal each other
   @Test
   public void equalsFailTest() {
       assertEquals("The output should be false",
       false, myRange.equals(myRangeFour));
   }

	//centralValueShouldBeZero()- This test case is from the assignment 2 lab hand-out
	@Test
	public void centralValueShouldBeZero() {
		assertEquals("The central value of -1 and 1 should be 0",0, exampleRangeLab.getCentralValue(),.000000001d);
	}
	
	//getLength Method() Test Cases
	@Test
	public void correctLengthShouldBeFifthteen() {
		//assertion arguments are [message], [expected], [actual], [delta]
		//This method works correctly compared with Oracle to get length we do (maximum - minimum)
		assertEquals("The length of the range -5 and 10 is 15",15, exampleRange.getLength(),.000000001d);
	}
	
	//This test should fail
//	@Test
//	public void failLowerBoundShouldBeTen() {
//		//assertion arguments are [message], [expected], [actual], [delta]
//		//This method works incorrectly compared with Oracle to get the upper bound 10 in a range of -5,10 when it should be -5
//		assertEquals("The length of the range -5 to 10 is 5",5, exampleRange.getLength(),.000000001d);
//		//Ask Stuart
//	}
	@Test
	public void rangeShouldBeFive() {
		//assertion arguments are [message], [expected], [actual], [delta]
		//This method works correctly compared with Oracle to get length we do (maximum - minimum)
		assertEquals("The length of the range -10 and -5 is 5",5, exampleRange1.getLength(),.000000001d);
	}
	@Test
	public void rangeShouldBeTen() {
		//assertion arguments are [message], [expected], [actual], [delta]
		//This method works correctly compared with Oracle to get length we do (maximum - minimum)
		assertEquals("The length of the range 0 and 10 is 10",10, exampleRange2.getLength(),.000000001d);
	}
	@Test
	public void rangeShouldBeEight() {
		//assertion arguments are [message], [expected], [actual], [delta]
		//This method works correctly compared with Oracle to get length we do (maximum - minimum)
		assertEquals("The length of the range 2 and 10 is 8",8, exampleRange3.getLength(),.000000001d);
	}
	@Test
	public void rangeShouldBeZero() {
		//assertion arguments are [message], [expected], [actual], [delta]
		//This method works correctly compared with Oracle to get length we do (maximum - minimum)
		assertEquals("The length of the range 0 and 0 is 0",0, exampleRange4.getLength(),.000000001d);
	}
	
	//getLowerBound() Method Test Cases
	
	//Test #1 : This test is correct
		@Test
		public void lowerBoundShouldBeMinusFive() {
			//assertion arguments are [message], [expected], [actual], [delta]
			//This method works correctly compared with Oracle to get the lower bound of -5 in a range of -5,10
			assertEquals("The lower bound of the range -5 and 10 should be -5",-5, LowerRange.getLowerBound(),.000000001d);
		}
		

		//Test 2 : This test is correct 
		@Test
		public void lowerBoundShouldBeZero() {
			//assertion arguments are [message], [expected], [actual], [delta]
			//This method works correctly compared with Oracle to get the lower bound of 0 in a range of 0,10
			assertEquals("The lower bound of the range 0 and 10 should be 0",0, LowerRange2.getLowerBound(),.000000001d);
		}
		@Test
		public void lowerBoundShouldBeTwo() {
			//assertion arguments are [message], [expected], [actual], [delta]
			//This method works correctly compared with Oracle to get the lower bound of 2 in a range of 2,10
			assertEquals("The lower bound of the range 2 and 10 should be 2",2, LowerRange3.getLowerBound(),.000000001d);
		}
		@Test
		public void lowerBoundShouldBeMinusTen() {
			//assertion arguments are [message], [expected], [actual], [delta]
			//This method works correctly compared with Oracle to get the lower bound of 2 in a range of 2,10
			assertEquals("The lower bound of the range -10 and -5 should be -5",-10, LowerRange4.getLowerBound(),.000000001d);
		}

		@Test 
		public void lowerBoundShouldBeZeroZero() {
			//assertion arguments are [message], [expected], [actual], [delta]
			//This method works correctly compared with Oracle to get the lower bound of 0 in a range of 0,0
			assertEquals("The lower bound of the range 0 and 0 should be 0",0, LowerRange5.getLowerBound(),.000000001d);
		}
		//Opposite Value lower bound and upper bound are switch (Fail test case)
//		@Test
//		public void FaillowerBoundShouldBeMinusTen() {
//			//assertion arguments are [message], [expected], [actual], [delta]
//			//This method works correctly compared with Oracle to get the lower bound of -10 in a range of -5,-10
//			assertEquals("The lower bound of the range -5 and -10 should be -5",-5, LowerRange6.getLowerBound(),.000000001d);
//		}
		
		//getUpperBound() method Test Cases
		// this method FAILS
	    // returns lower bound instead
	    @Test
	    // this test case tests equivalent class for
	    // the lower bound being negative number and upper bound being positive number
	    public void getUpperBoundOne() {
	        assertEquals("The upper bound value of Range [-15, 100] should be 100",
	        100.0, myRange.getUpperBound(), .000000001d);
	    }
	    
	    @Test
	    // this test case tests equivalent class for
	    // the lower bound being negative number and upper bound being negative number
	    public void getUpperBoundTwo() {
	        assertEquals("The upper bound value of Range [-5, -2] should be -2",
	        -2.0, myRange2.getUpperBound(), .000000001d);
	    }
	    

	    @Test
	    // this test case tests equivalent class for
	    // the lower bound being positive number and upper bound being positive number
	    public void getUpperBoundThree() {
	        assertEquals("The upper bound value of Range [10, 15] should be 15",
	        15.0, myRange3.getUpperBound(), .000000001d);
	    }
	    
	    @Test
	    // this test case tests equivalent class for
	    // upper and lower bound being the same number
	    public void getUpperBoundFour() {
	        assertEquals("The upper bound value of Range [0, 0] should be 0",
	        0.0, myRange4.getUpperBound(), .000000001d);
	    }
	    
	    @Test
	    // this test case tests equivalent class for
	    // lower bound being 0 and upper bound being positive
	    public void getUpperBoundFive() {
	        assertEquals("The upper bound value of Range [0, 15] should be 15",
	        15.0, myRange5.getUpperBound(), .000000001d);
	    }
	    
	    @Test
	    // this test case tests equivalent class for
	    // lower bound being a negative number and upper bound 0
	    public void getUpperBoundSix() {
	        assertEquals("The upper bound value of Range [-15, 0] should be 0",
	        0.0, myRange6.getUpperBound(), .000000001d);
	    }
	    
	    //toString() Method test Cases 
	 // this method FAILS
	    // format is really strange/off
	    // lower bound values are also different 
	    
	    @Test
	    // this test case tests equivalent class for
	    // the lower bound being negative integer and upper bound being positive integer
	    public void toStringOne() {
	    	
	        assertEquals("The string should output 'Range[-15.0,10.0]'",
	        	"Range[-15.0,10.0]", myRange.toString());
	    }
	    
	    @Test
	    // this test case tests equivalent class for
	    // the lower bound being negative integer and upper bound being negative integer
	    public void toStringTwo() {
	    	
	        assertEquals("The string should output 'Range[-5.0,-2.0]'",
	        	"Range[-5.0,-2.0]", myRange2.toString());
	    }
	    
	    @Test
	    // this test case tests equivalent class for
	    // the lower bound being positive integer and upper bound being positive integer
	    public void toStringThree() {
	    	
	        assertEquals("The string should output 'Range[10.0,15.0]'",
	        	"Range[10.0,15.0]", myRange3.toString());
	    }
	    @Test
	    // this test case tests equivalent class for
	    // upper and lower bound being the same number
	    public void toStringFour() {
	    	
	        assertEquals("The string should output 'Range[0.0,0.0]'",
	        	"Range[0.0,0.0]", myRange4.toString());
	    }
	    
	    @Test

	    // this test case tests equivalent class for
	    // lower bound being 0 and upper bound being positive
	    public void toStringFive() {
	    	
	        assertEquals("The string should output 'Range[0.0,15.0]'",
	        	"Range[0.0,15.0]", myRange5.toString());
	    }
	    
	    @Test
	    // this test case tests equivalent class for
	    // lower bound being a negative number and upper bound 0
	    public void toStringSix() {
	    	
	        assertEquals("The string should output 'Range[-15.0,0.0]'",
	        	"Range[-15.0,0.0]", myRange6.toString());
	    }
	
	
	@After
	public void tearDown() throws Exception{
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}

}
