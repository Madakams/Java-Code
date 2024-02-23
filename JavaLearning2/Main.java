import java.util.Scanner;
class Main
{
   public static void main(String[] args)
   {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the username:");
      String name=obj.nextLine();
      System.out.println("Enter the age:");
      int age=obj.nextInt();
      System.out.println("Enter the Salary");
      double Salary=obj.nextDouble();
      System.out.println("Name: " + name + "Age: " + age + " Salary: " + Salary);
   }
}