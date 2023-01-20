import java.util.ArrayList;
import java.util.List;


public class SqInRect {

        public static List<Integer> sqInRect(int lng, int wdth) {
            // your code

            double product = lng * wdth;
            double prod = 1;
            List<Integer> arr = new ArrayList<>();

            if(lng == wdth){
                return null;
            }


            while (prod != 0) {
                double testValue = Math.sqrt(product);
                prod =  Math.floor(testValue);
                int value = (int)prod;
                arr.add(value);
                product = product - Math.pow(prod,2);
            }
            if(arr.get(arr.size()-1) == 1) {
                arr.add(1);
                System.out.println(arr);
            }

            arr.remove(arr.size()-1);
            System.out.println(arr);
            return arr;
        }

    public static void main(String[] args) {
            sqInRect(5,8);

    }
}
