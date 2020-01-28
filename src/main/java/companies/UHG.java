package companies;

public class UHG {


    public static String winner(String erica, String bob) {
        // Write your code here
        int ericaScore = 0;
        int bobScore = 0;
        for(int i = 0; i < erica.length(); i++) {
            ericaScore =   erica.charAt(i) == 'E' ? ericaScore+1
                    : erica.charAt(i) == 'M' ? ericaScore+3
                    : erica.charAt(i) == 'H' ? ericaScore+5 : 0;
        }
        for(int i = 0; i < erica.length(); i++) {
            bobScore =   bob.charAt(i) == 'E' ? bobScore+1
                    : bob.charAt(i) == 'M' ? bobScore+3
                    : bob.charAt(i) == 'H' ? bobScore+5 : 0;
        }

      return ericaScore > bobScore ? "Erica" : bobScore > ericaScore ? "Bob" : "Tie";


    }

    public static void main(String[] args) {
        winner("EHH", "EME");
    }
}
