import java.util.ArrayList;
public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for(int i =0; i<words.length-1;i++){
            for(int j = i+1; j<words.length; j++){
                WordPair w = new WordPair(words[i],words[j]);
                allPairs.add(w);
            }
        }
        }

    /**
     * Returns the number of matches as described in part (b).
     */
    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }

    public int numMatches() {
        int matches =0;
    for(WordPair w :allPairs){
        if(w.getFirst().equals((w.getSecond()))) matches++;
    } 
    return matches;}
}