package geeksAmazonSDECourse.arrays;

public class Thirdlargestelement {

    static long thirdLargest(Long a[]) {
        // Your code here

        Long first = a[0];
        Long second = -1L;
        Long third = -1L;
        for(int i=1; i < a.length; i++) {

            if(first < a[i]) {
                third = second;
                second = first;
                first = a[i];

            } else if(second < a[i]) {
                third = second;
                second = a[i];

            } else if(third < a[i]) {
                third = a[i];
            }
        }

        return third;
    }

    public static void main(String[] args) {
        Long[]  arr = {7L, 5L, 10L, 18L, 2L};
        thirdLargest(arr);
    }
}
