// public class Employee
// {
//     int  id;
//     String name;
//     int salary;
// }
// class project
// {
//     public static void main(String[] agrs)
//     {
//         Employee e1=new Employee();
//         e1.id=101;
//         e1.name="kiran";
//         e1.salary=20000;

//         Employee e2=new Employee();
//         e2.id=102;
//         e2.name="Pavan";
//         e2.salary=70000;

//         Employee e3=new Employee();
//         e3.id=103;
//         e3.name="honey";
//         e3.salary=60000;
    
//     Employee[] emp=new Employee[3];
    
//     emp[0]=e1;
//     emp[1]=e2;
//     emp[2]=e3;
    
//    for(int i=0;i<emp.length;i++)
//    {
//       System.out.println(" Employee Name:" + emp[i].name);
//    }
    
//     }
// }
// public class Employee
// {
//     int  id;
//     String name;
//     int salary;
// }
// class project
// {
//     public static void main(String[] agrs)
//     {
//         Employee e1=new Employee();
//         e1.id=101;
//         e1.name="kiran";
//         e1.salary=20000;

//         Employee e2=new Employee();
//         e2.id=102;
//         e2.name="Pavan";
//         e2.salary=70000;

//         Employee e3=new Employee();
//         e3.id=103;
//         e3.name="honey";
//         e3.salary=60000;
    
//     Employee[] emp=new Employee[3];
    
//     emp[0]=e1;
//     emp[1]=e2;
//     emp[2]=e3;
    
//    for(Employee e : emp)
//    {
//       System.out.println(e.id + ":" + e.name);
//    }
    
//     }
// }
// class program
// {
//     public static void main(String[] agrs)
//     {
//         String name=new String("Vinay");
//         System.out.println(name + "Kumar");
//     }
// }
// 
// class project
// {
//    static int id;
//    String name;

// public void method()
// {
// System.out.println(id + " " + name + " ");
// }
// }
// class driver
// {
// public static void main(String[] args)
// {
//     project p=new project();
//     project.id=1;
//     p.name="Sravani";

//     project p1=new project();
//     project.id=2;
//     p1.name="Vasaanthi";
    
//     project.id=5;
    
//     p.method();
//     p1.method();
// }

// }
// class program
// {
//     static int id;
//     String name;
//     public static void method(program p)
//     {
//       System.out.println(id + " " + p.name + " " );
//     }
// }
// class project{
//   public static void main(String[] args)
//   {
//     program p=new program();
//     program.id=1;
//     p.name="Priyatham";
//     System.out.println();
//     p.method(p);
//   }
// }
/*class program
{
  int id;
  static String name;
  public program()
  {
      id=1;
      System.out.println("constructor");
  }
  static
  {
      name="Honey";
      System.out.println("static constructor");
  }
}
class Demo
{
  public static void main(String[] args)
  {
     program p=new program();
     p.id=101;
     System.out.println(p.id + " ");
  }
}*/