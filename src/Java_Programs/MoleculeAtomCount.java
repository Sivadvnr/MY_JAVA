package Java_Programs;

import java.util.HashMap;

//This is the mose difficult program I felt in my college days

import java.util.Map;
import java.util.Scanner;

public class MoleculeAtomCount {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String molecule = s.nextLine();
		
		getAtomsCount(molecule);

	}

	public static void getAtomsCount(String str)
	{
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		for(int i=0; i<str.length(); i++)
		{
			int count = 0;
			char c = str.charAt(i);
			
			String a = "";
			
			a = String.valueOf(c);
			
			
			if (a.matches("[A-Z]"))
			{
				for(int j = i+1; j< str.length(); j++)
				{
					char d = str.charAt(j);
					
					String b = String.valueOf(d);
					
					if(b.matches("[a-z]"))
					{
						a = a + b;
						
						if (mp.get(a) == null)
							mp.put(a, 1);
						else mp.put(a, mp.get(a) + 1);
						count = 1;
						
					}
					
					else if(b.matches("[\\d]"))
					{
						int k = Integer.parseInt(b);
						mp.put(a, k);
						count = 1;
					}
					
					else {
						i = j-1;
						break;
					}
				}
				
				if(count == 0)
				{
					if(mp.get(a) == null)
						mp.put(a, 1);
					else mp.put(a, mp.get(a) + 1);
				}
			}
		}
		
		System.out.println("Atoms count is:");
		
		for(Map.Entry<String, Integer> entry:mp.entrySet())
			System.out.println(entry.getKey()+" " + entry.getValue());
	}

}
