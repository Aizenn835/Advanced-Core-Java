package FileWriter_Reader;

  import java.io.*;


public class FileWrite {
    public static void main(String[] args){

         File file = new File("C:\\Users\\Lei Justine\\OneDrive\\FileWriter.txt");

           try(BufferedWriter write = new BufferedWriter(new FileWriter(file))){
               write.write("Hello World");
               write.flush();
               write.close();
               System.out.println("Successfully write.");

           }catch(IOException e){
               System.out.println(e.getMessage());
           }

           try(BufferedReader read = new BufferedReader(new FileReader(file))){
               int character;
                while((character = read.read()) != -1){
                    System.out.print((char) character);
                }
           }catch(IOException e){
               System.out.println(e.getMessage());
           }

    }
}
