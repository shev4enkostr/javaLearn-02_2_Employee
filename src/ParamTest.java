public class ParamTest
{
	public static void main(String[] args)
	{
		/* Передача в качестве параметра
		   числа 
		   НЕ СРАБОТАЕТ! */
		System.out.println("Testing tripleValue()...");
		double percent = 10.0;
		System.out.println("Before: " + percent);
		tripleValue(percent);
		System.out.println("After: " + percent);
		
		System.out.println();
		
		/* Передача в качестве параметра 
		   ссылки на объект 
		   СРАБОТАЕТ! */
		System.out.println("Testing tripleSalary()...");
		Employee harry = new Employee("Harry", 1000.0);
		System.out.println("Before: " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: " + harry.getSalary());
		
		System.out.println();
		
		/* Присоединение новых объектов
		   к объектным параметрам 
		   НЕ СРАБОТАЕТ! */
		System.out.println("Testing swap()...");
		Employee a = new Employee("Alex", 10000.0);
		Employee b = new Employee("Bob", 100_000.0);
		System.out.println("Before a: " + a.getName());
		System.out.println("Before b: " + b.getName());
		swap(a, b);
		System.out.println("After a: " + a.getName());
		System.out.println("After b: " + b.getName());
		
		System.out.println();
		
		System.out.println("Testing return of method swap()...");
		System.out.println("Returned String: " + swap(a, b));
	}
		
	public static void tripleValue(double x)
	{
		x = x * 3;
		System.out.println("End of method tripleValue x: " + x);
	}
	
	public static void tripleSalary(Employee x)
	{
		x.raiseSalary(200);
		System.out.println("End of method tripleSalary x: " + x.getSalary());
	}
	
	public static String swap(Employee x, Employee y)
	{
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method x: " + x.getName());
		System.out.println("End of method y: " + y.getName());
		return x.getName() + y.getName();
	}
}
