import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;
import org.junit.Test;

public class ArrayCollision {
	
	public static double[] searchCollisionArrays(double []first, double[]second ){
		
		if(first == null || second == null){
            return new double[0];
        }
		double[] collison;
		if(first.length > second.length){
			collison = new double[first.length];
		}
		else{
			 collison = new double[first.length];	
		}
        int counter = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    collison[counter] = first[i];
                    counter++;
                }
            }
        }	
        return Arrays.copyOf(collison, counter);
	}
	
	
	//тесты
	public boolean testWithAnyData() {
        double first [] = {1,2,3,4,0,20.2233};
        double second [] = {5,20.2234};
        double result [] = {1,2,0};
        if(searchCollisionArrays(first, second) == result) return true;
        else return false;
	}
	
	public boolean testWithFirstEmptyArray() {
        double first [] = {};
        double second [] = {5,1,2,0,20.2234};
        double result [] = {1,2,0};
        if(searchCollisionArrays(first, second) == result) return true;
        else return false;
	}
	
	public boolean testWithNullArr() {
        double first [] = null;
        double second [] = {5,1,2,0,20.2234};
        double result [] = {1,2,0};
        if(searchCollisionArrays(first, second) == result) return true;
        else return false;
		}
	
	public boolean testWithNormalData() {
        double first [] = {1,2,3,4,0,20.2233};
        double second [] = {5,1,2,0,20.2234};
        double result [] = {1,2,0};
        if(searchCollisionArrays(first, second) == result) return true;
        else return false;
	}
}
	
	