package Enums;

public class Main {
    enum Level{
        HIGH,
        MEDIUM,
        LOW
    }
    public static void main(String[] args) {

        Level myLevel = Level.LOW;

        System.out.println(myLevel);
    }
}
