import java.util.Scanner;
public class PS1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st integer: ");
		int num1 = input.nextInt();
		System.out.print("Enter 2nd integer: ");
		int num2 = input.nextInt();
		System.out.print("Enter 3rd integer: ");
		int num3 = input.nextInt();
		System.out.print("Enter 4th integer: ");
		int num4 = input.nextInt();
		if (num1 == num2 && num2 == num3 && num3 == num4) 
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("NOT Equal");
		}
	}
}