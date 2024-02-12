/*public class stack 
{
    public int a=10; //will store it in heap
    public int addition(int n1,int n2)
    {
        System.out.println(a);
        return n1+n2;
    }
}
class program
{
    public static void main(String[] args)
    {
        stack s=new stack();
        int result =s.addition(20,30);
        System.out.println(result);
    }
}*/
/*class program
{
    public static void main(String[] args)
    {
        int num[]=new int[4];
        num[0]=4;
        num[1]=5;
        num[2]=8;
        num[3]=90;
        for(int i=0;i<4;i++)
        {
            System.out.println(num[i]);
        }
    }
}*/
/*class program{
    public static void main(String[] args)
    {
        int n[][]=new int[4][5];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }

/*class program{
    public static void main(String[] argd)
    {
        int num[][]=new int[5][6];
       for(int i=0;i<5;i++)
       {
        for(int j=0;j<6;j++)
        {
            num[i][j]= (int) (Math.random() *10);
        }
       }

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<6;j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
      for(int n[] : num)
      {
         for(int m:n)
         {
             System.out.print(m);
         }
         System.out.println();
      }
    }
}*/
/*class program
{
    public static void main(String[] args)
    {
        int n[][]=new int[4][];
        n[0]=new int[4];
        n[1]=new int[5];
        n[2]=new int[6];
        n[3]=new int[7];
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n[i].length;j++)
            {
                n[i][j]=(int) (Math.random() *10);
            }
        }
        for(int x[] : n)
        {
            for(int b : x)
            {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}*/
/*class program
{
    public static void main(String[] args)
    {
        int num[][][]=new int[4][5][6];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                for(int k=0;k<6;k++)
                {
                    num[i][j][k]=(int) (Math.random() * 10);
                }
            }
        }
        for(int x[][] : num)
        {
           for(int y[] :x)
           {
               for(int z:y)
               {
                  System.out.print(z);
               }
               System.out.println();;
           }
        }
    }
}*/
