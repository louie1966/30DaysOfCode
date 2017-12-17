package cointoss;

import java.util.Random;

/**
 *
 * @author rened
 */
public class CoinToss {


    public String tossACoin() {
        Random rand = new Random();
        // Get random 0 or 1
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());

    }    
}
