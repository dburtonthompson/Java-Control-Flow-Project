package JavaProject;

import java.util.*;

public class ControlFlow {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Whats your name?");
        String userName = userInput.nextLine();

        System.out.println(String.format("Hello %s", userName));

        System.out.println("Would you like to continue? Enter 'Y' for Yes and 'N' for No");
        String answer = scan.next();

        switch (response) {
            case "Y":
                break;

            default:
                System.out.println("Thanks bye!");
                System.exit(0);

        }
        String playAgain;
        do {
            System.out.println("What is your lucky number?");
            int lucky = scan.nextInt();
            System.out.println("What is the name of your favorite pet? :  ");
            String pet = scan.next();
            System.out.println("what is the age of your favorite pet.");
            int petAge = scan.nextInt();
            System.out.println("Do you have a favorite quarterback?");
            String jersey = scan.next();

            int jerseyNum;
            switch (jersey) {
                case "Y":
                    System.out.println("What is their jersey number?");
                    jerseyNum = scan.nextInt();
                    break;
                case "N":
                    break;
                default:
                    break;
            }
            System.out.println("What is the two-digit model year of your car?  ");
            int modelYear = scan.nextInt();
            System.out.println("What is the first name of the your favorite actor or actress?  ");
            String act = scan.next();
            System.out.println("Enter a random number between 1 and 50:  ");
            int userRandomNum = scan.nextInt();

            Random rand = new Random();
            int upperbound = 76;
            int int_random = rand.nextInt(upperbound);
            int int_random1 = rand.nextInt(upperbound);
            int int_random2 = rand.nextInt(upperbound);

            int magicBall = (int_random * lucky);
            while (magicBall > 75) {
                magicBall = magicBall - 75;
            }
            System.out.println(magicBall);

            int favPetNum = pet.charAt(2);
            while (favPetNum > 65) {
                favPetNum = favPetNum - 65;
            }
            int value = 42;
            int random = userRandomNum - int_random1;

            if (random < 1) {
                random = random + 64;
            }
            int luckcar = lucky + modelYear;
            int lastnum = petAge + modelYear;
            System.out.println("Lottery Numbers: " + magicBall + ", " + favPetNum + ", " + value + ", " + random + ", "
                    + luckcar + " " + lastnum);
            System.out.println("Do you want to play again? :  ");
            playAgain = scan.next();

        } while (playAgain.equals("yes") || playAgain.equals("y"));
        System.out.print("Thanks for Playing!");
        System.exit(0);
    }

}