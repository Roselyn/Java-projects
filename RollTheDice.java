package chapter4;

import java.util.Random;

public class RollTheDice {

    public static void main(String args[]) {

        int space = 0;

        for (int i = 1; i <= 5; i++) {

            Random random = new Random();
            int dice = random.nextInt(6) + 1;

            space = space + dice;

            int toGo = 20 - space;

            if (!(space > 20) || (space < 20 && i == 5)) {
                System.out.println("Roll #" + (i) + ": You've rolled a " + dice + ". You are now on space " + space + " and have " + toGo + " more to go");
            }
                    if (space == 20) {
                        System.out.println("Congrats! You've won!");
                        break;
                    }
                    else if ((space > 20) || (space < 20 && i == 5)) {
                        System.out.println("You've rolled a " + dice + ". You've lost!");
                        break;
                }
            }
        }
    }


