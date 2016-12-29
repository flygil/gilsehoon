package day05;

public class Test01 {
	public static void main(String[] args) {
		/*
		int i = 1;
		int i2 = 1;
		int i3 = 1;
		int i4 = 1;
		*/
		int[] iArr;
		iArr = new int[10];
		/*
		 * iArr[0] = 10;
		 * iArr[1] = 20;
		 * iArr[2] = 30;
		 * iArr[3] = 40;
		 */
		
		
		
		for(int j = 0; j < iArr.length; j++){
			iArr[j] = (j + 1) * 10;
			System.out.println(iArr[j]);
		}

		/*
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		 */
		
		String[] sArr = new String[4];
		
		for(int j = 0; j < sArr.length; j++){
			sArr[1] = "java";
			System.out.println(sArr[j]);
		}
		
		
	}
}
