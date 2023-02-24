import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Cabin{
    public static Scanner input = new Scanner(System.in);
    public static String[] CABIN = new String[12];
    public static ArrayList<String> waitingList = new ArrayList<String>();
    public static int expense = 100;
    public static String empty = "Empty";








    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Cruise Ship Boarding....");
        System.out.println("Menu will be displayed now....");
        System.out.println(" ");
        System.out.println(" ");
        eCabin();
        menu();
    }

    public static void menu() throws IOException {

        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Enter 'A' to add customer to the cabin: ");
            System.out.println("Enter ‘V’ to view all cabins: ");
            System.out.println("Enter 'E' to view empty cabins: ");
            System.out.println("Enter 'D' to delete a customer from the cabin: ");
            System.out.println("Enter 'F' to find a customer from a cabin: ");
            System.out.println("Enter 'S' to store the data to a file: ");
            System.out.println("Enter 'L' to load the data from the file: ");
            System.out.println("Enter 'O' to view the passengers in the alphabetical order: ");
            System.out.println("Enter 'T' to view the expenses per passenger: ");
            System.out.println("Enter 'Q' to quit the program: ");

            System.out.println(" ");
            System.out.print("Enter the option you want: ");
            String option = input.next();

            switch (option) {
                case "A":
                    addCustomer();
                    break;
                case "V":
                    viewCabins();
                    break;
                case "E":
                    emptyCabins();
                    break;
                case "D":
                    deleteCustomer();
                    break;
                case "F":
                    findCustomer();
                    break;
                case "S":
                    storeProgram();
                    break;
                case "L":
                    loadProgram();
                    break;
                case "O":
                    orderCustomer();
                    break;
                case "T":
                    viewExpenses();
                    break;
                case "Q":
                    System.out.println("Thank you for using this program .. :)))");
                    break;
            }
        }while (!input.equals("Q")) ;
    }

    public static void addCustomer() throws IOException {
        for(int i = 0; i< CABIN.length; i++){
            if (CABIN[i] == "Empty"){
                System.out.println("Enter your First Name: ");
                String firstName = input.next();
                System.out.println("Enter your SurName: ");
                String surName = input.next();
                System.out.println("Enter the no.Of days you will be staying (1 Days = $100): ");
                int days = input.nextInt();
                int totalExpenses = days * expense;

                CABIN[i] = firstName + " " + surName + " " + totalExpenses;

                System.out.println("Customer successfully added.. :))");
                break;
            }

            else {
                System.out.println("We are very sorry to inform you that the cabins are full right now..");
                System.out.println("Do not worry, you will be added to waiting room. Once the cabins get freed, you will be added immediately.");

                System.out.println("Enter your First Name: ");
                String firstName = input.next();
                System.out.println("Enter your SurName: ");
                String surName = input.next();
                System.out.println("Enter the no.Of days you will be staying (1 Days = $100): ");
                int days = input.nextInt();
                int totalExpenses = days * expense;

                waitingList.add(firstName + " " + surName + " " + totalExpenses);

                System.out.println("Customer successfully added to the waiting list.. :))");
            }

        }

    }

    public static void viewCabins(){
        for(int i = 0; i< CABIN.length; i++){
            System.out.println("Cabin: " + i + "-" + CABIN[i]);
        }
    }

    public static void emptyCabins() throws IOException {
        for(int i = 0; i< CABIN.length; i++){
            if(CABIN[i].equals("Empty")){
                System.out.println("Cabin: " + i + " is free");
            }

        }


    }

    public static void deleteCustomer() throws IOException {
        System.out.println("Enter the first name of the customer you want to delete: ");
        String firsName = input.next();
        System.out.println("Enter the surName of the customer you want to delete: ");
        String surName = input.next();


        for(int i = 0; i< CABIN.length; i++){
            if(CABIN[i].contains(firsName) && CABIN[i].contains(surName)){
                CABIN[i] = "Empty";
                System.out.println(" Mr/Mrs: " + firsName + " from Cabin No: " + i + " has been successfully deleted.");
                break;
            }
            else{
                System.out.println("The customer you want to delete is not available in any of the cabins.. :((");
                break;
            }
        }

    }

    public static void findCustomer() throws IOException {
        System.out.println("Enter the first name of the customer you want to find: ");
        String firsName = input.next();
        System.out.println("Enter the surName of the customer you want to find: ");
        String surName = input.next();


        for(int i = 0; i< CABIN.length; i++){
            if(CABIN[i].contains(firsName) && CABIN[i].contains(surName)){
                System.out.println("Mr/Mrs: " + firsName + " " + surName + " is in cabin no: " + i);
                break;
            }
            else{
                System.out.println("Mr/Mrs: " + firsName + " doesn't exist in the cabin.. :((");
                break;
            }
        }

    }

    public static void storeProgram() throws IOException {
        try {

            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(
                    "Cabin.txt");

            // Writing into file
            // Note: The content taken above inside the
            // string
            for(int i = 0; i< CABIN.length; i++){
                fWriter.write("Cabin: " + i + "-" + CABIN[i] + "\n");
            }



            // Closing the file writing connection
            fWriter.close();

            // Display message for successful execution of
            // program on the console
            System.out.println("File is created successfully with the content.");
        }

        // Catch block to handle if exception occurs
        catch (IOException e) {
            // Print the exception
            System.out.print(e.getMessage());
        }


    }

    public static void loadProgram() throws IOException {
        FileReader fr = new FileReader(
                "Cabin.txt");

        // Declaring loop variable
        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)

            // Print all the content of a file
            System.out.print((char)i);


    }

    public static void orderCustomer() throws IOException {
        for(int i = 0; i<CABIN.length; i++)
        {
            for(int j =  i + 1; j <CABIN.length; j++)
            {
                if(CABIN[i].compareTo(CABIN[j]) > 0)
                {
                    String temp = CABIN[i];
                    CABIN[i] = CABIN[j];
                    CABIN[j] = temp;
                }
            }
        }
        System.out.println("This is the names after sorting out....");
        for(int x = 0; x < 12; x++)
        {
            System.out.println(x + ":" + CABIN[x] );
        }

    }

    public static void viewExpenses() throws IOException {
        for(int i = 0; i<CABIN.length; i++){
            System.out.println(CABIN[i]);
        }

    }

    public static void eCabin(){
        for(int i = 0; i< CABIN.length; i++){
            CABIN[i] = "Empty";
        }
    }

}
