import java.util.Date;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Stas", 2580.0, 1988, 11, 29);
		staff[1] = new Employee("Maxx", 2100.0, 1992, 5, 20);
		staff[2] = new Employee("Serg", 1850.0, 1987, 10, 07);
		
		for (Employee e : staff)
			System.out.println("Name: " + e.getName()
							   + ",  salary: " + e.getSalary());
		
		System.out.println();
		
		for (Employee e : staff)
			e.raiseSalary(5);
			
		for (Employee e : staff)
			System.out.println("Name: " + e.getName()
			+ ",  salary: " + e.getSalary() + ",  HireDay: "
			+ e.getDate());
			
		System.out.println();
		
		Employee harry = new Employee("Harry", 10000.0, 1970, 01, 01);
		System.out.println(harry.getDate());
		Date d = harry.getDate();
		double temp = (1000 * 60 * 60 * 24 * 365.25 * 10);
		d.setTime(d.getTime() + (long) temp);
		System.out.println(d);
		System.out.println(harry.getDate());
		
		
		
	}
}
