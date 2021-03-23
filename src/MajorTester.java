import java.util.Scanner;

/**
 * Major class Tester
 */
public class MajorTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please choose one of these majors: \n1. Computer Science " +
                "\n2. Cyber Security" +
                "\n3. Theatre");
        int option = scan.nextInt();
        switch (option){
            case 1:
                ComputerScience majorCompSci = new ComputerScience("Computer Science", 2.0, 120,"Undergraduate");
                System.out.println(majorCompSci.genInfo());
                break;
            case 2:
                CyberSecurity majorCyber = new CyberSecurity("Cyber Security", 3.0, 60,"Graduate");
                System.out.println(majorCyber.genInfo());
                break;
            case 3:
                Theatre newMajor = new Theatre("Theatre", 2.0, 120, true);
                System.out.println(newMajor.genInfo());
                break;
            default:
                break;
        }
    }
}
