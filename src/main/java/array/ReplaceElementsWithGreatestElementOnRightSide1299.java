package array;

public class ReplaceElementsWithGreatestElementOnRightSide1299 {

    public static int[] replaceElementsWithGreatestElementOnRightSide(int[] arr) {
        int[] arr1 = new int[arr.length];

        // looping the input array arr to iterate for all values
        for(int i = 0; i < arr.length-1 ; i++) {

            // lets take always next element is greatest like at 0 th position 18 is greatest
            // replacing 17 with 18
            arr1[i] = arr[i+1];
            // now for loop again to compare 18 with rest values till last
            for(int j = i+1; j < arr.length ; j++) {
            // if some value is greater than 18 then replace else leave
                if(arr[j] > arr1[i]) {
                    arr1[i] = arr[j];
                }
            }

        }

        // making last value as -2
        arr1[arr.length-1] = -1;
        return arr1;
    }

    public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};
        System.out.print(replaceElementsWithGreatestElementOnRightSide(arr));

    }
}
