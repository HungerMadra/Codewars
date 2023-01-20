//The function must accept a non-negative integer. If it is zero, it just returns "now".
// Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
public class TimeFormatter {
    public static String formatDuration(int seconds) {
            int count = 0;
            int hourCount = 0;
            String time = "";

            if (seconds == 0){
                System.out.println("now");
                return "now";
            }
            if (seconds < 60){
                System.out.println(seconds + " seconds");
                return seconds + " seconds";
            }

            for (int i = 1; i <= seconds ; i++) {
                if(i % 60 == 0){
                    count++;
                }
            }
            if (count < 60){
                System.out.println(count);
                System.out.println(count % 60);
                System.out.println(count + " minute " + (count % 60) + " seconds");
                return count + " minute " + (count % 60) + " seconds";
            }
             if ((count >= 60) && (count < 1440) ){
                 if(count % 60 == 0){
                     hourCount++;
                 }
                 System.out.println(hourCount + " hours " + (count % 60) + " minutes");
                 return hourCount + " hours " + (count % 60) + " minutes";
           }

            // your code goes here
            return null;
          }

    public static void main(String[] args) {
        formatDuration(600);
    }
    }
