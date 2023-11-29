package Javalearning;
/*public class Constructor 
{
    private int age;
    private String name;
    public Constructor()
    {
        age=24;
        name="Vamsi";
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args)
    {
        Constructor con=new Constructor();
        System.out.println(con.getAge() + ":" + con.getName());
    }
}*/
/*class Constructor
{
    private int age;
    private String name;
    public Constructor()
    {
        
    }
    public Constructor(int age, String name)
    {
        this.age=age;
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public static void main(String[] args)
    {
        Constructor con=new Constructor(24,"Gowtham");
        System.out.println(con.getAge() + ":" + con.getName());
    }
}*/
/*class Constructor
{
    
    public Constructor()
    {
        super();
        System.out.println("Base Constructor");
    }
    public Constructor(String name)
    {
        super();
        System.out.println("Base Paramerterized Constructor");
    }
}
    class SubConstructor extends Constructor
    {
        
        public SubConstructor()
        {
            super();
            System.out.println("Sub Construcor");
        }
        public SubConstructor(String address)
        {
           this();
            System.out.println("Sub Paramerterized Constructor");
        }
    
    public static void main(String[] args)
    {
        //Constructor con=new Constructor();
        //Constructor con1=new Constructor("Vamsi Chowdary");
        SubConstructor con=new SubConstructor();
        SubConstructor con1=new SubConstructor("Vamsi Chowdary");
    }
}*/
