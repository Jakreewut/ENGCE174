 import java.util.Scanner;
 class Animal {
    protected  String name;
    protected  int age;

    public void markSound() {
        System.out.println("I am Animal.");
    }

    public void display() {
        System.out.println("Name [" + name + "] , Age [" + age + "]");
    }
}

class cat extends Animal {
    @Override
    public void markSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name :");
        String name = scan.nextLine();

        System.out.println("Enter age :");
        int age = scan.nextInt();

        cat myCat = new cat();

        myCat.name = name;

        myCat.age = age;

        System.out.println("-----------------Cat----------------");
        
        myCat.display();
        
        myCat.markSound();

    }
}
