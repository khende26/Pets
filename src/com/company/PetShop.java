package com.company;

public class PetShop {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.setNameOfDog("Sparky");
        myDog.setHowOld(2);
        myDog.setBreedOfDog("Lab");
        myCat.setnameofCat("Sleepy");
        myCat.setHowOld(4);
        myCat.setBreedOfCat("Tabby");


        System.out.println("We have the following animals available: " +
                "A dog name " +myDog.getNameOfDog() + ", " + myDog.getHowOld() + " years old, " + myDog.getBreedOfDog() +
                " and a Cat named " +myCat.getNameofCat() + " years old, " + myCat.getHowOld() + ", " + myCat.getBreedOfCat()); }
}
