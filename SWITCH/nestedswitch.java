import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int empId = in.nextInt();
    switch(empdId){
        case 1:
        System.out.println("shweta awadhwa");
        break;
        case 2:
        System.out.println("sakshi wadhwa");
        break;
        case 3:
        String department=in.next();
        switch(department){
            case "IT":
            System.out.println("IT");
            break;

            case "management":
            System.out.println("management department");
            break;

            default:
            System.out.println("byebye");
        }
        default:
        System.out.println("enter correct empid");
    }
    }
    
}
