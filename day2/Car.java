package week1.day2;
public class Car {
 public static void main(String[] args) {
	 Car obj = new Car();
			int numb= obj.getRegNum();	
			System.out.println("car registration number is:"+numb);			
			String name=obj.getOwnerName();
			System.out.println("car owner name is:"+name);			
			boolean carPuncture = obj.carPuncture();
			System.out.println("carPuncture is:"+carPuncture);			
			String carModel = obj.getCarModel();
			System.out.println("carModel is:"+carModel);			
			int subTwoNum = obj.subTwoNum(10,4);
			System.out.println("subTwoNum result is:"+subTwoNum);			
			int mulThreeNum = obj.mulThreeNum(2, 3, 4);
			System.out.println("mulThreeNum result is:"+mulThreeNum);			
			int divTwoNum = obj.divTwoNum(2,3);
			System.out.println("divTwoNum result is:"+divTwoNum);
			
}
 
 
	public int getRegNum() {
		int getRegNum=8768;
		return getRegNum;
	}	
	private String getOwnerName() {
		String getOwnerName="Subasri";
				return getOwnerName;
	}	
	public boolean carPuncture() {
		boolean carPuncture=false;
		return carPuncture;
	}
	String getCarModel() {
		String carName="Swift";
	return carName;
	}
	

	public int subTwoNum(int num1,int num2) {
		return num1-num2;
	}
	public int mulThreeNum(int num1,int num2,int num3) {
		return num1*num2*num3;
	}
	public int divTwoNum(int num1,int num2) {
		return num1/num2;
	}	
}
