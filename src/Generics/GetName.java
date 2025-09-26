package Generics;

import java.util.ArrayList;
import java.util.Scanner;

public class GetName<T>  {
    Scanner scanner = new Scanner(System.in);
    ArrayList<T> name = new ArrayList<>();

    public void getActualName(T Name_Get) {
        name.add(Name_Get);
    }
    public void LoopThroughNames(){
        for(T names : name){
            System.out.println(names);
        }
    }

}

