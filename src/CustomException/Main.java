package CustomException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if(age <= 0){
                throw new InputHasMistmatchException("Age cannot be 0!");
            }

            System.out.println("Your age is: " + age);

        }catch(InputHasMistmatchException e){
            System.out.println("Custom Exception: " + e.getMessage());

        }
    }
}
