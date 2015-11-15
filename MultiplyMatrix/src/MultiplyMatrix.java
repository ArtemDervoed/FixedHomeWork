
public class MultiplyMatrix {
	
	public static double[][] multiplyOfMatrix(double[][] firstMulty, double[][] secondMylty) {
		if(firstMulty==null||secondMylty==null){
			return null;
		}
		if((firstMulty.length<secondMylty[0].length)||(secondMylty.length<firstMulty[0].length))
			return null;
		double [][]result=new double[firstMulty.length][secondMylty[0].length];
		if(firstMulty[0].length>=secondMylty[0].length){
			for (int i=0;i<result.length;i++){
				for (int j=0;j<result[0].length;j++){
					for (int k=0;k<result.length;k++){
						result[i][j]+=firstMulty[i][k]*secondMylty[k][j];
		            }
				}
			}
		}
		return result;
		}
	public static boolean TestFunc(double[][] A, double[][] B,double[][] C ){	
		if((multiplyOfMatrix(A, B))==C)	return true;	
			else return false;	
	}

}
