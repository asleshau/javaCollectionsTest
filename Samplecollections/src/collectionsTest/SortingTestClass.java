package collectionsTest;
import java.util.ArrayList;
import java.util.Collections;

public class SortingTestClass {
	
	public static void main(String[] args) 
	{
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Rohini",50000));
		empList.add(new Employee("Satish",10000));
		empList.add(new Employee("Asha",20000));
		
		Collections.sort(empList, new SalaryComparator());
		
		for(Employee e : empList )
			System.out.println("Employee List :"+e);
	}

}
