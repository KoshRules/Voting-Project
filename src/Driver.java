//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author Christopher Daniel Wilson
 * @version 0.1
 * @since 16 Nov 2020 - Present
 *
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Driver
{


    /**
     * Voting Online System itself
     * Login Area; Identification Process; other government agencys
     * Areas to Vote In
     *      Voting in People; Elected Federal/State/Local Officials
     *      Voting on Bills;
     *      Voting on Laws;
     * Security
     */


    private Scanner input = new Scanner(System.in);
    //private ArrayList<> ;

    public static void main(String [] args) {}

    /**
     * Driver Constructor
     */
    public Driver()
    {
        runMenu();
    }

    private int mainMenu()
    {
        System.out.println("Neo Voting System Menu");
        System.out.println("-------------------------");
        System.out.println(" 1) Enter User Details");
        System.out.println(" 2) Registration");
        System.out.println("-------------------------");
        System.out.println(" 3) Areas to vote in");
        System.out.println("Voting Menu");
        System.out.println(" 1) Voting in People)");
        System.out.println("SubMenu");
        System.out.println(" 1a) Elected Federal Officials");
        System.out.println(" 1b) Elected State Officials");
        System.out.println(" 1c) Elected Local Officials");
        System.out.println(" 2) Voting on Bills)");
        System.out.println("SubMenu");
        System.out.println("");
        System.out.println(" 3) Voting on Laws");
        System.out.println("SubMenu");
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("  #) Save to XML");
        System.out.println("  #) Load from XML");
        System.out.println("-------------------------");
        System.out.println(" 0) Exit");
        System.out.println("===>> ");
        System.out.println();
        int option = input.nextInt();
        return option;
    }

    private void runMenu() {
        int option = mainMenu();
        while (option != 0) {
            switch (option) {
                case 1:
                    break;
                case 2:
                    try {
                        //.save();
                    } catch (Exception e) {
                        System.out.println("Error Writing from file: " + e);
                    }
                    break;
                case 3:
                    try {
                        //.load();
                    } catch (Exception e) {
                        System.out.println("Error Reading to file: " + e);
                    }
                    break;

                default:
                    System.out.println("Invalid option entered: " + option);
                    break;
            }
            System.out.println("\nPress any key to continue...");
            input.nextLine();
            option = mainMenu();
        }
        System.out.println("Exiting... bye");
        System.exit(0);
    }

    /**
     * Other Government Agencys
     *      Links to validate registration process through: DMV, DPS, IRS, FBI, ???
     */


    /** Areas to vote in
     *  Voting in People
     *      Federal; President, Senator, Congressional Rep, House Representative
     *      State; Governor, Lt Governor, Treasurer, Superintendent of Public Instruction, Agriculture Commish,
     *              Insurance Commish, Labor Commish, Tax Commish, Mine Inspector, State Executive
     *      Local; Mayor, County Executive, City Officials, Town Officials,
     */


    /** Option 1
     *
     */

    //TODO
    /*
        public void save?? ()
        {
            XStream xstream = new XStream(new DomDriver());
            ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("??.xml"));
            out.writeObject(??);
            out.close();
        }

        //option 21
        //Method;
        private void load?? ()
        {
            XStream xstream = new XStream(new DomDriver());
            ObjectInputStream is = xstream.createObjectInputStream(new FileReader("??.xml"));
            ?? = (ArrayList<??>) is.readObject();
            is.close();
        }

     */
}
