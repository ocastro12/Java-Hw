public class AppleSubstring {
    public static void main(String[] args) {
        String text = "I like Apple pie";

        String lowerText = text.toLowerCase();
        int position = lowerText.indexOf("apple");

        String result = text.substring(position);
        System.out.println(result);
    }
}