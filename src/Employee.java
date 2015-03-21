import java.util.Date;
import java.util.GregorianCalendar;
import java.lang.Object;

class Employee
{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int y, int m, int d)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(y, m-1, d);
		hireDay = calendar.getTime();
	}
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getDate()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double temp = salary * (byPercent / 100);
		salary += temp;
	}
	
	public static void main(String[] args)
	{
		Employee a = new Employee("Alex", 1000.0);
		System.out.println("Without hireDay Emlpoyee:  " +
							a.getName() + "  " + a.getSalary() + 
							"  " + a.getDate());
		
		Employee b = new Employee("Bob", 15000.0, 1988, 11, 29);
		System.out.println("With hireDay Employee:  " +
							b.getName() + "  " + b.getSalary() +
							"  " + b.getDate());
	}
}
