public class WordBetween {
    public static void main(String[] args) {
        String word = "banana";

        boolean result = word.compareToIgnoreCase("apple") >= 0
                       && word.compareToIgnoreCase("mango") <= 0;

        System.out.println(result);
    }
}