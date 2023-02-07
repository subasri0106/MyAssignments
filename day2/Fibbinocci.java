package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int i;
		int firstNum=0; 
		int secNum=1; 
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(i=2;i<11;i++) {
			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
		
		}
	}

}
