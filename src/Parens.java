public class Parens {
        public static boolean validParentheses(String parens) {
            int countA = 0;
            int countB = 0;
            //Put code below
            char[] check = parens.toCharArray();
            for (char x: check) {
               if (x == '('){
                   countA++;
               }
                if (x == ')'){
                    countB++;
                }
            }
            if (countA == countB) {
                return true;
            }
            return false;
        }

}
