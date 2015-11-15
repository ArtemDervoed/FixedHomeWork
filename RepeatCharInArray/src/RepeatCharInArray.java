
public class RepeatCharInArray {
	
	public static boolean searchRepeatElementsInArray(String[]array){
		if(array.length==0)
			return false;
		boolean check = false; 
		for(int i = 0; i < array.length;i++){
			for(int j = i+1; j < array.length;j++){
				if(array[i]==array[j]){
					check = true;
					break;
				}
			}
			break;
		}
		return check;
	}
	
	public static boolean TestFunc(String[] testArr, boolean test){
		if(searchRepeatElementsInArray(testArr)==test) return true;
			else return false;
			
		}
	}
