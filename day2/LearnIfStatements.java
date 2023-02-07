package week1.day2;

public class LearnIfStatements {
	public static void main(String[] args) {
		int age=18;
		//check condition for casting vote
		if (age>=18) {
			System.out.println("The person can caste the vote");
		}
		else {
			System.out.println("The person cannot caste the vote");
			
		}
   
 int mark=35;
 
		  if(mark<100 && mark>=80) 
		  {
			   System.out.println("It's a first class grade");
			   
		   }
		   else if (mark<80 && mark>=60) {
			   System.out.println("It's a second class grade");
		   }
		   else if (mark<60 && mark>=35) {
			   System.out.println("It's a third class grade");
		   }
		   else {
			   System.out.println("The result is fail");
		   }

	}
}