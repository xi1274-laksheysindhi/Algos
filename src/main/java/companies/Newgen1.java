package companies;

public class Newgen1 {

    public static void main(String[] args) {
        int n = 5;
        int dishes[] = new int[]{-1, -9, 0, 5, -7};
        int dishes2[] = new int[]{-1, 3, 4};
        System.out.println(findMaxLikeSumCoefficient(dishes, 1, 0));
    }

    public static int findMaxLikeSumCoefficient(int dishes[], int counter, int index) {
        if (index == dishes.length) {
            return 0;
        }
        if (dishes[index] <= 0) {
            return Math.max(
                    dishes[index] * counter + findMaxLikeSumCoefficient(dishes, counter + 1, index + 1),
                    findMaxLikeSumCoefficient(dishes, counter, index + 1)
            );
        } else {
            return dishes[index] * counter + findMaxLikeSumCoefficient(dishes, counter + 1, index + 1);
        }
    }

}
