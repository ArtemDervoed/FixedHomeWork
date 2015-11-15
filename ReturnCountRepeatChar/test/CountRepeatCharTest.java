import static org.junit.Assert.*;

import org.junit.Test;

public class CountRepeatCharTest {
CountRepeatChar crc = new CountRepeatChar();
	@Test
		 public void testCountSymbols() throws Exception {
	            String myString = "aaaaaa";
	            char myChar = 'a';
	            int count = 6;
	         assertEquals(count,crc.countChar(myString,myChar));
	  	 }
	@Test
	 public void testCountSymbolsWithOtherData() throws Exception {
           String myString = "aspiriiine";
           char myChar = 'i';
           int count = 4;
        assertEquals(count,crc.countChar(myString,myChar));
 	 }

	@Test
	 public void testCountSymbolsWithEmptyString() throws Exception {
           String myString = "";
           char myChar = 'a';
           int count = 0;
        assertEquals(count,crc.countChar(myString,myChar));
       
 	 }
	@Test
	 public void testCountSymbolsWithEmptyChar() throws Exception {
           String myString = "aaaaaa";
           char myChar = ' ';
           int count = 0;
        assertEquals(count,crc.countChar(myString,myChar));
        
 	 }
}
