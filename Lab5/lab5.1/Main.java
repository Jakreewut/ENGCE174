 import java.util.Scanner;
 class Animal {
    protected  String name;
    protected  int age;

    public void display() {
        System.out.println("Name [" + name + "] , Age [" + age + "]");
    }
}

class Dog extends Animal {
    public void markSound() {
        System.out.println("Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name :");
        String name = scan.nextLine();

        System.out.println("Enter age :");
        int age = scan.nextInt();

        Dog myDog = new Dog();

        myDog.name = name;

        myDog.age = age;

        System.out.println("-----------------Dog----------------");
        myDog.markSound();

        myDog.display();

    }
}
