package string;

public class ReverseWordsInAStringIII557 {

    public static String reverseWordsInString(String string) {
        String newString = "";
        String[] s = string.split(" ");
        for(int i = 0; i < s.length ; i++) {
            String concatString = "";
            for(int j = s[i].length()-1 ; j >= 0; j--) {
                concatString = concatString + s[i].charAt(j);
            }
            newString = ("".equalsIgnoreCase(newString) ? concatString  : newString + " " + concatString);
        }
        return newString;
    }

    public static void main(String[] args) {
        String string = "Let's take LeetCode contest";
        string = reverseWordsInString(string);
        System.out.println(string);
    }

}
