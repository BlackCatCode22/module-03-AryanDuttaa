package Myanimals;

public class Animal {
    private static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        System.out.println("Animal created. Number of animals: " + numOfAnimals);
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}
