package aula07Singleton;

public class Main {
    
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("First");

        Singleton outro_singleton = Singleton.getInstance("Second");

        System.out.println(singleton.value);

        System.out.println(outro_singleton.value);

    }

}
