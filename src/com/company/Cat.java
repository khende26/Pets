package com.company;

public class Cat {
    private String nameOfCat;
    private int howOld;
    private String breedOfCat;

    //setting method for name
    public void setnameofCat(String name) {
        nameOfCat = name;
    }

    //getter method for name
    public String getNameofCat() {

        return nameOfCat;
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
    public void setBreedOfCat(String breed) {

        breedOfCat = breed;
    }
    //getter method for breed
    public String getBreedOfCat() {
        return breedOfCat;
    }
}
