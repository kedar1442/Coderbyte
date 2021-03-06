import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/* I wrote this program for
 highest blackjack calculation */

public class BlackjackHighest {
    String BlackjackHighest(String[] strArr) {
        Card[] cards = new Card[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            cards[i] = new Card(strArr[i]);
        }

        Arrays.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card card, Card card2) {
                if (card.rating > card2.rating) return 1;
                else if (card.rating < card2.rating) return -1;
                return 0;
            }
        });

        int total = 0;
        boolean hasAce = false, aceUsed = false;
        for (Card card : cards) {
            if (card.rating == 14) {
                hasAce = true;
            }

            if (total + card.topVal > 21) {
                total += card.lowVal;
            } else {
                if (card.rating == 14) {
                    aceUsed = true;
                }
                total += card.topVal;
            }
        }

        Card highest = cards[cards.length - 1];
        if (hasAce && !aceUsed) {
            highest = cards[cards.length - 2];
        }

        if (total < 21) {
            return "below " + highest.repr;
        } else if (total == 21) {
            return "blackjack " + highest.repr;
        }
        return "above " + highest.repr;
    }

    class Card {
        int lowVal = 0, topVal = 0, rating = 0;
        String repr;

        Card(String card) {
            card = card.toLowerCase();
            repr = card;
		
	  /*  now we'll calculate cards values
	    its top, low value and ratings */

            if (card.equals("two")) {
                lowVal = 2; topVal = 2; rating = 2;
            } else if (card.equals("three")) {
                lowVal = 3; topVal = 3; rating = 3;
            } else if (card.equals("four")) {
                lowVal = 4; topVal = 4; rating = 4;
            }  else if (card.equals("five")) {
                lowVal = 5; topVal = 5; rating = 5;
            } else if (card.equals("six")) {
                lowVal = 6; topVal = 6; rating = 6;
            } else if (card.equals("seven")) {
                lowVal = 7; topVal = 7; rating = 7;
            } else if (card.equals("eight")) {
                lowVal = 8; topVal = 8; rating = 8;
            } else if (card.equals("nine")) {
                lowVal = 9; topVal = 9; rating = 9;
            } else if (card.equals("ten")) {
                lowVal = 10; topVal = 10; rating = 10;
            } else if (card.equals("jack")) {
                lowVal = 10; topVal = 10; rating = 11;
            } else if (card.equals("queen")) {
                lowVal = 10; topVal = 10; rating = 12;
            } else if (card.equals("king")) {
                lowVal = 10; topVal = 10; rating = 13;
            } else if (card.equals("ace")) {
                lowVal = 1; topVal = 11; rating = 14;
            }
        }
    }

    public static void main (String[] args) {       
        Scanner s = new Scanner(System.in);
        BlackjackHighest c = new BlackjackHighest();
       // You can give your input from here
        System.out.print(c.BlackjackHighest(new String[] {"jack","ace"}));
    }
}