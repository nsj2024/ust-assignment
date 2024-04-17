package com.assignment.abstractclass;

abstract class Animal1 {
    abstract void eat();
    abstract void sleep();
}

class Lion1 extends Animal1 {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps on rocks");
    }
}

class Tiger1 extends Animal1 {
    @Override
    void eat() {
        System.out.println("Tiger eats flesh");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in caves");
    }
}

class Deer extends Animal1 {
    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps under trees");
    }
}

public class AssignmentFour {
    public static void main(String[] args) {
        Lion1 lion = new Lion1();
        lion.eat();
        lion.sleep();

        Tiger1 tiger = new Tiger1();
        tiger.eat();
        tiger.sleep();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
