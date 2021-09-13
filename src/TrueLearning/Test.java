package TrueLearning;

class Ola implements Cab{

	
		public void bookCab() {
		
			System.out.println("Cab is bookd:");
		}

}

public class Test {
	
	public static void main(String args[])
	{
		Cab c = new Ola();
		
		c.bookCab();
	}
}
