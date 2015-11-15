import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyMatrixTest {
	
MultiplyMatrix utilite = new MultiplyMatrix();
	@Test
	public void testMultiply() throws Exception {
		double first [][] = {{1,2,3,4},
							 {2,3,1,4}};
		
        double second [][] = {{5,1},
        					  {5,1},
        					  {1,3},
        					  {3,1}};
        
        double result [][] = {{15,3,12},
        					  {25,5,19}};
         assertArrayEquals(utilite.multiplyOfMatrix(first, second),result);
	}
	@Test
	public void testMultiplyNullFirstMatrix() throws Exception {
		double first [][] = null;
		
        double second [][] = {{5,1},
        					  {5,1},
        					  {1,3},
        					  {3,1}};
        
        double result [][] = null;
         assertArrayEquals(utilite.multiplyOfMatrix(first, second),result);	
	}
	@Test
	public void testMultiplyNullSecondMatrix() throws Exception {
		 double second [][] = null;
         double first [][] = {{5,1},
        					  {5,1},
        					  {1,3},
        					  {3,1}};
        
        double result [][] = null;

         assertArrayEquals(utilite.multiplyOfMatrix(first, second),result);
	}

}
