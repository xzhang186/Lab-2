//Assignment 02 Xiaocheng Zhang
import java.util.Arrays;

public class twoSum {
    //Build the number array and the sum of two numbers
    public static int[] num = {7, 23, 65, 45, 93, 39};
    public static int sum = 88;


    public static int[] twoSum(int[] num, int sum) {
        boolean get = false;
        int totall;
        //This loop is for check every element in the Array.
        for (int x = 0; x<num.length; x++) {
            totall = sum - num[x];
            //This loop is for found the matching number with the current element.
            for (int y = 0; y<num.length; y++) {
                //Break the loop when the matching number is found.
                if (get==true){
                    break;
                }
                //exclude the case of use the same element twice
                if (x==y){
                    continue;
                }
                if (num[y] == totall)  {
                    get = true;
                    System.out.println("Two numbers: [" + x + ", " + y + "]");
                }
            }
        }
        if (get == false) {
            System.out.println(-1);
        }
        return num;
    }
    //main function
    public static void main(String[] args) {
        System.out.println("Given nums = " + Arrays.toString(num));
        System.out.println("target = " + Integer.toString(sum));
        twoSum(num, sum);

    }

}