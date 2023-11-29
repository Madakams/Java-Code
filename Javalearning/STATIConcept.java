/*public class STATIConcept 
{
     int id;
     static String name;
     public static void main(String[] args)
     {
        STATIConcept st=new STATIConcept();
        st.id=1;
        STATIConcept.name="Vamsi Chowdary";
        System.out.println(st.id);
        System.out.println(STATIConcept.name);
     }
}*/
/*class STATIConcept
{
    int id;
    static String name;
    public void method()
    {
        System.out.println(id + ""+ name + " " );
    }
     public static void method1(STATIConcept s)
    {
        System.out.println(s.id + ""+ name + " ");
    }

public static void main(String[] args)
{
    STATIConcept st=new STATIConcept();
    st.id=1;
    STATIConcept.name="Vamsi";
    STATIConcept st2=new STATIConcept();
    st2.id=2;
    STATIConcept.name="Chowdary";
    st2.method();
    st.method();
    STATIConcept.method1(st);
}
}*/
/*class constructortype
{
    int id;
    static String name;
    public constructortype()
    {
        System.out.println("This is constructor");
    }
    static
    {
        String address = "Vizag";
        System.out.println("This is staic block");
    }

public static void main(String[] args)
{
    constructortype con=new constructortype();
     con.id =1;
     constructortype.name="Pranavi";
     System.out.println(con.id);
     System.out.println(constructortype.name);
     
    Class.forName(constructortype);
}
}*/