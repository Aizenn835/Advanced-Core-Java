package Lambda;

 import java.util.Scanner;

public class Main {
     public static void main(String[] args){

          Scanner scanner = new Scanner(System.in);

         System.out.print("Enter your name: ");
         String name = scanner.nextLine();

          MyInterface myInterface = (x) -> {
              System.out.println("Hello " + x);
              System.out.println("Nice to meet you");
         };
          MyInterface myInterface1 = (y) -> {
              System.out.println("Hi " + y);
          };

           myInterface1.message(name);




     }
}
