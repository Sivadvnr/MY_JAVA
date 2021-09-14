package TrueLearning;

import java.util.function.Predicate;

public class SumOfTwoNumbers{
	
	public static void main(String[] args)
	{
		SumIntrface s = (a, b)->{
			int c = a + b ; 
			System.out.println("Sum of numbers is :" + c);
		};
		
		s.sum(8, 9);
		
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20));
	}

}
