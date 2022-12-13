package katas.kata2;

abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}

class Dog extends Animal {
    Dog(String name){
        super(name);
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}

class Application {

    static String getAnimalName(Animal a){
        return a.getName();
    }
}
public class Kata2 {
    public static void main(String[] args) {
        Dog smokey = new Dog("Smokey");
        Cat floky = new Cat("Floky");

        System.out.println(Application.getAnimalName(smokey));
        System.out.println(Application.getAnimalName(floky));
    }


}
