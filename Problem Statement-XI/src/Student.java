public class Student 
{
	private String name;
	private int age;
	private double gpa;
	public Student(String name, int age, double gpa) 
	{
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public double getGpa() 
	{
		return gpa;
	}
	public void setGpa(double gpa) 
	{
		this.gpa = gpa;
	}
	public static void main(String[] args) 
	{
		Student student = new Student("Aditya Pate", 20, 3.5);
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("GPA: " + student.getGpa());
		student.setGpa(3.8);
		System.out.println("Updated GPA: " + student.getGpa());
	}
}