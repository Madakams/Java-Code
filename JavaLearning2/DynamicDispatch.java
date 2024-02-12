// class DynamicDispatch
// {
//     public void method()
//     {
//         System.out.println("Class A");
//     }
// }
// class B extends DynamicDispatch
// {
//     public void method()
//     {
//         System.out.println("Class B");
//     }
// }
// class C extends DynamicDispatch
// {
//     public void method()
//     {
//         System.out.println("Class C");
//     }
// }
// class Demo{
//     public static void main(String[] args)
//     {
//         DynamicDispatch dd=new DynamicDispatch();
//         dd.method();
//         dd=new B();
//         dd.method();
//         dd=new C();
//         dd.method();
//         System.out.println();
//     }
// }