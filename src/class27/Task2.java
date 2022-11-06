package class27;

import java.util.LinkedList;

public class Task2 {
    /* Create a Card class that will have interest and rate field and type
       and a constructor that will initialize the fields.
       Create 3 objects of different card and store them into LinkedList.
       Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Card(10,"Credit Card"));
        cards.add(new Card(15,"Credit Card"));
        cards.add(new Card(20,"credit card"));
        for (Card card:cards
             ) {
            System.out.println(card.toString());
        }
    }
}
class Card{
    double interestRate;
    String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "interestRate=" + interestRate +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}