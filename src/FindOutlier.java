public class FindOutlier {
        static int find(int[] integers){
            int count = 0;
            int found = 0;

            for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0){
                count++;
            }
            }

            if (count > 1){
                for (int i = 0; i < integers.length; i++) {
                    if(integers[i] % 2 != 0){
                        System.out.println(integers[i]);
                        found += integers[i];
                    }
                }
            }
            if (count < 2){
                for (int i = 0; i < integers.length; i++) {
                    if(integers[i] % 2 == 0){
                        found += integers[i];
                    }
                }
            }

            return found;
        }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 11, 13};
        find(arr);
    }
}

