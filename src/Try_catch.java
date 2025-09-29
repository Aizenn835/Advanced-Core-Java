public class Try_catch {
     public static void main(String[] args){

          try{
              int a = 10;
              int b = 0;
              int c = a / b;
              System.out.println("A / B = " + c);
          }catch(ArithmeticException e){
              System.out.println("Cannot Divide by zero: " + e.getMessage());
          }
     }
}
