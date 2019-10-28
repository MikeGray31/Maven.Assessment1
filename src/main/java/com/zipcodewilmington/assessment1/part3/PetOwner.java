package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    String ownerName;
    Pet[] ownedpets;
    public PetOwner(String name, Pet... pets) {
        ownerName = name;
        ownedpets = pets;
        if(pets != null) {
            for (Pet s : ownedpets) {
                s.myOwner = this;

            }
        }

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.myOwner = this;
        Pet[] newOwnedPets;
        if(ownedpets != null) {
             newOwnedPets = new Pet[ownedpets.length + 1];
        }
        else{
            newOwnedPets = new Pet[1];
        }
        newOwnedPets[0] = pet;
        pet.setOwner(this);
        for(int i = 1; i < newOwnedPets.length; i++){
            newOwnedPets[i]=ownedpets[i - 1];
        }
        ownedpets = newOwnedPets;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet[] newOwnedPets = new Pet[ownedpets.length - 1];
        if(newOwnedPets != null){
            for (int i = 0; i < ownedpets.length; i++) {
                if (ownedpets[i] == pet) {
                    ownedpets[i] = null;
                }
            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(int i = 0; i < ownedpets.length; i++){
            if(ownedpets[i] == pet){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = Integer.MAX_VALUE;
        for(int i = 0; i < ownedpets.length; i++) {
            if(ownedpets[i].getAge() < youngest){
                youngest = ownedpets[i].getAge();
            }
        }        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = 0;
        for(int i = 0; i < ownedpets.length; i++) {
            if(ownedpets[i].getAge() > oldest){
                oldest = ownedpets[i].getAge();
            }
        }        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;

        for(int i = 0; i < ownedpets.length; i++) {
            sum += ownedpets[i].getAge();
        }
        return sum / (float) ownedpets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return ownedpets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return ownedpets;
    }
}
