package CrackingTheCode;/**
 * Created by Ahmed Samir on 4/14/17.
 */

import java.util.*;

public class Sorting_Comparator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            players.add(new Player(in.next(), in.nextInt()));
        }
        Collections.sort(players, new ComparatorId());
        for (Player p :
                players) {
            System.out.println(p.name + " " + p.score);
        }
    }

    static class Player {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }


    }

    static class ComparatorId implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score != o2.score)
                return -1 * Integer.valueOf(o1.score).compareTo(Integer.valueOf(o2.score));
            else
                return o1.name.compareTo(o2.name);
        }
    }

}
