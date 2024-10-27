import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double height;
        double weight;
        double bmi;
        System.out.println("Enter your weight in kg");
        weight = sc.nextDouble();
        System.out.println("enter your height in meters");
        height = sc.nextDouble();
        bmi = weight / (height * height);
        System.out.println("your bmi is " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are normal weight");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("You are obese");
        }
    }
}