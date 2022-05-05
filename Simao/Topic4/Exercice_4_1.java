import java.util.Scanner;

public class Exercice_4_1 {
    public static void main(String[] args) {
        System.out.println("How many cars are in traffic jam?");
        Scanner scanner = new Scanner(System.in);
        int numberCars = scanner.nextInt();
        int peopleCar = 2;

        // fill with the people age
            double all_total = 0;
        for(int i=0; i < numberCars; i++){

                double total = 0;
            for(int j=0; j< peopleCar; j++){
                System.out.println("Enter the age of people #" + (j +1));
                double age = scanner.nextDouble();
                total = total + age;
                all_total = all_total +age;

            }
            double average = total/peopleCar;
            System.out.println("The age average in car #"+(i+1)+ " is " + average+"\n");

        }

        double avrg_total = (all_total)/(numberCars * 2);
        System.out.println(avrg_total);

        scanner.close();

    }
}
