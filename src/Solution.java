import java.util.ArrayList;
public class Solution {
    public static double solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        double answer = 0.0;

        double acc = 0.0;
        double sum = 0.0;
        for (int i = 0; i < arr1.length; i++) {
            int holder = arr1[i] - arr2[i];
            newArr.add(holder);
        }
        System.out.println(newArr);
        for (int x:newArr) {
            sum += Math.pow(x,2);
        }
        return sum/arr1.length;
    }

    public static void main(String[] args) {
        int[] oneArr = {10, 20, 10, 2};
        int[] twoArr = {10, 25, 5, -2};
        solution(oneArr,twoArr);
    }
}
