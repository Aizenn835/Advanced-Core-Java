package Generics;

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // initialize a variale here:
        String Names = " ";
        int choice = 0;

        // initialize object here:
        GetName<String> nameFunction = new GetName<>();
        GetName<Integer> ageFunction = new GetName<>();
        GetName<Double> gradesFunction =  new GetName<>();


        while(choice != 4) {
            System.out.println("Choose what you want store:");
            System.out.println("[1]Names");
            System.out.println("[2]Age");
            System.out.println("[3]Grades");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("How many times: ");
                    int count = scanner.nextInt();
                    scanner.nextLine();
                    if (count <= 0) {
                        System.out.println("Invalid choice.");
                    }
                    for (int i = 1; i <= count; i++) {
                        System.out.print("Enter name " + i + ": ");
                        Names = scanner.nextLine();
                        nameFunction.getActualName(Names);
                    }
                    System.out.println();
                    System.out.println("All Stored Names:");
                    nameFunction.LoopThroughNames();
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("How many times: ");
                    int count = scanner.nextInt();

                    if(count <= 0){
                        System.out.println("Out of bounds.");
                    }
                    for(int i = 1; i <= count; i++){
                        System.out.print("Enter age " + (i) + " : ");
                        int age = scanner.nextInt();
                        ageFunction.getActualName(age);
                    }
                    ageFunction.LoopThroughNames();
                }
                case 3 -> {
                    double gradescount = 0;
                    double total = 0;
                    System.out.print("How many times: ");
                    int counter= scanner.nextInt();

                    for(int i = 1; i <= counter; i++ ){
                        System.out.print("Enter grades " + (i) + " : ");
                        double grades = scanner.nextDouble();
                        gradesFunction.getActualName(grades);
                        gradescount+= grades;
                        total = gradescount / 2;
                    }
                    gradesFunction.LoopThroughNames();
                    System.out.println("Total: " + total);
                }
            }
        }
    }
}

