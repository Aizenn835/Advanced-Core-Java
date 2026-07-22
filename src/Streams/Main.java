 package Streams;

 import java.util.*;

 public class Main{
     public static void main(String[] args){
         // filter grade >= 85
         List<Person> students = new ArrayList<>();
         students.add(new Person("Lei" , 54.6));
         students.add(new Person("Juan" , 89.6));
         students.add(new Person("Athasia" , 97.6));
         students.add(new Person("Cruz" , 90.6));

         // filter map sorted and collect
         List<Person> newList = students.stream().filter((s) -> s.grade >= 85.0)
                 .sorted(Comparator.comparing((s) -> s.Student_name))
                 .toList();
         // loop
         newList.forEach((i) -> System.out.println(i.Student_name + " " + i.grade));

     }
 }