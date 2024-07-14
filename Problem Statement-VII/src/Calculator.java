import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to perform the operation: \n1. for integer, \n2. for float, \n3. for complex\n");
		int type = sc.nextInt();
		switch (type) 
		{
			case 1:
				System.out.print("Enter first integer number: ");
				int num1 = sc.nextInt();
				System.out.print("Enter second integer number: ");
				int num2 = sc.nextInt();
				System.out.println("\nResult of addition: " + add(num1, num2));
				System.out.println("Result of subtraction: " + sub(num1, num2));
				System.out.println("Result of multiplication: " + multi(num1, num2));
			break;
			case 2:
				System.out.print("Enter first float number: ");
				float num3 = sc.nextFloat();
				System.out.print("Enter second float number: ");
				float num4 = sc.nextFloat();
				System.out.println("Result of addition: " + add(num3, num4));
				System.out.println("Result of subtraction: " + sub(num3, num4));
				System.out.println("Result of multiplication: " + multi(num3, num4));
			break;
			case 3:
				System.out.print("Enter real part of first complex number: ");
				float real1 = sc.nextFloat();
				System.out.print("Enter imaginary part of first complex number: ");
				float img1 = sc.nextFloat();
				System.out.print("Enter real part of second complex number: ");
				float real2 = sc.nextFloat();
				System.out.print("Enter imaginary part of second complex number: ");
				float img2 = sc.nextFloat();
				Complex num5 = new Complex(real1, img1);
				Complex num6 = new Complex(real2, img2);
				System.out.println("Result of addition: " + add(num5, num6));
				System.out.println("Result of subtraction: " + sub(num5, num6));
				System.out.println("Result of multiplication: " + multi(num5, num6));
				break;
				default:
					System.out.println("Invalid input!");
		}
		sc.close();
	}
	public static int add(int a, int b) 
	{
		return a + b;
	}
	public static int sub(int a, int b) 
	{
		return a - b;
	}
	public static int multi(int a, int b) 
	{
		return a * b;
	}
	public static float add(float a, float b) 
	{
		return a + b;
	}
	public static float sub(float a, float b)
	{
		return a - b;
	}
	public static float multi(float a, float b) 
	{
		return a * b;
	}
	public static Complex add(Complex a, Complex b)
	{
		return a.add(b);
	}
	public static Complex sub(Complex a, Complex b) 
	{
		return a.sub(b);
	}
	public static Complex multi(Complex a, Complex b) 
	{
		return a.multiply(b);
	}
}
class Complex 
{
	private double real, imag;
	public Complex(double r, double i)
	{
		real = r;
		imag = i;
	}
	public Complex add(Complex c) 
	{
		return new Complex(real + c.real, imag + c.imag);
	}
	public Complex sub(Complex c) 
	{
		return new Complex(real - c.real, imag - c.imag);
	}
	public Complex multiply(Complex c) 
	{
		double r = real * c.real - imag * c.imag;
		double i = real * c.imag + imag * c.real;
		return new Complex(r, i);
	}
}