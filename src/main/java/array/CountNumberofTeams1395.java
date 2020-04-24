package array;

public class CountNumberofTeams1395 {
    public static void main(String[] args) {
        int[] rating = {2, 5, 3, 4, 1};
        numTeams(rating);
    }

    public static int numTeams(int[] rating) {

        int[] greater = new int[rating.length];
        int[] smaller = new int[rating.length];

        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[j] > rating[i]) greater[i]++;
                if (rating[j] < rating[i]) smaller[i]++;
            }
        }
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[j] > rating[i]) {
                    count += greater[j];
                }
                if (rating[j] < rating[i]) {
                    count += smaller[j];
                }
            }
        }
        return count;

    }
}
