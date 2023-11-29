package Javalearning;
/*class Hello
{
    public static void main(String args[])
    {
        int num1 =10;
        int num2=20;
        int num3=num1+num2;
        System.out.println(num3);
    }
}*/
/*class addition
{
    public static void main(String args[])
    {
        //int n=10;
        double d=10.7;
        int n=(int)d;
        System.out.println(n);
    }
}*/
/*class progra
{
    public static void main(String args[])
    {
        byte a=10;
        byte b=20;
        int n3=a * b;
        System.out.println(n3);
    }
}*/
/*class program
{
    public static void main(String args[])
    {
        int n=10;
        for(int i=0;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}*/
/*class program
{
    public static void main(String args[])
    {
        int n1=7;
        int n2=5;
        int result=n1%n2;
        System.out.println(result);
    }
}*/
/*class program{
    public static void main(String args[])
    {
        int n1=10;
        //++n1;
        //n1++
        int result =n1++;
        System.out.println(result);
    }
}*/
/*class program{
    public static void main(String args[])
    {
        int x=10;
        int y=50;
        int z=30;
        if(x<y && y<z)
        {
            
            System.out.println("Hello");
        }
        else if(y>z && z<x)
        {
            System.out.println("World");
        }
        else
        {
            System.out.println("Good Bye");
        }
    }
}*/
/*class program
{
    public static void main(String[] args)
    {
        int n=55;
        String result="";
        result=(n%2==0) ? "Even Number" : "Odd Number";
        System.out.println(result);
    }
}*/
/*class program{
    public static void main(String[] args)
    {
         int n=2;
         switch (n) {
            case 1:
                System.out.println("Monday");
                break;
         case 2:
         System.out.println("Tuesday");
         break;
         case 3:
         System.out.println("Wednesday");
         break;
         case 4:
         System.out.println("Thursday");
         break;
         case 5:
         System.out.println("Friday");
         break;
         case 6:
         System.out.println("Saturday");
         break;
         case 7:
         System.out.println("Sunday");
         break;
            default:
            System.out.println("Invalid Number");
                break;
         }
    }
}*/
/*class program
{
    public static void main(String[] args)
    {
         String Day="Sunday";
         String result="";
         result= switch (Day) {
            case "Tuesday"-> result="It's a Holiday";
            case "Saturday" ,"Sunday" -> result="Weekend's";
            default-> result="WeekDays";
         };
         System.out.print(result);
    }
}*/
/*class program{
    public static void main(String [] args)
    {  
        String Day="Sunday";
         String result="";
         result= switch (Day) {
            case "Tuesday": yield "It's a Holiday";
            case "Saturday" ,"Sunday":  yield "Weekend's";
            default : yield"WeekDays";
         };
         System.out.print(result);
        
    }
}*/