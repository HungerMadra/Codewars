public class BraceChecker {
    public static boolean isValid(String braces) {
        // Add code here
        int length = braces.length();
        if (length < 5 && braces.charAt(0) == braces.charAt(length - 1)) {
            System.out.println(true);
        }
         /*   if (length == 4 && braces.charAt(0) == braces.charAt(length-1) &&
                    braces.charAt(1) == braces.charAt(length-2)){
                System.out.println(true);
            }

            if (length == 6 && braces.charAt(0) == braces.charAt(length-1)  &&
                    braces.charAt(1) == braces.charAt(length-2) &&
                    braces.charAt(2) == braces.charAt(length-3)){
                System.out.println(true);
            }
            return false;
        } */
        return false;
    }
    public static void main (String[]args){
        isValid("()");
    }
}
