package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// задача 1
        byte apples = 123;
        short balls = 1234;
        int coins = 123456;
        long dollars = 123_456_789L;
        double grams = 1.23;
        float pi = 3.14f;
        char sign = 36;
        boolean check = apples < 100;
        System.out.println(check);

        // задача2 2
        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;
        double weightSum = boxer1Weight+boxer2Weight;
        double weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("The boxers weight sum is: " + weightSum + "kg.");
        System.out.println("The boxers weight difference is: " + weightDifference + "kg.");

        //задача 3
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int weightGr = bananas + milk + iceCream + eggs;
        float weightKg = weightGr/1000f;
        System.out.println("The total weight in grams is: " + weightGr);
        System.out.println("Total food weight in kg is: " + weightKg);

        //задача 4
        int kgToLoose = 7;
        int gramsToLoose = kgToLoose * 1000;
        int minLossGrams = 250; // за день
        int maxLossGrams = 500; // за день
        int daysAtMinLoss = gramsToLoose/minLossGrams;
        int daysAtMaxLoss = gramsToLoose/maxLossGrams;
        int averageDays = (daysAtMinLoss + daysAtMaxLoss) / 2;
        System.out.println("Days loosing 250 grams-per-day: " + daysAtMinLoss);
        System.out.println("Days loosing 500 grams-per-day: " + daysAtMaxLoss);
        System.out.println("Average days is: " + averageDays);

        //задача 5
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        float mashaIncrease = masha * 0.1f; //10% = 0.1
        float denisIncrease = denis * 0.1f; //10% = 0.1
        float christinaIncrease = christina * 0.1f; //10% = 0.1
        System.out.println("Masha's wage is: " + (masha + mashaIncrease) + " roubles. " +
                "The year increase is: " + (mashaIncrease * 12) + " roubles." );
        System.out.println("Denis' wage is: " + (denis + denisIncrease) + " roubles. " +
                "The year increase is: " + (denisIncrease * 12) + " roubles." );
        System.out.println("Christina's wage is: " + (christina + christinaIncrease) + " roubles. " +
                "The year increase is: " + (christinaIncrease * 12) + " roubles." );









    }
}

