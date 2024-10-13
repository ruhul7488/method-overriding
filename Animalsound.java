class Animal{
    public void makesound(){
        System.out.println("Animal makes sound:");

    }
}

class Dog extends Animal{
    public void makesound(){
        System.out.println("The Dogs are Barks:");
    }
}

class Cat extends Animal{
    public void makesound(){
        System.out.println("The Cats are Meows:");

    }
}

public class Animalsound {
    public static void main(String[]a){

     Animal animal=new Animal();
     Dog dog =new Dog();
     Cat cat =new Cat();
     animal.makesound();
     dog.makesound();
     cat.makesound();

    }
    
}
