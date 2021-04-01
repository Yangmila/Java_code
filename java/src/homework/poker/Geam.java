package homework.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Geam {
    public static final String[] suits = {"♥","♣","♦","♠"};

    private static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();

        for(int i = 0;i < 4;i++){
            for(int j = 2;j < 11;j++){
                poker.add(new Card(suits[i],""+j));
            }
            poker.add(new Card(suits[i],"J"));
            poker.add(new Card(suits[i],"Q"));
            poker.add(new Card(suits[i],"K"));
            poker.add(new Card(suits[i],"A"));
        }
        poker.add(new Card("","rad Joker"));
        poker.add(new Card("","black Joker"));
        return poker;
    }

    public static void main(String[] args) {
        List<Card> poker = buyPoker();
        Collections.shuffle(poker);
        System.out.println(poker);
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                Card top = poker.remove(0);
                List<Card> player = players.get(j);
                player.add(top);
            }
        }
        for (int i = 0; i < players.size(); i++) {
            List<Card> player = players.get(i);
            int a = i+1;
            System.out.println("玩家" + a + " 的手牌是: " + player);
        }
    }
}
