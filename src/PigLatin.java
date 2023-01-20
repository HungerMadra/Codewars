import java.util.ArrayList;
    public class PigLatin {
        public static String pigIt(String str) {

            ArrayList<String> work = new ArrayList<String>();
            ArrayList<String> finalWork = new ArrayList<String>();
            String[] newIsh = str.split(" ");


            for (String word:newIsh) {
                work.add(word + word.charAt(0) + "ay");
            }

            for (String word: work) {
                String piggy = word.substring(1, word.length());
                finalWork.add(piggy);
            }


            for (int i = 0; i < finalWork.size(); i++) {
                if((finalWork.get(i).charAt(0) == '!') || (finalWork.get(i).charAt(0) == ',') ||
                        (finalWork.get(i).charAt(0) == '.') || (finalWork.get(i).charAt(0) == '?')) {
                    finalWork.add(String.valueOf(finalWork.get(i).charAt(0)));
                    finalWork.remove(finalWork.get(i));
                }

            }
            String csv = String.join(" ", finalWork);
            System.out.println(csv);
            return str;
        }

        public static void main(String[] args) {
            pigIt("Pig latin is cool !");
        }
        }


