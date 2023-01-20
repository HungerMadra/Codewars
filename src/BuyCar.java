import java.util.Arrays;
public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth)
    {
       int time = 0;
       int totalSavings = 0;

       if (startPriceOld >= startPriceNew){
           Math.round(time);
           Math.round(totalSavings);
           Math.round(startPriceOld);
           Math.round(startPriceNew);
           return new int[] {time,(startPriceOld - startPriceNew)};
       }

       while (totalSavings + startPriceOld < startPriceNew){
           //Increment time by 1
           time++;

           //Is Time mod 2 equal to zero ??
           if (time % 2 == 0){
               totalSavings += savingperMonth;
               percentLossByMonth = percentLossByMonth + .5;
               double rateThree = percentLossByMonth * .01;
               startPriceOld -= startPriceOld * rateThree;
               Math.round(startPriceOld);
               startPriceNew -= startPriceNew * rateThree;
               Math.round(startPriceNew);
           }

           //if time mod two is not zero
           if (time % 2 != 0) {

               //totalSavings is itself plus savingsPerMonth
               totalSavings = totalSavings + savingperMonth;


               //Initialize rate
               double rate = percentLossByMonth * .01;

               startPriceOld -= startPriceOld * rate;
               Math.round(startPriceOld);
               startPriceNew -= startPriceNew * rate;
               Math.round(startPriceNew);
           }

       }

        return new int[]{time, (totalSavings + startPriceOld - startPriceNew)};
    }

    public static void main(String[] args) {
        nbMonths(2000, 8000, 1000, 1.5);
    }
}
