package gugudan;

public class gugudan {
	//변수 t를 입력받아 구구단계산 함수구현
	public static int[] calculate(int t) {
	int[] result=new int[9];
	for(int i=0;i<result.length;i++) {
		result[i]=t*(i+1);
		}	
	return result;
	}	
	//출력하는 함수 구현
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
//	public static void main(String[] args) {
//		for(int i=2;i<10;i++) {
//			int[] result=gugudan.calculate(i);
//			gugudan.print(result);
//		}	
//	}

	
}
