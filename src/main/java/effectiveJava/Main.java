package effectiveJava;

import effectiveJava.ch1.NutritionFacts;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(3, 5).fat(30).calories(58).build();
        System.out.println(nutritionFacts);
    }
}
