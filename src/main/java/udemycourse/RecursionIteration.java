package udemycourse;

public class RecursionIteration {


    public static  int findSumUsingIteration(int num) {

            int sum = 0;
            for(int i =0; i<= num; i++) {
                sum = sum+i;
            }
            return sum;
    }

    public static  int findSumUsingHeadRecursion(int num) {

        if(num == 0) {
            return 0;
        }

       return findSumUsingHeadRecursion(num-1)+num;


    }

    public static  int findSumUsingTailRecursion(int num, int sum) {

        if(num == 0) {
            return sum;
        }

        sum = sum+num;

        return findSumUsingTailRecursion(num-1, sum);


    }




    public static void main(String[] args) {
        System.out.println(findSumUsingIteration(5));
        System.out.println(findSumUsingHeadRecursion(5));
        System.out.println(findSumUsingTailRecursion(5, 0));


    }
}
