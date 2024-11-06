import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Continue serving method selection menu
        // until "Exit" option is selected
        int selection;
        do {
            System.out.print(
                    "\nMethod Selection Menu\n" +
                            "=======================\n" +
                            "1. Temperature Conversion (Fahrenheit to Celsius)\n" +
                            "2. Distance Conversion (Yards to Feet and Inches)\n" +
                            "3. Get Acronym\n" +
                            "4. Triangle Generator\n" +
                            "5. Exit\n" +
                            "=======================\n" +
                            "Enter selection (1-5): ");
            try {
                selection = Integer.parseInt(scnr.next());
            } catch(NumberFormatException ex) {
                selection = 0;
            }
            switch (selection) {
                case 1:
                    doTempConversion(scnr);
                    break;
                case 2:
                    doDistConversion(scnr);
                    break;
                case 3:
                    // flush input buffer
                    if (scnr.hasNextLine())
                        scnr.nextLine();

                    doGetAcronym(scnr);
                    break;
                case 4:
                    doTriangle(scnr);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error: Invalid option");
            }
        } while (selection != 5);
        scnr.close();
    }

    public static void doTempConversion(Scanner scnr) {
        // TODO: Remove placeholder message
        System.out.println("Not yet implemented.");

        // Below this comment: declare any other variables you may need
        // to store the user's input and the Celsius equivalent value

        // Below this comment: prompt the user to enter the required input(s)

        // Below this comment: collect the required input(s) from the user

        // Below this comment: call your fahrenheitToCelsius method

        // Below this comment: display the required results
    }

    // define your fahrenheitToCelsius method here below

    public static void doDistConversion(Scanner scnr) {
        // TODO: Remove placeholder message
        System.out.println("Not yet implemented.");

        // Below this comment: declare any other variables you may need
        // to store the user's input and the Feet and Inches equivalent value

        // Below this comment: collect the required inputs

        // Below this comment: call your yardsToFeetAndInches method

        // Below this comment: disply the required results
    }

    // define your yardsToFeetAndInches method here below

    public static void doGetAcronym(Scanner scnr) {
        // TODO: Remove placeholder message
        System.out.println("Not yet implemented.");

        // Below this comment: declare and instantiate a Scanner

        // Below this comment: declare any other variables you may need

        // Below this comment: collect the required inputs

        // Below this comment: call your required method

        // Below this comment: disply the required results
    }

    // define your getAcronym method here below

    public static void doTriangle(Scanner scnr) {
        // TODO: Remove placeholder message
        System.out.println("Not yet implemented.");

        // Below this comment: declare any other variables you may need

        // Below this comment: collect the required inputs

        // Below this comment: display the required results
    }

}