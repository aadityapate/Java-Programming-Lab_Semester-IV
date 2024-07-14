import java.util.Scanner;

class Stud {
  String name;
  String city;
  int age;

  void addData() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name: ");
    name = input.nextLine();
    System.out.print("Enter city: ");
    city = input.nextLine();
    System.out.print("Enter age: ");
    age = input.nextInt();
  }

  void printData() {
    System.out.println("Name: " + name);
    System.out.println("City: " + city);
    System.out.println("Age: " + age);
  }
}

public class Student 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int numStudents = input.nextInt();
    Stud[] students = new Stud[numStudents];

    for (int i = 0; i < numStudents; i++) {
      System.out.println("Enter data for student " + (i + 1) + ":");
      Stud s = new Stud();
      s.addData();
      students[i] = s;
    }

    System.out.println("\nStudent Data:");
    for (int i = 0; i < numStudents; i++) {
      System.out.println("\nStudent " + (i + 1) + ":");
      students[i].printData();
    }
  }
}
