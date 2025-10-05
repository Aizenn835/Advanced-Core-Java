 package Streams;

 import java.util.*;
 import java.util.stream.Collectors;

 public class Main{
     public static void main(String[] args){
          // filter grade >= 85
          List<Person> students = new ArrayList<>();
         students.add(new Person("alice" , 95.0));
         students.add(new Person("jason" , 90.0));
         students.add(new Person("lei" , 85.0));
         students.add(new Person("Athasia" , 81.0));
         students.add(new Person("jake" , 72.0));

            ArrayList<Person> Students_higher = students.stream().filter(p -> p.grade >= 85.0)
                    .map(p -> new Person(p.Student_name.toUpperCase() , p.grade))
                    .sorted( Comparator.comparing(p -> p.Student_name))
                    .collect(Collectors.toCollection(ArrayList::new));

            Students_higher.forEach(i ->{
                System.out.println(i.Student_name + ": " + i.grade);
                System.out.println("------------------------------");
            });

     }
 }