
public class CountRepeatChar {

	public static int countChar(String stroka, char controlChar){
		if((stroka!=null)||(stroka.length() != 0)){
			if(controlChar == ' '){
				return 0;
			}
			else {
				int count = 0;
				for(int i = 0; i < stroka.length(); i++){
					if(stroka.charAt(i)==controlChar){
						count++;
			        }				
			    }
				return count;
			}
		}
		else return 0;
	}
	
	public static boolean TestFunc(String testString, char testChar, int count){
		if(countChar(testString, testChar)==count) return true; 
			else return false;
	}
}
