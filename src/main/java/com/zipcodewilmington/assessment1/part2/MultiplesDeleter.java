package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int counter = 0;
        Integer[] keepthese = new Integer[ints.length];

        for (int i = 0; i < ints.length; i++){
            if(ints[i] % 2 != 0){
                keepthese[i - counter] = ints[i];
            }
            else{
                counter++;
            }
        }
        Integer[] result = new Integer[ints.length - counter];

        for(int j = 0; j < result.length; j++){
            result[j] = keepthese[j];
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int counter = 0;
        Integer[] keepthese = new Integer[ints.length];

        for (int i = 0; i < ints.length; i++){
            if(ints[i] % 2 == 0){
                keepthese[i - counter] = ints[i];
            }
            else{
                counter++;
            }
        }
        Integer[] result = new Integer[ints.length - counter];

        for(int j = 0; j < result.length; j++){
            result[j] = keepthese[j];
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        int counter = 0;
        Integer[] keepthese = new Integer[ints.length];

        for (int i = 0; i < ints.length; i++){
            if(ints[i] % 3 != 0){
                keepthese[i - counter] = ints[i];
            }
            else{
                counter++;
            }
        }
        Integer[] result = new Integer[ints.length - counter];

        for(int j = 0; j < result.length; j++){
            result[j] = keepthese[j];
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        int counter = 0;
        Integer[] keepthese = new Integer[ints.length];

        for (int i = 0; i < ints.length; i++){
            if(ints[i] % multiple != 0){
                keepthese[i - counter] = ints[i];
            }
            else{
                counter++;
            }
        }
        Integer[] result = new Integer[ints.length - counter];

        for(int j = 0; j < result.length; j++){
            result[j] = keepthese[j];
        }
        return result;
    }
}
