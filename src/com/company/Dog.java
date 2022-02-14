package com.company;

public class Dog {
    private String nameOfDog;
    private int howOld;
    private String breedOfDog;

    //setting method for name
    public void setNameOfDog(String name){
        nameOfDog = name;
    }

    //getter method for name
    public String getNameOfDog() {

        return nameOfDog;
    }


    //setting method for age
    public void setHowOld(int age) {

        howOld = age;
    }
    //getter method for age
    public int getHowOld() {

        return howOld;
    }


    //setting method for breed
    public void setBreedOfDog(String breed) {

        breedOfDog= breed;
    }
    //getter method for breed
    public String getBreedOfDog() {

        return breedOfDog;
    }
}
