package homework.poker;

public class Card {
    public String suit;
    public String num;

    public Card(String suit,String num){
        this.suit = suit;
        this.num = num;
    }

    @Override
    public String toString() {
        return "{" + this.suit + this.num +                '}';
    }
}
