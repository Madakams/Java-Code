// class a
// {
//     public a()
//     {
//         super();
//         System.out.println("default constructor");
//     }
//     public a(int n)
//     {
//         super();
//         System.out.println("default parameterized constructor");
//     }
// }
// class b extends a
// {
//     public b()
//     {
//         super();
//         System.out.println("inheritence COnstructor");;
//     }
//     public b(int n)
//     {
//         this();
//         System.out.println("inheritence parameterized COnstructor");
//     }
// }
// class Demo{
//     public static void main(String[] args)
//     {
//         b c=new b(4);
//     }
// }
// class program
// {
//     private int age;
//     private String  name;
//  public program()
//  {

//  }
//  public program(int age,String name)
//  {
//    this.age=age;
//    this.name=name;
//  }
// public int getAge() {
//     return age;
// }
// public void setAge(int age) {
//     this.age = age;
// }
// public String getName() {
//     return name;
// }
// public void setName(String name) {
//     this.name = name;
// }

// }
// class Demo{
//     public static void main(String[] args)
//     {
//         program p=new program(20,"JOhn");
//         System.out.println(p.getAge() + ":" + p.getName());
//     }
// }