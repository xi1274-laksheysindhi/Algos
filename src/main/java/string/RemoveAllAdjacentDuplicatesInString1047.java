package string;

public class RemoveAllAdjacentDuplicatesInString1047 {

    static String removeAllAdjacentDuplicatesInString1047(String s, int position, int length) {

        if("".equalsIgnoreCase(s) || position == length-1) {
       return s;
        }

        if(s.charAt(position) == s.charAt(position+1)) {
            StringBuilder sb = new StringBuilder(s);
            s = sb.deleteCharAt(position).deleteCharAt(position).toString();
            position = position == 0 ? 1 : position;
            return removeAllAdjacentDuplicatesInString1047(s, position-1, s.length());
        }

        return removeAllAdjacentDuplicatesInString1047(s, position+1, s.length());


    }

    public static void main(String[] args) {
        String s = "aababaab";
        removeAllAdjacentDuplicatesInString1047(s, 0, s.length());
    }

}
