package GeneralProgramming.Item58PreferForEachLoopsToTraditionalForLoops;

import java.util.*;

/**
 * Created by wangcheng  on 2018/4/12.
 */
// Can you spot the bug?
enum Suit { CLUB, DIAMOND, HEART, SPADE }
enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
    NINE, TEN, JACK, QUEEN, KING }
class Card{
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
public class Bug1 {
    public static void main(String[] args){
         Collection<Suit> suits = Arrays.asList(Suit.values());
         Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<>();
        for(Iterator<Suit> i = suits.iterator();i.hasNext();){
            for(Iterator<Rank> j = ranks.iterator();j.hasNext();){
                //The problem is that the next method is called too many times on the
                //iterator for the outer collection (suits)
                //After you run out of suits, the loop throws a NoSuchElementException.
                deck.add(new Card(i.next(),j.next()));
            }
        }
    }
}
