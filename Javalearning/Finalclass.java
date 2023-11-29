package Javalearning;

//final class Finalclass 
/*public class Finalclass
{
    
    //public final void method()
    public void method()
    {
        //final int a=10;
        //a=20;
        System.out.println("Base Class");
    }
}
class subclass extends Finalclass
{
    //public void method()
    public void method(int a, int b)
    {
       System.out.println(a+b);
    }

class program
{
    public static void main(String[] args)
    {
       subclass fc=new subclass();
        fc.method();
        fc.method(7,8);
    }
}
}*/

/*class Finalclass
{
    int id;
    String Name;
   public String toString()
   {
        return id + " " + ":" + Name;
   }
   public boolean equals(Finalclass that)
   {
        if(this.Name.equals(that.Name) && this.Name==that.Name)
        
            return true;
        else
        return false;
        
   }
}
class derived
{
    public static void main(String[] args)
    {
        Finalclass fc=new Finalclass();
        fc.id=20;
        fc.Name="Vamsi Chowdary";
        Finalclass fc1=new Finalclass();
        fc1.id=24;
        fc1.Name="Vamsi";
        boolean val=fc.equals(fc1);
        //String val=fc.toString();
        System.out.println(val);
    }
}*/
class Finalclass
{
   int age;
   String Address;
@Override
public String toString() {
    return "Finalclass [age=" + age + ", Address=" + Address + "]";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + ((Address == null) ? 0 : Address.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Finalclass other = (Finalclass) obj;
    if (age != other.age)
        return false;
    if (Address == null) {
        if (other.Address != null)
            return false;
    } else if (!Address.equals(other.Address))
        return false;
    return true;
}
   
}
class derived
{
    public static void main(String[] args)
    {
        Finalclass fc=new Finalclass();
        fc.age=24;
        fc.Address="Nellore";
        Finalclass fc1=new Finalclass();
        fc1.age=22;
        fc1.Address="Hyderabad";
        boolean val=fc.equals(fc1);
        //String val=fc.toString();
        System.out.println(val);
    }
}