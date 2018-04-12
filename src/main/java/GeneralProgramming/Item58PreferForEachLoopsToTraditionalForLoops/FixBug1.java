package GeneralProgramming.Item58PreferForEachLoopsToTraditionalForLoops;

import java.util.*;

/**
 * Created by wangcheng  on 2018/4/12.
 */
public class FixBug1 {
    public static void main(String[] args){
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<>();
        // Fixed, but ugly - you can do better!
        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            Suit suit = i.next();
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext();){
                deck.add(new Card(suit, j.next()));
            }
        }

        //Preferred idiom for nested iteration on collections and arrays
        for(Suit suit: suits){
            for(Rank rank : ranks){
                deck.add(new Card(suit,rank));
            }
        }
    }
}
