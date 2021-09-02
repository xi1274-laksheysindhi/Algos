package companies;

public class CventDiverseString {

    public static String longestDiverseString(int a, int b, int c) {
        int sum = a+b+c;

        StringBuilder sb = new StringBuilder();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for(int i = 0; i < sum; i++) {
            if ((a >= b && a >= c && countA != 2) || ((countB == 2  || countC == 2) && a > 0))  {
                sb.append("a");
                a--;
                countA++;
                countB = 0;
                countC = 0;
            } else if ((b >= a && b >= c && countB != 2) || ((countA == 2  || countC == 2) && b > 0)) {
                sb.append("b");
                b--;
                countB++;
                countA = 0;
                countC = 0;
            } else if ((c >= a && c >= b && countC != 2) || ((countA == 2  || countB == 2) && c > 0)) {
                sb.append("c");
                c--;
                countC++;
                countA = 0;
                countB = 0;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        longestDiverseString(0,1,8);
    }
}
