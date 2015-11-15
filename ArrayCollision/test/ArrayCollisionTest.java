import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayCollisionTest {
ArrayCollision utilite = new ArrayCollision();
	@Test
	public void testWithAnyData() throws Exception {
        double eps = 0.00001;
        double first [] = {1,2,3,4,0,20.2233};
        double second [] = {5,1,2,0,20.2234};
        double result [] = {1,2,0};
        assertArrayEquals(result,utilite.searchCollisionArrays(first, second),eps);
	}
	@Test
	public void testWithoutDataCollision() throws Exception {
        double eps = 0.00001;
        double first [] = {1,2,3,4,0,20.2233};
        double second [] = {5,5,20.2234};
        double result [] = {};
        assertArrayEquals(result,utilite.searchCollisionArrays(first, second),eps);
	}
	
	@Test
	public void testWithFirstEmptyArray() throws Exception {
        double eps = 0.00001;
        double first [] = {};
        double second [] = {5,1,2,0,20.2234};
        double result [] = {};
        assertArrayEquals(result,utilite.searchCollisionArrays(first, second),eps);
	}
	@Test
	public void testWithSecondEmptyArray() throws Exception {
        double eps = 0.00001;
        double first [] = {1,2,3,4,0,20.2233};
        double second [] = {};
        double result [] = {};
        assertArrayEquals(result,utilite.searchCollisionArrays(first, second),eps);
	}
	@Test
	public void testWithSecondNullArray() throws Exception {
        double eps = 0.00001;
        double first [] = {1,2,3,4,0,20.2233};
        double second [] = null;
        double result [] = {};
        assertArrayEquals(result,utilite.searchCollisionArrays(first, second),eps);
	}
	@Test
	public void testWithFirstNullArray() throws Exception {
        double eps = 0.00001;
        double first [] = null;
        double second [] = {1,2,3,4,0,20.2233};
        double result [] = {};
        assertArrayEquals(result,utilite.searchCollisionArrays(first, second),eps);
	}


}
