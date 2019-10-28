package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    PetOwner myOwner;
    String namePet;
    int agePet;

    public Pet() {
        namePet = "Pet name";
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        namePet = name;
        agePet = 0;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        namePet = "Pet name";
        agePet = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        namePet = name;
        agePet = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return namePet;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return agePet;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        myOwner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return myOwner;
    }
}
