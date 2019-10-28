package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        namePet = name;
        agePet = age;

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        namePet = "Dog name";
        agePet = age;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        namePet = name;
        agePet = 0;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        namePet = "Dog name";
        agePet = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
