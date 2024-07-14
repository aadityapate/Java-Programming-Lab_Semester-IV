public class PS2 
{
	private String name;
	private int roll;
	private double marks;
	public void getData(String name, int roll, double marks) 
	{
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	public void printData() 
	{
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("Marks: " + marks);
	}
	public static void main(String[] args) 
	{
		PS2 s1 = new PS2();
		s1.getData("John Doe", 101, 85.5);
		s1.printData();
		PS2 s2 = new PS2();
		s2.getData("Jane Smith", 102, 91.2);
		s2.printData();
		}
}