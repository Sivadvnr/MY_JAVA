package TrueLearning;



public class SumOfTwoNumbers{
	
	public static void main(String[] args)
	{
		SumIntrface s = (a, b)->{
			int c = a + b ; 
			System.out.println("Sum of numbers is :" + c);
		};
		
		s.sum(8, 9);
	}
	
	
	/*public static void main(String[] args)
	{
		SumIntrface s = new SumOfTwoNumbers();
		s.sum(2, 3);
	}*/

}
