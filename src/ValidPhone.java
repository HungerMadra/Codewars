public class ValidPhone {
    public static boolean validPhoneNumber(String phoneNumber) {
        char[] array = phoneNumber.toCharArray();
        int count = 0;
        // TODO: Return whether phoneNumber is in the proper form
        if (array.length == 14) {
            count++;
        }
        if (array[0] == '(') {
            count++;
        }
        if (array[4] == ')') {
            count++;
        }
        if (array[5] == ' ') {
            count++;
        }
        if (array[9] == '-') {
            count++;
        }
        if (Character.isDigit(array[1]) && Character.isDigit(array[2]) && Character.isDigit(array[3])
                && Character.isDigit(array[6]) && Character.isDigit(array[7]) && Character.isDigit(array[8])
                && Character.isDigit(array[10]) && Character.isDigit(array[11]) && Character.isDigit(array[12])
                && Character.isDigit(array[13])) {
            count++;
        }
        if (count == 6) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

        public static void main (String[]args){
            //validPhoneNumber("(123) 456-7890");
            //validPhoneNumber("(1111)555 2345");
            validPhoneNumber("(098) 123 4567");

    }
}
