import java.util.Scanner;
public class PersonTest {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        Person p1 = new Person();

        String n, e;
        int a;

        System.out.print("Enter the name of the Person: ");
        n = input.nextLine();
        p1.setName(n);
        System.out.print("Enter the age of the Person: ");
        a = input.nextInt();
        p1.setAge(a);
        input.nextLine();
        System.out.print("Enter the email of the Person: ");
        e = input.nextLine();
        p1.setEmail(e);

        p1.displayinfo();
    }
    
}
