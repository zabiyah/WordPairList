public class WordPair {
    /** Constructs a WordPair object. */
    private String first;
    private String second;
    public WordPair(String first, String second) {
        /* implementation not shown */ }
        public String toString(){
            return "(\""+first+"\",\""+second+"\")";
        }
    /** Returns the first string of this WordPair object. */
    public String getFirst() {
      return first; }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
       return second; }
}