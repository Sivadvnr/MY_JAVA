package TrueLearning;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOExample {
	
	public static void main(String args[]) {
		
		try
		{
			FileInputStream fin = new FileInputStream("D:\\Programs\\Java_Learning\\FileIO_Examples\\filein.txt");
			
			FileOutputStream fout = new FileOutputStream("D:\\Programs\\Java_Learning\\FileIO_Examples\\fileout.txt");
			
			int i=0;
			while((i = fin.read())!=-1)
			{
				fout.write(i);
			}
			
			
			System.out.println("------fin data moved to fout -------------");
			
			FileOutputStream fout1 = new FileOutputStream("D:\\Programs\\Java_Learning\\FileIO_Examples\\example1.txt");
			String text = "This is java file IO Example";
			
			byte textb[] = text.getBytes();
			
			fout1.write(textb);
			
			System.out.println("------text String written to example1 file -------------");
			
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		
		
	}

}
