import java.util.Scanner;

public class SayHelloNameAndLast {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        String name = "Bart";
        String lastName = "Simpson";
        System.out.println("Enter your first name and last name: ");
        name = keyboard.next();
        lastName = keyboard.next();
        keyboard.nextLine();

        System.out.println(helloNameEng(name, lastName));
        System.out.println(helloNameFren(name, lastName));
        System.out.println(helloNameTwi(name, lastName));
        System.out.println(helloNameAfaa(name, lastName));
    }

    // english
    public static String helloNameEng(String name, String lastName) {

        String helloString;
        String nameString;
        String lastNameString;

        helloString = "Hello, " + name + " " + lastName+ "!\n";
        nameString  = "Your first name: " + name +"\n";
        lastNameString = "Your last name: " + lastName + "\n";
        return helloString + nameString + lastNameString;
    }
    //french
    public static String helloNameFren(String name, String lastName) {
        String helloString;
        String nameString;
        String lastNameString;

        helloString = "Bonjour, " + name + " " + lastName+ "!\n";
        nameString  = "Votre prenom: " + name +"\n";
        lastNameString = "Votre nom: " + lastName + "\n";
        return helloString + nameString + lastNameString;
    }
    //twi
    public static String helloNameTwi(String name, String lastName) {
        String helloString;
        String nameString;
        String lastNameString;

        helloString = "Mahai, " + name + " " + lastName+ "!\n";
        nameString  = "Wo din: " + name +"\n";
        lastNameString = "Wo papa din: " + lastName + "\n";
        return helloString + nameString + lastNameString;
    }
    //Afaanoromo
    public static String helloNameAfaa(String name, String lastName) {
        String helloString;
        String nameString;
        String lastNameString;

        helloString = "afaanoromo, " + name + " " + lastName+ "!\n";
        nameString  = "Maqaankee: " + name +"\n";
        lastNameString = "Maquaa akaaka keti: " + lastName + "\n";
        return helloString + nameString + lastNameString;
    }


}
