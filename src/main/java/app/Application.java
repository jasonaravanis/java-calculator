package app;

public class Application {
    /*
    * The application has a calculator class which takes in input parameters and returns  calculated values
    *
    * The application has a UserInputRetriever which handles retrieving user input
    *
    * The application starts by initialising a Calculator and a UserInputRetriever
    * The UIR will pause execution until the user enters something via the CLI
    *
    * The UIR has no awareness of what needs to be inputted. It just waits to receive and pass on some input
    *
    *
    *
    *  */

    public static void main(String[] args) {
        Double inputA = UserInputRetriever.getDoubleFromUser();
        Double inputB = UserInputRetriever.getDoubleFromUser();
        System.out.println("input A is: " + inputA);
        System.out.println("input B is: " + inputB);
    }

}