import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(random (5, 7));

        Scanner sc = new Scanner(System.in);
        Student priest = new Student();

        boolean flag = true;
        String usrInput = "";
        System.out.print("Type student name: ");
        do {
            System.out.println("Please enter a student name!");
            while (!sc.hasNextLine()) {
                System.out.println("That's not a string!");
                sc.next(); // this is important!
                flag = false;
            }
            usrInput = sc.nextLine();
        } while (!flag);
        System.out.println("Thank you! Got " + usrInput);



        priest.setName(usrInput);
        priest.setGrade(20);
        priest.setId(7);
        System.out.println(priest.toString());

    }


    public static int random (int a, int b){
        return a*b;
    }
}
