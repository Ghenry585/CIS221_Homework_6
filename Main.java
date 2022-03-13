/*
 * Gary Henry
 * CIS221
 * 3/13/2022
 * Tuesdays and Thrusdays (2:10pm to 4:00pm)
 * Professor: Mr.Swinarski
 * CIS221 Homework_6
 */

abstract class Cat { // create abstract class Cat
    public abstract void catSound(); // empty abstract method for cat

    public static String action(String actions) { // static action method
        return actions;
    };
}

class CatCat extends Cat { // CatCat method, fills out catSound method and changes value for static actions
                           // method
    public void catSound() {
        System.out.println("Meow, I'm a cat! " + action("Im scratching up the couch!"));

    }
}

class CatTiger extends Cat { // CatTiger method, fills out catSound method and changes value for static
                             // actions method
    public void catSound() {
        System.out.println("Roar!! I'm a tiger! " + action("Im jumping from couch to you!"));

    }
}

public class Main { // Main Class
    public static void main(String[] args) { // main method
        CatCat cat = new CatCat(); // create object of CatCat class that extends the cat class
        CatTiger tiger = new CatTiger(); // create object of CatTiger class that extends the cat class

        cat.catSound();
        tiger.catSound();

    }
}