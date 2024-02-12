// public class Object 
// {
//     int age;
//     String name;

// public String toString()
// {
//     return name + " " + age + " ";
// }
// public boolean equals(Object that)
// {
//     if( this.name.equals(that.name) && this.age==that.age)
//     {
//         return true;
//     }
//     else
//     return false;
// }
// }
// class program
// {
//     public static void main(String[] args)
//     {
//         Object ob1=new Object();
//         ob1.age=30;
//         ob1.name="Priyanka";
//         Object ob2=new Object();
//         ob2.age=30;
//         ob2.name="Priyanka";
//         boolean result= ob1.equals(ob2);
//         System.out.println(result);
//     }
// }
// public class Object 
// {
//     int age;
//     String name;
    
//     public String toString() {
//         return "Object [age=" + age + ", name=" + name + "]";
//     }
   
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + age;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
    
//     public boolean equals(java.lang.Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Object other = (Object) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
    
// }

// class program
// {
//     public static void main(String[] args)
//     {
//         Object ob1=new Object();
//         ob1.age=30;
//         ob1.name="Priyanka";
//         Object ob2=new Object();
//         ob2.age=30;
//         ob2.name="Priyanka";
//         boolean result= ob1.equals(ob2);
//         System.out.println(result);
//     }
// }

