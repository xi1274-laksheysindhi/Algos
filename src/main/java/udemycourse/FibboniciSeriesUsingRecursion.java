package udemycourse;

public class FibboniciSeriesUsingRecursion {
    public static  int[] findFibbonicciSeriesUsingIteration(int num) {
       int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i =2; i <= num; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }

    public static  int[] findFibbonicciSeriesUsingTailRecursion(int num, int[] arr) {

       if(num == 0) {
           arr[0] = 0;
           return arr;

       }

       if(num == 1) {
           arr[1] = 1;
           return arr;
       }



         findFibbonicciSeriesUsingTailRecursion(num-1, arr);
         findFibbonicciSeriesUsingTailRecursion(num-2, arr);
         arr[num] = arr[num-1]+arr[num-2];
         return arr;


    }

//    public static  int findFibbonicciSeriesUsingTailRecursion(int num, int sum) {
//
//        if(num == 0) {
//            return sum;
//        }
//
//        sum = sum+num;
//
//        return findFibbonicciSeriesUsingTailRecursion(num-1, sum);
//
//
//    }




    public static void main(String[] args) {
        System.out.println(findFibbonicciSeriesUsingIteration(5));
        System.out.println(findFibbonicciSeriesUsingTailRecursion(5, new int[6]));


//        System.out.println(findSumUsingHeadRecursion(5));
//        System.out.println(findSumUsingTailRecursion(5, 0));


    }
}
