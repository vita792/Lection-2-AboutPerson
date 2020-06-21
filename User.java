package com.company.user;


import pack2.User1;
import java.util.Scanner;
class User {
    public static void main(String[] args) {
        User1 person1 = new User1("Ihor", "Chop", 28, 175, 69.5);
        User1 person2 = new User1();

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.height);
        System.out.println(person1.weight);
        System.out.println("\f");
        person1.printUserFilds();
        person2.printUserFilds();
        person1.bodyIndex();
        person2.bodyIndex();
        System.out.println("\f");

        if ((person1.bodyIndex()) == (person2.bodyIndex())) {
            System.out.println("They have equal weight index!");
        } else if (person1.bodyIndex() > person2.bodyIndex()) {
            System.out.println("The First Person has bigger weight index!");
        } else if (person1.bodyIndex() < person2.bodyIndex()) {
            System.out.println("The Second Person has bigger weight index!");
        }
    }
}


