import java.util.Scanner;

public class tempConverter {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeat = true;

        while (repeat) {
            System.out.println("** Welcome to the Temperature Converter! **");
            System.out.println(
                    "1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius \n3. Celsius to Kelvin \n4. Kelvin to Celsius \n5. Fahrenheit to Kelvin \n6. Kelvin to Fahrenheit \n Choose a conversion:");

            int userAnswer = input.nextInt();

            System.out.println("Enter the temperature: ");
            double temp = input.nextDouble();

            switch (userAnswer) {
                case 1:
                    System.out.format(
                            temp + " Celsius is %.3f Fahrenheit", celsiusToFahrenheit(temp));
                    break;
                case 2:
                    System.out.format(
                            temp + " Fahrenheit is %.3f Celsius", +fahrenheitToCelsius(temp));
                    break;
                case 3:
                    System.out.format(temp + " Celsius is %.3f Kelvin", +celsiusToKelvin(temp));
                    break;
                case 4:
                    System.out.format(temp + " Kelvin is %.3f Celsius", +kelvinToCelsius(temp));
                    break;
                case 5:
                    System.out.format(
                            temp + " Fahrenheit is %.3f Kelvin", +fahrenheitToKelvin(temp));
                    break;
                case 6:
                    System.out.format(
                            temp + " Kelvin is %.3f Fahrenheit", +kelvinToFahrenheit(temp));
                    break;
            }
            System.out.println();
            repeat = repeatTemp();
        }
        input.close();
    }

    public static double celsiusToFahrenheit(double temp) {
        return (temp * (9.0 / 5)) + 32;
    }

    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32) * (5.0 / 9);
    }

    public static double celsiusToKelvin(double temp) {
        return temp + 273.15;
    }

    public static double kelvinToCelsius(double temp) {
        return temp - 273.15;
    }

    public static double fahrenheitToKelvin(double temp) {
        return (temp - 32) * (5.0 / 9.0) + 273.15;
    }

    public static double kelvinToFahrenheit(double temp) {
        return (temp - 273.15) * 9.0 / 5 + 32;
    }

    public static boolean repeatTemp() {
        System.out.print("Would you like to do another conversion (Y/N)? ");
        String userRepeat = input.next();
        return userRepeat.equalsIgnoreCase("Y");
    }
}
