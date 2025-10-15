import java.util.Random;
import java.util.Scanner;

public class Chapter1_challenge_1_3 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int health = 100;
        int totalRooms = 5;

        System.out.println("🏰 Welcome to the Dungeon Game!");
        System.out.println("You start your adventure with " + health + " health.\n");

        // Loop through 5 rooms
        for (int room = 1; room <= totalRooms; room++) {
            System.out.println("Entering room " + room + "...");
            int event = rand.nextInt(3) + 1; // random number 1–3

            switch (event) {
                case 1: 
                    System.out.println("A trap sprung! You lost 20 health!");
                    health -= 20;
                    System.out.println("Health is now " + health + ".");
                    break;

                case 2:
                    System.out.println("You found a healing potion! You gain 15 health.");
                    health += 15;
                    if (health > 100) {
                        System.out.println("Health exceeded 100 -> capped to 100.");
                        health = 100;
                    } else {
                        System.out.println("Health is now " + health + ".");
                    }
                    break;

                case 3: 
                    System.out.println("A monster appears! Guess a number (1-5) to defeat it!");
                    int monsterNumber = rand.nextInt(5) + 1;
                    int guess;

                    do {
                        System.out.print("Enter your guess: ");
                        guess = input.nextInt();

                        if (guess != monsterNumber) {
                            System.out.println("Wrong! Try again.");
                        }
                    } while (guess != monsterNumber);

                    System.out.println("You defeated the monster!");
                    break;
            }

            
            if (health <= 0) {
                System.out.println("\n💀 You have been defeated in room " + room + ".");
                break;
            }

            System.out.println(); 
        }

        
        if (health > 0) {
            System.out.println("🎉 You cleared the dungeon! Victorious with " + health + " health!");
        }

        input.close();
    }
}
       
    
    

