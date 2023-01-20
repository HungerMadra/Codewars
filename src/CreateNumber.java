//Write a function that accepts an array of 10 integers (between 0 and 9),
// that returns a string of those numbers in the form of a phone number.
public class CreateNumber {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String holder = "(";
        for (int i = 0; i < 3; i++) {
            holder += numbers[i];
        }
        holder += ")";
        holder += " ";
        for (int i = 3; i < 6; i++) {
            holder += numbers[i];
        }
        holder += "-";
        for (int i = 6; i < 10; i++) {
            holder += numbers[i];
        }
        return holder;
    }

    public static void main(String[] args) {
        int[]num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        createPhoneNumber(num);
    }
}
