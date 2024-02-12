class program
{
    public static void main(String[] args)
    {
        int n=5;
        //Integer num=new Integer(n) // Boxing means taking the primitve value and assiging it in Integer object.
        Integer num =n; //autoboxing means directly we are assigning the primitive value to the integer object.
        System.out.println(num);

       // int num1 =num.intValue(); // Unboxing taking integer object and assigning it in primitive type.
          int num1=num;
          System.out.println(num1); //Autounboxing

          String str="30";
          Integer a=Integer.parseInt(str);
          System.out.println(a);
          
    }
}
