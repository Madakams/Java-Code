class Enum
{
public static void main(String[] args)
{
    enum EmployeeStatus
{
   Employed,UnEmployed,SelfEmployed
}
EmployeeStatus e=EmployeeStatus.Employed;
 switch (e) {
    case Employed:
           System.out.println("User is Employed");
        break;
        case UnEmployed:
            System.out.println("User is UnEmployed");
        break;
        case SelfEmployed:
            System.out.println("User is SelfEmployed");
        break;
    default:
    System.out.println("Wrongly selected");
        break;
 }
}
}
