public class Square {
    public static boolean isSquare(int n) {
        if (n < 0){
            return false;
        }

        if (n == 0){
            return true;
        }

        double y = Math.sqrt(n);
        int x = (int)(y);

        if ((n % x == 0) && (n / x == x)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        isSquare(-4);
    }

}
