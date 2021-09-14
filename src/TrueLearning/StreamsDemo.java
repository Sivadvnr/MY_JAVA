package TrueLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee
{
	int empid;
	String empname;
	
	
	public Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	/*
	 * public int getEmpid() { return empid; } public void setEmpid(int empid) {
	 * this.empid = empid; } public String getEmpname() { return empname; } public
	 * void setEmpname(String empname) { this.empname = empname; }
	 */


}

public class StreamsDemo {

	public static void main(String[] args) {
		
		/*
		 * List<Employee> emp = new ArrayList<Employee>();
		 * 
		 * Employee e1 = new Employee(1, "Siva"); Employee e2 = new Employee(2, "Raja");
		 * Employee e3 = new Employee(3, "Prasad"); Employee e4 = new Employee(4,
		 * "Basi");
		 * 
		 * emp.add(e1); emp.add(e2); emp.add(e3); emp.add(e4);
		 * 
		 * //emp.stream().sorted((empid1, empid2) ->
		 * empid1.compareTo(empid2)).collect(Collector.toList());
		 * 
		 * emp.stream().filter(e -> e.empid >= 3).forEach(em ->
		 * System.out.println(em.empid+" "+em.empname));
		 * 
		 * //for(Employee e:emp) //System.out.println(e.empid+" "+e.empname);
		 */
		
		
		//int[] nums = {1, 2, 3};
		
		List<Integer> alist = Arrays.asList(3, 4, 6, 8, 13, 92, 10);
		
		// alist.stream().sorted().forEach(b -> System.out.println(b));
		
		List<Integer> sortList = alist.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList);
				
		}

}
