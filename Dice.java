import java.util.ArrayList;
import java.util.Random;

/**
 * Created by moradm on 2016-11-13.
 */
public class Dice {
    public static void main(String[] args){

        //int n = 0;
        //while(n < 100){
        //roll();
           // System.out.print(n + ": ");
           // System.out.println(roll()+ " " );
          //  n++;

        //}
        int n = 0;
        while(n < 60) {
            System.out.println("4: " + DoDO(4));
            n++;
        }
    }


    public static int roll(){


        int[] dice = {1, 2, 3, 4, 5, 6};
        Random r = new Random();
        int toss = r.nextInt(dice.length);
        return dice[toss];

    }
    public static int DoDO(int block){

        //int[] dice = {1, 2, 3, 4, 5, 6};
        //int[] newDice = new int[5];
        ArrayList<Integer> newDice = new ArrayList<>();

        for (int n=0; n<=5; n = n + 1){
            if((n + 1) != block)
                newDice.add(n+1);
        }
        Random r = new Random();
        int toss = r.nextInt(newDice.size());


        return newDice.get(toss);

    }
}
